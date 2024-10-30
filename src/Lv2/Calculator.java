package Lv2;

import java.util.List;
import java.util.ArrayList;

public class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성
    private List<Double> results = new ArrayList<>();

    // 사칙 연산을 수행하고 결과를 반환하는 메서드
    public double calculate(double firstNumber, double secondNumber, char operator) {
        double result = 0;

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
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
                }
                break;
            default:
                throw new IllegalArgumentException("올바른 사칙연산 기호가 아닙니다.");
        }

        return result;
    }
    // 모든 연산 결과를 반환하는 메서드
    public List<Double> getResults() {
        return results;
    }

}

