package ch3;

public class OperatorEx32 {
    public static void main(String[] args) {
        int x,y,z;
        int absX,absY,absZ;

        x = 10;
        y = -5;
        z = 0;

        absX = x >= 0 ? x : -x;
        absY = y >= 0 ? x : -x;
        absZ = z >= 0 ? x : -x;

        System.out.println("absX = " + absX);
        System.out.println("absY = " + absY);
        System.out.println("absZ = " + absZ);
    }
}
