package JAVA.OOPS;

class Pen{

    String Color; // properties
    String type;

    public void write(){
        System.out.println("Write something"); // function or method-------1

    }
     public void printColor(){
            System.out.println(this.Color); //------------> 2
    }
}

//-------------------------> main function
public class example1 {
    public static void main(String args[]){
        

        // creating a object
        Pen pen1 = new Pen(); //constructor ---> constructor and class name should be same
        pen1.Color ="blue";
        pen1.type="gel";

        //creating a new pen

        Pen pen2 = new Pen();
         pen2.Color ="black";
        pen2.type="ball";


        
        //call the function
        pen1.write();
        pen1.printColor();
        pen2.printColor();
    }
    
}
