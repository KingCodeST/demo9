package za.ac.cputweekgroup;

public class SmallCar extends Vehicle {

    public SmallCar(Engine engine)
    {
        this.weightInKilos =6000;
        this.engine =engine;
    }

    @Override
    public void drive() {
        System.out.println("\n The small car driving ");
        int horsepower =engine.go();
        reportOnSpeed(horsepower);
    }
}
