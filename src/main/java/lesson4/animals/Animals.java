package lesson4.animals;

import java.util.Objects;

public abstract class Animals {
    private String name;

    public Animals(String name) {
        this.name = name;
    }
    public abstract void greets();

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
