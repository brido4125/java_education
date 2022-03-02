package ch8;

public class ExceptionEx2 {
    public static void main(String[] args) {
        try {
            throw new Exception("my exception");
        } catch (Exception e) {
            e.printStackTrace();
            String message = e.getMessage();
            System.out.println("message = " + message);
        }
    }
}
