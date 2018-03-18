package week4.inheritance;

public abstract class Vehicle {
    private int color;

    public int getColor() {
        return this.color;
    }

    public abstract void beep();

    public void showedBeep() {
        System.out.println("Base beep!");
    }

    public void setup() {
        this.color = 1;
        beep();
        showedBeep();
    }
}
