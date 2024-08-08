package org.example.chap09_api.level01.basic;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* <대문자 변환기>
        사용자로부터 입력받은 텍스트에서 공백 문자를 기준으로 앞 글자를 대문자로 만들어서 변환해서 출력하는 프로그램을
        `String`과 `StringBuilder`를 활용하여 구현한다. 전체 단어의 개수도 함께 출력한다.

         ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.print("문자열 입력 : ");

        String str = sc.nextLine();

        // 공백을 기준으로 split
        String[] arr = str.split(" ");

        System.out.print("변환된 문자열: ");

        for (String s : arr) {
            // split 한 뒤 각 단어의 인덱스 0의 문자를 대문자로 변경
            String indexZero = (s.charAt(0) + "").toUpperCase();
            // 인덱스 0(대문자로 바꾼 것) 먼저 append
            sb.append(indexZero);
            // 인덱스 0 제외한 문자열 append
            sb.append(s.substring(1));
            // 공백 append
            sb.append(" ");
        }

        System.out.println(sb);

        System.out.println("총 단어 개수: " + arr.length);
    }
}
