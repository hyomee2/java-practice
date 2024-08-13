package org.example.chap13_collection.level01.basic;

import java.util.HashMap;
import java.util.Scanner;

public class Application6 {
    public static void main(String[] args) {
        /*
        * 이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 홍길동010-1234-5678
        * 입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>
        * 이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 홍길동 010-1234-5678
        * 추가 완료 : 홍길동 010-1234-5678
        * 이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 유관순 010-9876-5432
        * 추가 완료 : 유관순 010-9876-5432
        * 이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): search
        * 검색 할 이름 : 유관순
        * 유관순씨의 전화번호 : 010-9876-5432
        * 이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): search
        * 검색 할 이름 : 이순신
        * 이순신씨의 번호는 등록 되어 있지 않습니다.
        * 이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): exit*/
        HashMap<String, String> hmap = new HashMap();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요(검색하려면 'search', 종료하려면 'exit'): ");
            String input = sc.nextLine();

            if (input.equals("exit"))
                break;

            else if (input.equals("search")) {
                System.out.print("검색 할 이름 : ");
                String searchName = sc.nextLine();

                if (hmap.get(searchName) == null)
                    System.out.println(searchName + "씨의 번호는 등록되어 있지 않습니다.");
                else
                    System.out.println(searchName + "씨의 전화번호 : " + hmap.get(searchName));
            }
            else {
                try {
                    String[] info = input.split(" ");
                    String name = info[0];
                    String phone = info[1];

                    hmap.put(name, phone);

                    System.out.println("추가 완료 : " + name + " " + phone);
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
                }

            }
        }
    }
}


