import com.meta.springprepare.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    @DisplayName("더하기 테스트")
    void test1() {
        Calculator calculator = new Calculator(); //계산기 인스턴스(=객체) 생성
        Double result = calculator.operate(8,"+",2); //=10
        System.out.println("덧셈 테스트 8 + 2 = " + result);

        Assertions.assertEquals(10, result);

    }

    @Test
    @DisplayName("나누기 테스트")
    void test2() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(365, "/",5);
        System.out.println("나눗셈 테스트 365 / 5 = " + result);

        Assertions.assertEquals(73,result);
    }

    @Test
    @DisplayName("빼기 테스트")
    void test3() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(333, "-",111);
        System.out.println("뺄셈 테스트 333 - 111 = " + result);

        Assertions.assertEquals(222,result);
    }

    @Test
    @DisplayName("곱하기 테스트")
    void test4() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(1111, "*",7);
        System.out.println("곱셈 테스트 1111 * 7 = " + result);

        Assertions.assertEquals(7777,result);
    }
    @Test
    @DisplayName("0으로 나누기 테스트")
    void test5() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(10, "/", 0);
        System.out.println("0으로 나누기 테스트 10 / 0 = " + result);
        Assertions.assertNull(result);
    }

    @Test
    @DisplayName("잘못된 연산자 테스트")
    void test6() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class,
                () -> calculator.operate(1, "%", 2));
    }
}
