
//Logical operator---------> 1. AND  &&     2.OR ||pipe     3.NOT(!)

// AND - if one condition is false then output will be false(priority)   T+T = T ,  T+F= F,   F+T =F,     F+F=F
// OR - if one condition is true then output is true(priority)           T+T = T ,  T+F= T,   F+T =T,     F+F=F
// NOT - reverse if true then false,if false then true



package JAVA.Operators.Logical;

public class Main {

    public static void main(String args[]){

        int a = 30;
        int b=26;
        int x = 33;
        int y= 55;

       // boolean result = a>b && x>y; // False since one is false x>y
       // boolean result = a>b || x>y;  True since one statement is true
         

        boolean result = a>b && x>y;
        System.out.println(!result); //using NOT ! it reverse the result
    }
    
}
