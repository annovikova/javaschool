package week4.inheritance;

public class Truck extends Vehicle {

    private long loadingCapacity;

    @Override
    public void beep() {
        System.out.println("Truck Beeped loudly!");
    }
}
