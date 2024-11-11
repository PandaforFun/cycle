public class ExceptionHandling {
    public static void main(String[] args) {
        divideNumbers(10, 0);
        parseInteger("123a");
    }
    
    static void divideNumbers(int a, int b) {
        try {
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        }
    }
    
    static void parseInteger(String str) {
        try {
            int num = Integer.parseInt(str);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input for parsing.");
        }
    }
}