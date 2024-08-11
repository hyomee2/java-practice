package org.example.chap10_exception.level01.basic;

import org.example.chap10_exception.level01.basic.exception.InvalidAgeException;

import java.time.LocalDate;

public class ExceptionTest {
    public void checkValidAge(LocalDate birthDate) throws InvalidAgeException {
        LocalDate today = LocalDate.now();
        // 현재 날짜에서 20년보다 더 이전에 태어났으면(즉 만 20세 이상이면) false
        if (today.minusYears(20).isBefore(birthDate)) {
            throw new InvalidAgeException("만 20세 미만은 입장 불가입니다.");
        }
        else {
            System.out.println("입장하셔도 됩니다.");
        }
    }
}



