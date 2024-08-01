package org.example.chap03_method_and_api.level02.normal;


public class Application {
    public static void main(String[] args) {
        RandomMaker randomMaker = new RandomMaker();
        System.out.println(randomMaker.randomNumber(-50, 0));
        System.out.println(randomMaker.randomUpperAlpabet(10));
        System.out.println(randomMaker.rockPaperScissors());
        System.out.println(randomMaker.tossCoin());
    }
}
