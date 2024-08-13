package org.example.chap13_collection.level01.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Application5 {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            int size = hset.size();
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            String word = sc.nextLine();

            if(word.equals("exit"))
                break;

            hset.add(word);

            if (size == hset.size())
                System.out.println("이미 등록된 단어입니다.");
        }

        Object[] arr = hset.toArray();
        Arrays.sort(arr);

        System.out.print("정렬 된 단어 : [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}
