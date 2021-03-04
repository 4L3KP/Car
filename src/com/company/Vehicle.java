package com.company;

public class Vehicle {
        Color color;
        Size size;
        Engine engine;
    public Vehicle(Color color, Size size, Engine engine){
            this.color = color;
            this.size = size;
            this.engine = engine;

        }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color=" + color +
                ", size=" + size +
                ", engine=" + engine +
                '}';
    }
}
