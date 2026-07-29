package y;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Deve somar dois números corretamente")
    void testAdd() {
        assertEquals(60.0, calculator.add(10, 50), 0);
    }

    @Test
    @DisplayName("Deve realizar divisão com sucesso e lançar exceção ao dividir por zero")
    void testDivision() {
        assertEquals(5.0, calculator.divide(10, 2), 0);
        
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }

    @Test
    @DisplayName("Deve calcular raiz quadrada ou lançar exceção para negativos")
    void testSquareRoot() {
        assertEquals(4.0, calculator.squareRoot(16), 0);

        assertThrows(IllegalArgumentException.class, () -> {
            calculator.squareRoot(-9);
        });
    }

    @Test
    @DisplayName("Deve calcular potenciação corretamente")
    void testPower() {
        assertEquals(8.0, calculator.power(2, 3), 0);
    }
}
