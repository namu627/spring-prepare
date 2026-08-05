package com.meta.springprepare;
//계산기
/**
 * 계산기 클래스 입니다
 * 계산이 가능합니다
 * 여러줄일때 이런 주석을 사용
 */

public class Calculator {
    public Double operate(double num1, String op, double num2) {
        switch (op) {
            case "*":
                return num1*num2;
            case "/":
                return num1/num2;
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");
        }
    }
}
