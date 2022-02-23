abstract class Shape {
    String name;
    int area;
    int perimeter;

    Shape() {
        name = "GenericShape";
        area = 0;
        perimeter = 0;
    }

    Shape(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    abstract void calculateArea();

    abstract void calculatePerimeter();

    abstract void draw();

    @Override
    public String toString() {
        return "[ Area: " + area + ", Perimeter: " + perimeter + "]";
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    Rectangle(String name, int length, int breadth) {
        super(name);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    void calculatePerimeter() {
        this.perimeter = 2 * (length + breadth);
    }

    @Override
    void calculateArea() {
        this.area = length * breadth;
    }

    @Override
    public String toString() {
        return "Rectangle " + super.toString();
    }
}

class Square extends Shape {
    int side;

    Square(String name, int side) {
        super(name);
        this.side = side;
    }

    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    void calculatePerimeter() {
        this.perimeter = 4 * side;
    }

    @Override
    void calculateArea() {
        this.area = side * side;
    }

    @Override
    public String toString() {
        return "Square " + super.toString();
    }
}

class Circle extends Shape {
    int radius;

    Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    void calculatePerimeter() {
        this.perimeter = (int) (2 * 3.14 * radius);
    }

    @Override
    void calculateArea() {
        this.area = (int) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Circle " + super.toString();
    }
}

class Geometry {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Rectangle", 4, 5);
        Shape square = new Square("Square", 4);
        Shape circle = new Circle("Circle", 4);

        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        square.calculateArea();
        square.calculatePerimeter();
        circle.calculateArea();
        circle.calculatePerimeter();

        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(circle);

    }
}