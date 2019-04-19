package za.ac.cputweekgroup;

public class SmallEngine implements Engine {

    int horsepower;

    public SmallEngine()
    {
        horsepower =100;
    }

    @Override
    public int go() {
        System.out.println("The Small engine is running ");

        return horsepower;
    }
}
