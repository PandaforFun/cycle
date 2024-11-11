// Program to implement class mechanism
public class class_mechanism {
    static class MyClass {
        public void method1() {
            System.out.println("This is semester 7th");
        }
 
        public void method2() {
            System.out.println("This is really semester 7th");
        }
    }
 
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();
        obj.method2();
    }
 }
