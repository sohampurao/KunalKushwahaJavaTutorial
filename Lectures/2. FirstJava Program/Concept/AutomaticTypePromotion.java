public class AutomaticTypePromotion {
    public static void main(String[] args) {
        // Initialize variables of different types
        byte byteValue = 42;
        char charValue = 'A'; // ASCII value of 'A' is 65
        short shortValue = 1024;
        int intValue = 50000;
        float floatValue = 5.67f;
        double doubleValue = .1234;

        // Perform arithmetic operations involving different data types
        double result = (floatValue * byteValue) + (intValue/charValue) - (doubleValue * shortValue);

        // Print the result
        System.out.println("Result: " + result);
    }
}
