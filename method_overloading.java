// Program to illustrate the concept of method overloading
public class method_overloading {
    public void display(String name) {
        System.out.println("Name: " + name);
    }

    public void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        method_overloading obj = new method_overloading();
        obj.display("Student");        
        obj.display("Student", 20);    
    }
}