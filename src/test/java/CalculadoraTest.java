import org.example.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    public void testSoma() {
        Calculadora calculo = new Calculadora();
        int soma = calculo.soma(2,5);
        int testSoma = 7;
        assertEquals (soma, testSoma);
    }

}
