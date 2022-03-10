package ch8;

public class MyException extends Exception {
    private final int ERR_CODE;

    MyException(String message, int ERR_CODE) {
        super(message);
        this.ERR_CODE = ERR_CODE;
    }

    MyException(String msg) {
        this(msg, 100);
    }

    public int getERR_CODE() {
        return ERR_CODE;
    }
}
