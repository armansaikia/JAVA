// used to convert a value of a larger data type to a value of a smaller data type. 
//It requires explicit syntax using parentheses and can potentially result in loss of information or precision.

package JAVA.conversionandcasting;

 class castingExplicit {

    public static void main(String[] args) {
        double num1 = 3.14;
        int num2 = (int) num1; // Explicit casting from double to int

        System.out.println("num1: " + num1); // Output: num1: 3.14
        System.out.println("num2: " + num2); // Output: num2: 3
    }
}
    
