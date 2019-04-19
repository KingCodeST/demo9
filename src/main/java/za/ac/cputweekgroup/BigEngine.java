package za.ac.cputweekgroup;

public class BigEngine implements Engine {

    int horsepower;

    public BigEngine()
    {
        horsepower =350;
    }

    @Override
    public int go() {
        System.out.println("This big engine is running ");
        return horsepower;
    }
}
