package za.ac.cputweekgroup;

public class BigBus extends Vehicle {


    public BigBus(Engine engine)
    {
        this.weightInKilos =3000;
        this.engine =engine;
    }


    @Override
    public void drive() {
        System.out.println("\n The Big bus is driving");
        int horsepower =engine.go();
        reportOnSpeed(horsepower);
    }
}
