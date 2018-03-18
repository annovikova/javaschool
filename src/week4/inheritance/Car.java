package week4.inheritance;

public class Car extends Vehicle {
    private long passengersCount;

    public void accelerate() {
        System.out.println("Accelerate fast!");
    }

    @Override
    public void beep() {
        System.out.println("Car Beeped!");
    }
}
