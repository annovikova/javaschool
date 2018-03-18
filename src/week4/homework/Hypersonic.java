package week4.homework;

public abstract class Hypersonic extends Aircraft{


    public Hypersonic(String type) {
        super(9000, type);
    }

    public void hypersonicFly(){
        System.out.println("Hypersonic Fly");
    }
}
