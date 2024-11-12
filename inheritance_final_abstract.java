// Program to demonstrate inheritance, final, and abstract classes
abstract class Animal {
    abstract void sound();
    public void eat() {
        System.out.println("Eating...");
    }
}

abstract class Bird extends Animal {
    abstract void fly();
}

final class Sparrow extends Bird {
    void sound() {
        System.out.println("Chirp Chirp");
    }
    
    void fly() {
        System.out.println("Flying high");
    }
}

class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.eat();
        sparrow.sound();
        sparrow.fly();
    }
}
