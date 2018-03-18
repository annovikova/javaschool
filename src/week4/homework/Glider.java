package week4.homework;

public abstract class Glider extends Aircraft {
    public Glider(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    public void glide(){
        System.out.println("Gliding");
    }
}
