package ch7;
class VCR{
    boolean power;
    int counter = 0;
    void power() {
        power = !power;
    }

    void play() {}
}
public class TVCR extends Tv{
    VCR vcr = new VCR();
    int counter = vcr.counter;

    void play() {
        vcr.play();
    }
}
