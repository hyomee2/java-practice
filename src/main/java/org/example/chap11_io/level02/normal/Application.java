package org.example.chap11_io.level02.normal;

import java.io.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* 여러 개의 텍스트 파일을 하나의 파일로 병합하는 프로그램을 작성한다.
        이 때 BufferedReader와 BufferedWriter를 사용하여 작성한다.
        --- 입출력 예시 ----
        병합할 파일의 개수 입력 : 3
        1 번째 파일 이름 입력 : test.txt
        2 번째 파일 이름 입력 : test2.txt
        3 번째 파일 이름 입력 : test3.txt
        병합 될 파일명 입력 : result.txt
        파일 병합이 완료 되었습니다.

        ---입출력 예시---
        병합할 파일의 개수 입력 : 2
        1 번째 파일 이름 입력 : test.txt
        2 번째 파일 이름 입력 : test4.txt
        병합 될 파일명 입력 : result.txt
        오류 : test4.txt (지정된 파일을 찾을 수 없습니다)
         */
        Scanner sc = new Scanner(System.in);
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            System.out.print("병합할 파일의 개수 입력 : ");
            int n = sc.nextInt();

            // 파일 이름을 담는 String 배열 선언
            String[] fileNames = new String[n];

            // 파일 이름 배열에 입력받기
            for (int i = 0; i < n; i++) {
                System.out.print((i + 1) + " 번째 파일 이름 입력 : ");
                fileNames[i] = sc.next();
            }

            System.out.print("병합 될 파일명 입력 : ");
            String mergedFileName = sc.next();

            bw = new BufferedWriter(new FileWriter("src/main/java/org/example/chap11_io/level02/normal/" + mergedFileName));

            for (int i = 0; i < n; i++) {
                try {
                    br = new BufferedReader(new FileReader("src/main/java/org/example/chap11_io/level02/normal/" + fileNames[i]));
                    String temp;
                    while ((temp = br.readLine()) != null) {
                        bw.write(temp);
                        bw.newLine();
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("오류 : " + fileNames[i] + " (지정된 파일을 찾을 수 없습니다)");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("파일 병합이 완료 되었습니다.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (br != null) {
                try {
                    br.close();
                    bw.close();
                    sc.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
