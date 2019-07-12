package main.java.com.stackroute;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(true,4,2,"nano");

        Honda honda = new Honda(false,4,2,"my car");
        Audi audi = new Audi(true,4,2,"neelus car");
        Benz benz = new Benz(false,4,2,"sidra's car");


        car.startEngine();
        car.accelerate();
        car.brake();

        System.out.println();

        honda.startEngine();
        honda.accelerate();
        honda.brake();

        System.out.println();

        audi.startEngine();
        audi.accelerate();
        audi.brake();

        System.out.println();

        benz.startEngine();
        benz.accelerate();
        benz.brake();

        System.out.println();

        car.display();

    }
}
