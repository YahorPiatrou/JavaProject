package FirstWork;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

public class Car {
    private String brand;
    private Engine engine;
    private Wheel[] wheels;

    public Car(String brand, Engine engine, Wheel[] wheels) {
        this.brand = brand;
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        System.out.println("The car is driving");
    }

    public void refuel() {
        System.out.println("The car is refueling");
    }

    public void changeWheel() {
        System.out.println("Changing the car's wheel");
    }

    public String getBrand() {
        return brand;
    }

    // Переопределение методов equals(), hashCode(), toString()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) &&
                Objects.equals(engine, car.engine) &&
                Arrays.equals(wheels, car.wheels);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(brand, engine);
        result = 31 * result + Arrays.hashCode(wheels);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                ", wheels=" + Arrays.toString(wheels) +
                '}';
    }
}

