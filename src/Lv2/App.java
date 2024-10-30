package Lv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Calculator 인스턴스 생성
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            double num1 = sc.nextDouble();

            System.out.println("두 번째 숫자를 입력하세요: ");
            double num2 = sc.nextDouble();

            System.out.println("사칙연산 기호를 입력하세요 (+,-,*,/) : ");
            char operator = sc.next().charAt(0);

            try {
                // Calculator 인스턴스를 통해 계산 수행
                double result = calculator.calculate(num1, num2,operator);
                System.out.println("연산 결과 : " + result);
            } catch (Exception e) {
                System.out.println("오류 : " + e.getMessage());
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            String exitCommand = sc.next();
            if ("exit".equalsIgnoreCase(exitCommand)) {
                break;
            }
        }

        // 모든 연산 결과를 출력, calculator.getResult()를 호출하여 결과 리스트 출력
        System.out.println("모든 연산 결과 : " + calculator.getResults());

        sc.close();
        System.out.println("계산기를 종료합니다.");
    }
}
