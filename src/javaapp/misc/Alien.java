package javaapp.misc;

public class Alien {
    String name;
    String color;

    public Alien() {
    }

    public Alien(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override  //Object class
    public String toString() {
        return "Alien{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
