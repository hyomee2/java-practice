package org.example.level02.normal;

public class Application2 {
    public static void main(String[] args) {
        double korean = 80.5;
        double math = 50.6;
        double english = 70.8;

        System.out.println("총점 : " + (int)(korean + math + english));
        System.out.println("평균 : " + (int)((korean + math + english) / 3));
    }
}
