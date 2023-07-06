package JAVA.OOPS;


class Student{

    String name;
    int age;

    public void printInfo(){

        System.out.println(this.name);
        System.out.println(this.age);

    }
}

public class example2 {

    public static void main(String args[]){

        Student s1 = new Student();
        s1.name = "Arman";
        s1.age = 30;

        s1.printInfo();

    }
    
}
