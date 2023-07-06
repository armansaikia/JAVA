package JAVA.OOPS;

//Abstraction ---------> Showing user  the things which are importatnt and hiding the unwanted things using the abstract keyword in beginning

abstract class Animal {
    abstract void walk();
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Horse has four legs");
    }
}

class Hen extends Animal {
    public void walk() {
        System.out.println("Hen has two legs");
    }
}

public class abstraction {
    public static void main(String args[]) {

        Horse horse = new Horse();
        horse.walk();

        Hen hen = new Hen();
        hen.walk();

        // but if we create a object Animal and call it will show an runtime error as shown below
        
        Animal animal = new Animal();
        animal.walk();
    }
}

