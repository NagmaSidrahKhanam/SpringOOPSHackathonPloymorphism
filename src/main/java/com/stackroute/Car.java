package main.java.com.stackroute;

public class Car {
    public boolean engine;
    public int wheels;
    public int cylenders;
    public String name;

    public Car(boolean b, int i, int i1, String nano) {
    }



    public void startEngine(){
        System.out.println("Car Enigine Started");
    }
    public void accelerate(){
        System.out.println("Aceelerate Car");
    }
    public void brake(){
        System.out.println("cars brake applied");
    }

    public void Car(boolean engine, int wheels, int cylender, String name)  //CONSTRUCTOR
    {
        this.name=name;
        this.engine=engine;
        this.wheels=wheels;
        this.cylenders=cylender;


    }

    public void display()
    {
        System.out.println("Number of cylenders :  "+ cylenders);
        System.out.println(" Engine "+engine);
        System.out.println("Number of Wheels : "+wheels);
        System.out.println("Name is : "+name);

    }




}
class Honda extends Car {
    public Honda(boolean b, int i, int i1, String nano) {
        super(b, i, i1, nano);
    }

    public void startEngine(){
        System.out.println("Honda's Enigine Started");

    }
    public void accelerate(){
        System.out.println("Aceelerate Honda");
    }
    public void brake(){
        System.out.println("Honda's break applied");
    }
}

class Benz extends Car {
    public Benz(boolean b, int i, int i1, String nano) {
        super(b, i, i1, nano);
    }

    public void startEngine(){
        System.out.println("Benz Enigine Started");
    }
    public void accelerate(){
        System.out.println("Aceelerate Benz");
    }
    public void brake(){
        System.out.println("Benz break applied");
    }
}
class Audi extends Car {
    public Audi(boolean b, int i, int i1, String nano) {
        super(b, i, i1, nano);
    }

    public void startEngine(){
        System.out.println("Audi Enigine Started");
    }
    public void accelerate(){
        System.out.println("Aceelerate Audi");
    }
    public void brake(){
        System.out.println("Audi break applied");
    }
}

