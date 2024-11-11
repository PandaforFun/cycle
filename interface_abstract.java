// Program to demonstrate interfaces and abstract classes with Vehicle example
abstract class Vehicle {
    public abstract void move();
    public void fuel() {
        System.out.println("Vehicle is being fueled.");
    }
}

interface Features {
    void gps();
    void airConditioning();
}

class Car extends Vehicle implements Features {
    public void move() {
        System.out.println("Car is moving.");
    }
    
    public void gps() {
        System.out.println("Car has GPS functionality.");
    }
    
    public void airConditioning() {
        System.out.println("Car has air conditioning.");
    }
    
    public void showFeatures() {
        System.out.println("Car features: Moving, GPS, Air Conditioning.");
    }
}

public class interface_abstract {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.move();
        myCar.gps();
        myCar.airConditioning();
        myCar.showFeatures();
        myCar.fuel();
    }
}