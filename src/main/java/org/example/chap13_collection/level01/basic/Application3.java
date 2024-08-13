package org.example.chap13_collection.level01.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Application3 {
    /*대기 줄을 시뮬레이션하는 프로그램을 작성하세요.
    고객이 줄을 서면 대기열에 추가되고, 서비스가 완료되면 대기열에서 제거합니다.*/
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("대기 고객 이름 입력(다른 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            String name = sc.next();

            if (name.equals("next")) {
                if (que.isEmpty())
                    System.out.println("대기 고객이 없습니다.");
                else
                    System.out.println(que.poll() + " 고객님 차례입니다.");
            }
            else if (name.equals("exit"))
                break;
            else {
                que.offer(name);
                System.out.println(name + " 고객님 대기 등록 되었습니다.");
            }
        }
    }
}
