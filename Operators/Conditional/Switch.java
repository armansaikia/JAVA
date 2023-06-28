package JAVA.Operators.Conditional;

public class Switch {
    public static void main(String args[]){

        int n=5;
        switch(n){


        case 1 :
        System.out.println("MONDAY");

        case 2:
        System.out.println("TUESDAY");


        case 3:
        System.out.println("WEDNESDAY");

        case 4:
        System.out.println("THURSDAY");

        case 5:
        System.out.println("FRIDAY");  // It will start from here OUTPUT - FRIDAY SATURDAY SUNDAY INVALID DAY but we will use break to come out of the block

        case 6:
        System.out.println("SATURDAY");

        case 7:
        System.out.println("SUNDAY");

        default:
        System.out.println("INVALID DAY");


        }

        
        
        

    }
    
}
