package org.example.chap08_polymorphism;

public class Circle extends Shape implements Resizable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    /* 넓이 계산 메소드 */
    double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    /* 둘레 계산 메소드 */
    double calculatePerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }


}
