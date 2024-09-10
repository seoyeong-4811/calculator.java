package Lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Double> results; // 결과를 저장하는 필드

    public Calculator() {
        results = new ArrayList<>(); // 생성자
    }

    // 계산 메서드
    public double calculate(String operator, int firstNumber, int secondNumber) {
        switch (operator) {
            case "+":
                return add(firstNumber, secondNumber);
            case "-":
                return subtract(firstNumber, secondNumber);
            case "*":
                return multiply(firstNumber, secondNumber);
            case "/":
                return divide(firstNumber, secondNumber);
            default:
                throw new IllegalArgumentException("지원하지 않는 연산자입니다.");
        }
    }

    // 덧셈 메서드
    private double add(int firstNumber, int secondNumber) {
        double answer = firstNumber + secondNumber;
        results.add(answer); // 결과를
        // 리스트에 저장
        return answer;
    }

    // 뺄셈 메서드
    private double subtract(int firstNumber, int secondNumber) {
        double answer = firstNumber - secondNumber;
        results.add(answer); // 결과를 리스트에 저장
        return answer;
    }

    // 곱셈 메서드
    private double multiply(int firstNumber, int secondNumber) {
        double answer = firstNumber * secondNumber;
        results.add(answer); // 결과를 리스트에 저장
        return answer;
    }

    // 나눗셈 메서드
    private double divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        double answer = (double) firstNumber / secondNumber;
        results.add(answer); // 결과를 리스트에 저장
        return answer;
    }

    // 결과를 반환하는 메서드
    public List<Double> getResults() {
        return results;
    }

    // 결과를 설정하는 메서드
    public void setResults(List<Double> results) {
        this.results = results;
    }

    // 가장 먼저 저장된 데이터를 삭제하는 메서드
    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }
}




