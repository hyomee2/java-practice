package org.example.chap13_collection.level01.basic;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class Application2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String url = "";
        while (true) {
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            url = sc.nextLine();

            if (url.equals("exit"))
                break;

            list.add(url);

            int n = Math.min(list.size(), 5);

            System.out.print("최근 방문 url : [");

            for (int i = list.size() -1; i >= list.size() - n; i--) {
                System.out.print(list.get(i));
                if (i != list.size() - n)
                    System.out.print(", ");
            }
            System.out.println("]");
        }
    }
}
