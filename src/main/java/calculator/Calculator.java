package calculator;

public class Calculator {
    public int sum(int first, int second) {
        return first + second;
    }

    public int multiple(int first, int second) {
        return first * second;
    }

    public int divide(int first, int second) {
        return first / second;
    }

    public int power(int first, int second) {
        if (second == 0)
            return 1;
        return first * power(first, second - 1);
    }
}
