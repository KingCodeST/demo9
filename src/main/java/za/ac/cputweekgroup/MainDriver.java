package za.ac.cputweekgroup;

public class MainDriver {

    public static void main(String[] args)
    {
        Vehicle vehicle =new BigBus(new SmallEngine());
        vehicle.drive();
        vehicle.setEngine(new BigEngine());
        vehicle.drive();

        vehicle =new SmallCar(new SmallEngine());
        vehicle.drive();
        vehicle.setEngine(new BigEngine());
        vehicle.drive();



    }

}
