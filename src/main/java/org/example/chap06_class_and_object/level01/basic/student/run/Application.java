package org.example.chap06_class_and_object.level01.basic.student.run;

import org.example.chap06_class_and_object.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] students = new StudentDTO[10];
        Scanner scanner = new Scanner(System.in);
        char answer = 'y';
        int i = 0;

        while (answer == 'y') {
            System.out.print("학년 : ");
            int grade = scanner.nextInt();

            System.out.println("반 : ");
            int classroom = scanner.nextInt();

            System.out.println("이름 : ");
            String name = scanner.next();

            System.out.println("국어점수 : ");
            int kor = scanner.nextInt();

            System.out.println("영어점수 : ");
            int eng = scanner.nextInt();

            System.out.println("수학점수 : ");
            int math = scanner.nextInt();

            students[i] = new StudentDTO(grade, classroom, name, kor, eng, math);

            System.out.print("계속 추가할 겁니까 ? (y/n)");
            answer = scanner.next().charAt(0);

            i++;
        }

        for (int j = 0; j < i; j++) {
            System.out.println(students[j].getInformation());
        }
    }
}
