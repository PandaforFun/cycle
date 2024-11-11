public class StringHandling {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // i. String length & Concatenation
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Concatenation: " + str1 + " " + str2);

        // ii. Character Extraction
        System.out.println("Character at index 1: " + str1.charAt(1));

        // iii. String Comparison
        System.out.println("Comparison (str1 vs str2): " + str1.equals(str2));
        System.out.println("Ignore case comparison: " + str1.equalsIgnoreCase("hello"));

        // iv. Searching and Modifying String
        System.out.println("Index of 'l' in str1: " + str1.indexOf('l'));
        System.out.println("Modified str1: " + str1.replace('l', 'p'));
    }
}