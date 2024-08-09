package org.example.chap09_api.level01.basic;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        /*
        사용자로부터 입력받은 텍스트에서 단어의 빈도를 계산하고, 가장 자주 등장하는 단어를 출력하는 프로그램을 String과 StringBuilder를 활용하여 구현한다.
        단, 영문자만 대소문자 구분 없이 취급한다.
           ----- 입력 예시 -----
          문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다

          ----- 출력 예시 -----

          ===== 단어 빈도 =====
          hello: 2
          world: 1
          everyone: 1
          가장 빈도 높은 단어 : hello (2 번)
         */
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");

        // 입력받은 문자열에서 영문자 제외 빈 문자열으로 대체 후 모두 소문자로 바꿔준다.
        String input = sc.nextLine().replaceAll("[^a-zA-Z]", " ").toLowerCase();

        // 빈 문자열을 기준으로 문자열을 나누어 array 배열에 넣어준다.
        String[] array = input.split(" ");
        // count는 array2에서 몇 개의 단어가 들어갔는지 의미하는 변수
        int count = -1;
        // array2는 중복되지 않는 문자열이 들어간다.
        String[] array2 = new String[array.length];
        // freq에는 array2의 단어의 횟수가 들어간다. (array2[i] 문자열의 개수가 freq[i]에 들어감)
        int[] freq = new int[array.length];

        for (int i = 0; i  < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (!(array[i].isEmpty())) {  // array[i]가 빈문자열이 아니라면
                    if  (count < 0) {  // count가 0보다 작을 때(즉, array2에 아무 문자열이 없을 때)
                        count++;  // count을 1 늘리고(array2 배열에 문자열 1개가 들어가게 된다는 의미)
                        array2[count] = array[i]; // array2에 array 문자열 복사
                        freq[count]++; // count 인덱스에 문자열이 들어갔으므로 빈도수인 freq을 1 증가시킨다.
                        break; // j 반복문 탈출
                    }
                    else {// array2에 들어간 문자열이 있을 때
                        // (각 인덱스와 비교하여 같은 문자열이 있으면 해당 인덱스의 freq을 증가시키고,
                        // 없다면 array2에 해당 문자열을 추가하고 freq을 증가시킨다.)
                        if (array[i].equals(array2[j])) {
                            freq[j]++;
                            break;
                        }
                        else if (j == array.length - 1){
                            count++;
                            array2[count] = array[i];
                            freq[count]++;
                        }
                    }
                }
            }
        }

        System.out.println("==== 단어 빈도 ====");
        // StringBuilder 이용
        for (int i = 0; i  <= count; i++)
            sb.append(array2[i]).append(": ").append(freq[i]).append("\n");

        sb.append("가장 빈도 높은 단어: ");

        // 가장 빈도가 높은 단어 찾기
        String maxWord = "";
        int max = 0;
        for (int i = 0; i <= count; i++) {
            if (freq[i] >= max) {
                max = freq[i];
                maxWord = array2[i];
            }
        }
        sb.append(maxWord).append("(").append(max).append(" 번").append(")");
        System.out.println(sb);
    }
}



