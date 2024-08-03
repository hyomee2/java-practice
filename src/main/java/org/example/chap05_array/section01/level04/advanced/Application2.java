package org.example.chap05_array.section01.level04.advanced;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        /* 숫자 야구게임 만들기
         * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
         * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
         * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
         * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
         *
         * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
         * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
         *
         * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
         * 횟수는 차감하지 않는다.
         *
         * -- 프로그램 예시 (난수 7416 의 경우) --
         *
         * 10회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 1234
         * 아쉽네요 0S 2B 입니다.
         * 9회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 5678
         * 아쉽네요 0S 2B 입니다.
         * 8회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 7416
         * 정답입니다.
         * */
        Scanner scanner = new Scanner(System.in);

        // 길이 4의 정수 배열 선언
        int[] baseball = new int[4];

        // 중복되지 않게 랜덤 생성
        for (int i = 0; i < 4; i++) {
            baseball[i] = (int) (Math.random() * 10);
            for (int j = 0; j < i; j++) {
                if (baseball[i] == baseball[j]) {
                    i--;
                    break;
                }
            }
        }

        // 랜덤으로 생성된 숫자가 뭔지 확인하는 코드
        //for (int i = 0; i < 4; i++)
        //  System.out.print(baseball[i] + " ");

        // 프로그램
        for (int i = 0; i < 10; i++) {
            boolean hasDuplicate = false;  // 이중 for문 탈출 코드 작성 시 필요한 변수 선언
            int countS = 0;
            int countB = 0;
            System.out.println((10 - i) + "회 남으셨습니다.");

            System.out.print("4자리 숫자를 입력하세요 : ");
            String num = scanner.next();

            if (num.length() != 4) {
                System.out.println("4자리의 정수를 입력해야 합니다.");
                i--;
                continue;
            }

            for (int j = 0; j < 4; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if ((num.charAt(j) - '0') == (num.charAt(k) - '0')) {
                        System.out.println("중복된 숫자를 입력할 수 없습니다.");
                        hasDuplicate = true;
                        break;  // k가 있는 for문 탈출
                    }
                }
                if (hasDuplicate)
                    break;   // j가 있는 for문 탈출
            }
            if (hasDuplicate) {
                i--;
                continue; // 중복된 숫자를 입력하면, 4자리 정수를 입력하지 않은 경우와 같은 로직으로 처리
            }

            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (baseball[j] == (num.charAt(k) - '0')) {
                        if (j == k) countS++;
                        else countB++;
                    }
                }
            }

            if (countS == 4) {
                System.out.println("정답입니다.");
                break;
            } else {
                System.out.println("아쉽네요 " + countS + "S " + countB + "B 입니다.");
                if (i == 9)
                    System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");
            }
        }
    }
}
