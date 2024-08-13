package org.example.chap13_collection.level01.basic;

import java.util.HashSet;
import java.util.Scanner;

public class Application4 {
    /*
    학생들의 ID를 관리하는 프로그램을 작성하세요.
    이미 존재하는 ID는 추가하지 않으며, 전체 학생 ID를 출력합니다.
    학생 ID 입력('exit' 입력 시 종료): hello
    ID가 추가 되었습니다.
    학생 ID 입력('exit' 입력 시 종료): java
    ID가 추가 되었습니다.
    학생 ID 입력('exit' 입력 시 종료): programmer
    ID가 추가 되었습니다.
    학생 ID 입력('exit' 입력 시 종료): java
    이미 등록 된 ID입니다.
    학생 ID 입력('exit' 입력 시 종료): exit
    모든 학생의 ID : [java, programmer, hello]*/
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
            String id = sc.next();

            if (id.equals("exit"))
                break;

            int size = hset.size();
            hset.add(id);
            if (size != hset.size())
                System.out.println("ID가 추가 되었습니다.");
            else
                System.out.println("이미 등록된 ID입니다.");


        }

        System.out.print("모든 학생의 ID : [");
        Object[] arr = hset.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}
