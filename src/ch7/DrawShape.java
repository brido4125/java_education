package ch7;

public class DrawShape {
    public static void main(String[] args) {
        Point[] p = {
                new Point(100, 100),
                new Point(140, 50),
                new Point(200,100)
        };
        Triangle triangle = new Triangle(p);
        Circle circle = new Circle(new Point(50, 50), 13);

        triangle.draw();
        circle.draw();
    }
}

class Shape{
    String color = "black";

    void draw() {
        System.out.printf("[color=%s] \n", color);
    }
}

class Point{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point() {
        this(0, 0);
    }

    String getXY() {
        return "(" + "x" + "," + "y" + ")";
    }
}

class Circle extends Shape {
    Point center;
    int radius;

    Circle() {
        this(new Point(0, 0), 100);
    }

    public Circle(Point center,int r) {
        this.center = center;
        this.radius = r;
    }

    void draw() {
        System.out.printf("[center=(%d,%d) / radius = %d] \n",center.x,center.y,radius);
    }
}

class Triangle extends Shape {
    Point[] p = new Point[3];

    Triangle(Point[] p) {
        this.p = p;
    }

    void draw() {
        System.out.printf("[p1=%s,p2=%s,p3=%s,color=%s] \n",p[0].getXY(),p[1].getXY(),p[2].getXY(),this.color);
    }
}