interface Shape {
    void draw();
}

interface Polygon extends Shape {

    double getArea();

    boolean isPolygon();

    double getPerimeter();
}

class Line implements Shape {

    @Override
    public void draw() {
        System.out.println("I am a " + this.getClass().getName());
    }
}

class Triangle implements Polygon {
    double area;
    double perimeter;
    int noOfSides;
    int s1;
    int s2;
    int s3;

    Triangle(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.noOfSides = 3;
        this.area = 0;
        this.perimeter = 0;
    }

    @Override
    public void draw() {
        System.out.println("I am of " + this.getClass().getName() + "Shape");
    }

    @Override
    public double getPerimeter() {
        perimeter = s1 + s2 + s3;
        return perimeter;
    }

    @Override
    public double getArea() {
        area = Math.sqrt((perimeter / 2 * (perimeter / 2 - s1) * (perimeter / 2 - s2) * (perimeter / 2 - s3)));
        return area;
    }

    @Override
    public boolean isPolygon() {
        return true;
    }

    @Override
    public String toString() {
        return "Triangle [area=" + area + ", perimeter=" + perimeter + "]";
    }

}

class Rectangle implements Polygon {
    double area;
    double perimeter;
    int noOfSides;
    int l;
    int b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
        this.noOfSides = 4;
        this.area = 0;
        this.perimeter = 0;
    }

    @Override
    public void draw() {
        System.out.println("I am of " + this.getClass().getName() + "Shape");
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * (l + b);
        return perimeter;
    }

    @Override
    public double getArea() {
        area = l * b;
        return area;
    }

    @Override
    public boolean isPolygon() {
        return true;
    }

    @Override
    public String toString() {
        return "Rectangle [area=" + area + ", perimeter=" + perimeter + "]";
    }
}

public class Geometry {
    public static void main(String[] args) {
        Shape line = new Line();
        Polygon triangle = new Triangle(3, 4, 5);
        Polygon rectangle = new Rectangle(4, 5);

        line.draw();
        double tPerimeter = triangle.getPerimeter();
        double tArea = triangle.getArea();
        System.out.println("Triangle area and perimeter: " + tArea + " and " + tPerimeter);
        triangle.draw();
        System.out.println();

        double rArea = rectangle.getArea();
        double rPerimeter = rectangle.getPerimeter();
        System.out.println("Rectangle area and perimeter: " + rArea + " and " + rPerimeter);
        rectangle.draw();
    }
}
