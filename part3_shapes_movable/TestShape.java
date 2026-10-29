package part3_shapes_movable;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); 
        System.out.println(s1.getArea());
        
        Circle c1 = (Circle)s1; 
        System.out.println(c1.getRadius());

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); 
        System.out.println(s3.getArea());

        Shape s4 = new Square(6.6); 
        System.out.println(s4.getArea());
    }
}
