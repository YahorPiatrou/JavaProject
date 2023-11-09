package FirstWork;

import java.util.Objects;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Wheel[] wheels = {new Wheel(18), new Wheel(18), new Wheel(18), new Wheel(18)};
        Engine engine = new Engine(200);
        Car car = new Car("Toyota", engine, wheels);

        car.drive();
        car.refuel();
        car.changeWheel();
        System.out.println("Car brand: " + car.getBrand());
        System.out.println(car.toString());
    }
}