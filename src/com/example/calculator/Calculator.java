package com.example.calculator;
// 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성
public class Calculator {
    public int calculate(int firstNumber, int secondNumber, char operator) {
        int result = 0;

        // 사칙 연산을 수행
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
        }
    }
}
