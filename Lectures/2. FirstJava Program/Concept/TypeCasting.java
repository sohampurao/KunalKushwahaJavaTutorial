public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Typecasting (Widening Conversion)
        int num = 100;
        double doubleNum = num;  // int is automatically converted to double
        System.out.println("Implicit Typecasting:");
        System.out.println("int value: " + num);
        System.out.println("double value: " + doubleNum);

        // Explicit Typecasting (Narrowing Conversion)
        double decimalNum = 99.99;
        int intNum = (int) decimalNum;  // double is explicitly converted to int
        System.out.println("\nExplicit Typecasting:");
        System.out.println("double value: " + decimalNum);
        System.out.println("int value: " + intNum);
    }
}
