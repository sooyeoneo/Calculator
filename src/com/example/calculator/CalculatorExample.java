package com.example.calculator;

import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 양의 정수를 입력받고 int 타입의 변수에 저장
        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요 : ");
            int firstNumber = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요 : ");
            int secondNumber = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요 (+, -, *, /) : ");
            // 샤칙연산 기호를 적합한 타입으로 선언한 변수에 저장
            char operator = sc.next().charAt(0);
            // 입력 받은 문자열에서 첫 번째 문자만 추출하여 char 타입으로 저장
            int answer = 0;
            // 연산 결과를 저장할 변수 선언

            if (operator == '+') {
                answer = firstNumber + secondNumber;
            } else if (operator == '-') {
                answer = firstNumber - secondNumber;
            } else if (operator == '*') {
                answer = firstNumber * secondNumber;
            } else if (operator == '/') {
                if (secondNumber != 0) {
                    answer = firstNumber / secondNumber;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                    sc.close();
                    return;
                }
            } else {
                System.out.println("올바른 사칙연산 기호가 아닙니다.");
                sc.close();
                return;
            }

            System.out.println("연산 결과: " + answer);
            // 연산 결과 출력
            System.out.println("더 계산하시겠습니까? (exit 입력시 종료)");
            String exitCommand = sc.next();
            if ("exit".equals(exitCommand)) {
                break;
            }
        }
        sc.close();
        System.out.println("계산기를 종료합니다.");
    }
}
