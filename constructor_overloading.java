// Program to implement constructor overloading
public class constructor_overloading {
    String name;
    int age = -1;

    public constructor_overloading(String name) {
        this.name = name;
    }

    public constructor_overloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        constructor_overloading obj1 = new constructor_overloading("Student");
        constructor_overloading obj2 = new constructor_overloading("Student", 20);
        
        obj1.display();
        obj2.display();
    }
}