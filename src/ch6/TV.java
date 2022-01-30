package ch6;

class TV {
    String color;
    boolean power;
    int channel;

    void setPower() {
        power = !power;
    }

    void setChannelUp() {
        ++channel;
    }

    void setChannelDown() {
        --channel;
    }
}
