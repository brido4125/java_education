package ch6;

class ThisData{
    int x;
}

public class ReferenceReturnEx {
    public static void main(String[] args) {
        ThisData thisData = new ThisData();
        thisData.x = 10;

        ThisData thisData1 = copy(thisData);
        System.out.println("thisData.x = " + thisData.x);
        System.out.println("thisData1.x = " + thisData1.x);
    }

    static ThisData copy(ThisData data) {
        ThisData tmp = new ThisData();
        tmp.x = data.x;
        return tmp;
    }
}
