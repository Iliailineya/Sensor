package app;

public class Main {

    public static void main(String[] args) {
        runDemo();
    }

    public static void runDemo(){
        Substance substance = new Substance();

        new ColorSensor(substance);
        new WeightSensor(substance);

        System.out.println("Substance temperature +25 ");
        substance.setState(25);

        System.out.println("Substance temperature -5 ");
        substance.setState(-5);
    }
}
