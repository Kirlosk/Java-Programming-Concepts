
class Shape{

    public void displayShape() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    private double radius;
    

    public Circle(double radius) {
        this.radius = radius;
    }
    

    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayShape() {
        System.out.println("This is a Circle");
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;
    
   
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
   
    public double area() {
        return length * width;
    }
    
    
    @Override
    public void displayShape() {
        System.out.println("This is a Rectangle");
    }
}


public class Main{
    public static void main(String[] args) {
       
        Circle circle = new Circle(5.0);
        circle.displayShape();
        System.out.println("Area of Circle: " + circle.area());
        
        System.out.println();
       
        Rectangle rectangle = new Rectangle(10.0, 6.0);
        rectangle.displayShape();
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
