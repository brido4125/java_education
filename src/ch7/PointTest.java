package ch7;

public class PointTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(5, 5, 5);
        System.out.println(point3D.toString());

        Point3D defaultInstance = new Point3D();
        System.out.println(defaultInstance.toString());
    }
}
class Point3D extends Point {
    int z;

    public Point3D() {
    }

    public Point3D(int x, int y, int z) {
        super(x,y);//Point(int x,int y) 생성자 호출
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
