package com.example.effetivejava.Chap2_GenerateObjectAndDestroy.item1;

public class Car {
    private final String model;
    private final String color;

    // private 생성자
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // 정적 팩터리 메서드
    public static Car of(String model, String color) {
        return new Car(model, color);
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", color=" + color + "]";
    }

    public static void main(String[] args) {
        // 정적 팩터리 메서드
        Car car = Car.of("model", "red");
        System.out.println(car);

        // private 생성자
        Car car2 = new Car("model", "red");
        System.out.println(car2);
    }
}
