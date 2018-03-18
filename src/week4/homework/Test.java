package week4.homework;

public class Test {
    public static void main(String[] args) {
        TurboJet turboJet = new TurboJet();
        turboJet.print();
        turboJet.fly();
        turboJet.hypersonicFly();

        TurboJet2 turboJet2 = new TurboJet2();
        turboJet2.print();
        turboJet2.fly();

        RegularGlider regularGlider = new RegularGlider();
        regularGlider.print();
        regularGlider.fly();
        regularGlider.glide();

        PropellerDriver propellerDriver = new PropellerDriver();
        propellerDriver.print();
        propellerDriver.fly();
        propellerDriver.glide();

    }
}
