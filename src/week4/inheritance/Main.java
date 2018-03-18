package week4.inheritance;

import week4.utils.TruckFactory;

public class Main {
    public static void main(String[] arg) {
        Car car = new Car();
        final TruckFactory truck = new TruckFactory();

        car.setup();
   //    truck.setup();

    }
}
