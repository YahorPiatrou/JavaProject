package FirstWork;

import java.util.Objects;
import java.util.ArrayList;

public class Engine {
    private int power;

    public Engine(int power) {
        this.power = power;
    }

    // Переопределение методов equals(), hashCode(), toString()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return power == engine.power;
    }

    @Override
    public int hashCode() {
        return Objects.hash(power);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                '}';
    }
}

