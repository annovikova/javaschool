package week4.homework;

public abstract class Aircraft {
    int maxSpeed;
    String type;

    public Aircraft(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public void fly() {
        System.out.println("Fly");
    }

    public void print(){
        System.out.println("Type: " + type + " Max speed: " + maxSpeed);
    }
}
