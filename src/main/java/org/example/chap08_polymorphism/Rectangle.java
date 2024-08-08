package org.example.chap08_polymorphism;

public class Rectangle extends Shape implements Resizable{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    /* 넓이 계산 메소드 */
    double calculateArea() {
        return width * height;
    }

    @Override
    /* 둘레 계산 메소드 */
    double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
    }

}
