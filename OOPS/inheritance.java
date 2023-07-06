package JAVA.OOPS;


// single level inherhitance-------------> Triangle uses the property of shape

class Shape {
    public void area() {
        System.out.println("Displaying area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

// multiple inheritance -----------> EqulateralTriangle inherits the properties of Triangle

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

// Hierarchial inheritance------------> derived from parent class
class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.area(5, 8);
        
        Circle circle = new Circle();
        circle.area(3);
        
        EquilateralTriangle eqTriangle = new EquilateralTriangle();
        eqTriangle.area(5);
    }
}
