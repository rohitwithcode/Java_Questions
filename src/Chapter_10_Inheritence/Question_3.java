package Chapter_10_Inheritence;
/*
    Implement a simple "Vehicle" class with properties like make, model, and year.
    Create subclasses for different types of vehicles like "Car," "Motorcycle," and "Truck," each with their own properties and methods.
 */

class Vehicle{
    String make;
    String model;
    int year;
    Vehicle(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }

    public void start(){
        System.out.println("Vehicle is start...");
    }
    public void stop(){
        System.out.println("Vehicle is stop...");
    }
    public void accelerate(){
        System.out.println("Vehicle is accelerate...");
    }
    public void applyBrake(){
        System.out.println("Applying Brake....");
    }
    public void displayInfo(){
        System.out.println("The Vehicle make by : "+make);
        System.out.println("The vehicle model : "+model);
        System.out.println("The vehicle invention year : "+year);
    }
}
class Car extends Vehicle{
    String name;
    String music;
    String horn;

    Car(String make,String model,int year,String name,String music,String horn){
        super(make,model,year);
        this.name = name;
        this.music=music;
        this.horn=horn;
    }

    public void handBrake(){
        System.out.println("Applying hand brake...");
    }
    public void disBrake(){
        System.out.println("Applying dis Brake...");
    }
    public void displayInfoCar(){
        System.out.println("The car name is : "+name);
        System.out.println("The car music is : "+music);
        System.out.println("The car horn is : "+horn);
    }
}

public class Question_3 {
    public static void main(String[] args) {
        Car car=new Car("Mahindra","2010",2003,"Thar","On","Blow");
        car.displayInfo();
        car.displayInfoCar();

        car.start();
        car.accelerate();
        car.applyBrake();

        car.handBrake();
        car.disBrake();
        car.stop();
    }
}
