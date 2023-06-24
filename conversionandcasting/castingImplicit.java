
//Implicit casting

//occurs when a value of a smaller data type is assigned to a variable of a larger data type. 
//In implicit casting, the conversion is done automatically by the Java compiler without requiring any explicit casting syntax.


package conversionandcasting;

public class castingImplicit{

    
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = num1; // Implicit casting from int to double

        System.out.println("num1: " + num1); // Output: num1: 10
        System.out.println("num2: " + num2); // Output: num2: 10.0
    }
}

