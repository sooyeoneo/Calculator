package Lv2;

import java.util.List;
import java.util.ArrayList;

public class Calculator {
    // 필드 캡슐화 - 컬렉션 타입 필드를 private 선언
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
        // 결과를 리스트에 저장
        results.add(result);
        return result;
    }
    // 모든 연산 결과를 반환하는 메서드 Getter, 외부에서 연산 결과를 조회할 수 있음.
    public List<Double> getResults() {
        return new ArrayList<>(results); // 캡슐화 유지를 위해 새 리스트 반환, 원본 results 리스트 보호
    }

    // results 필드를 설정하는 Setter, 필요할 때 setResults 메서드 호출해서 리스트 수정
    public void setResults(List<Double> results) {
        this.results = results; // 외부에서 받은 리스트 this.results에 할당
    }

    // 가장 먼저 저장된 결과를 삭제하는 메서드
    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0); // 첫 번째로 저장된 결과 삭제
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }
}

