package org.example.chap13_collection.level01.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Application1 {
    // 학생들의 점수를 입력받아 저장한 후, 평균 점수를 계산하여 출력하는 프로그램을 작성하세요.
    /*학생 성적 : 100
    추가 입력하려면 y : y
    학생 성적 : 95
    추가 입력하려면 y : Y
    학생 성적 : 66
    추가 입력하려면 y : y
    학생 성적 : 79
    추가 입력하려면 y : n
    학생 인원 : 4
    평균 점수 : 85.0*/
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        String str = "y";

        while(str.equals("y")) {
            System.out.print("학생 성적 : ");
            int score = sc.nextInt();

            list.add(score);

            System.out.print("추가 입력하려면 y : ");
            str = sc.next().toLowerCase();
        }

        System.out.print("학생 인원 : ");
        int num = sc.nextInt();

        for (Integer score : list)
            sum += score;

        System.out.print("평균 점수 : ");
        System.out.print(sum / num);

    }
}
