interface Shape {
    void draw();
}
interface Polygon {
    double area = 0;
    double perimeter = 0;
    double getArea();
    double getPerimeter();
    boolean isPolygon();
}
class Line implements Shape {
    public void draw() {
        System.out.println("I am of Line shape");
    }
}
class Rectangle implements Shape, Polygon {
    int len;
    int breadth;
    Rectangle(int len, int breadth) {
        this.len = len;
        this.breadth = breadth;
    }
    public double getArea() {
        return len * breadth;
    }
    public double getPerimeter() {
        return 2 * (len + breadth);
    }
    public boolean isPolygon() {
        return true;
    }
    public void draw() {
        System.out.println("I am of Rectangle shape");
    }
}
class Triangle implements Shape, Polygon {
    int a, b, c;
    int height;
    Triangle(int a, int b, int c, int height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }
    public double getArea() {
        double ans = 0.5 * b * height;
        return ans;
    }
    public double getPerimeter() {
        return a + b + c;
    }
    public void draw() {
        System.out.println("I am of Triangle shape");
    }
    public boolean isPolygon() {
        return true;
    }
}
public class PolygonShapeInterface {
    public static void main(String args[]) {
        Line line = new Line();
        line.draw();
        Triangle triangle = new Triangle(3, 4, 5, 3);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.isPolygon());
        triangle.draw();
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.isPolygon());
        rectangle.draw();
    }
}