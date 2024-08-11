package org.example.chap10_exception.level01.basic;

import org.example.chap10_exception.level01.basic.exception.InvalidAgeException;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) throws ParseException {
        /* ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2014-05-05
         *
         * ----- 출력 예시 -----
         *
         * 만 20세 미만은 입장 불가입니다.
         *
         * ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 1994-05-05
         *
         * ----- 출력 예시 -----
         *
         * 입장하셔도 됩니다.
         *
         * ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2000-14-15
         *
         * ----- 출력 예시 -----
         *
         * 날짜 양식을 잘못 입력하셨습니다.
         */

        Scanner sc = new Scanner(System.in);
        ExceptionTest exceptionTest = new ExceptionTest();

        try {
            System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
            LocalDate dateOfBirth = LocalDate.parse(sc.next());

            exceptionTest.checkValidAge(dateOfBirth);
        } catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        } catch(DateTimeParseException e) {  // DateTimeParseException은 잘못된 형식, 유효하지 않은 값일 때를 모두 포함하는 exception
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        }
    }
}


