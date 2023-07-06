package JAVA.OOPS;

class Students{


    String name ;
    int age ;


    // 1st function
    public void printInfo(String name){
     System.out.println(name);
    }
    
    //2nd function
    public void printInfo(int age){
     System.out.println(age);
    }
     

    //3rd function
    public void printInfo(String name,int age){
     System.out.println(name + " "+ age);
    }

     // we have seen that we have three function in the same class with same function name is used which is called polymorphism
}

public class polymorphism {

    public static void main(String args[]){

        Students s1 =new Students();

        s1.name = "Arman";
        s1.age = 22;

        s1.printInfo(s1.name,s1.age);

    }
    
}
