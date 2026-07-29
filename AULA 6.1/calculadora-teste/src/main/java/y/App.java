package y;

/**
 * Hello world!
 *
 */
package y;

public class Calculator {

    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public double divide(double number1, double number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida.");
        }
        return number1 / number2;
    }

    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Não existe raiz real para números negativos.");
        }
        return Math.sqrt(number);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}