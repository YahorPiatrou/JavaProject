package FirstWork;

import java.util.Objects;
import java.util.ArrayList;

public class Wheel {
    private int size;

    public Wheel(int size) {
        this.size = size;
    }

    // Переопределение методов equals(), hashCode(), toString()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return size == wheel.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                '}';
    }
}