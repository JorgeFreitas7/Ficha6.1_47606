import org.example.Numero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumeroTest {

    private Numero numero;

    @BeforeEach
    public void setUp() {
        numero = new Numero();
    }

    @Test
    public void testMediaDosDigitosPositivo() {
        double resultado = numero.mediaDosDigitos(12345);
        assertEquals(3.0, resultado);
    }

    @Test
    public void testMediaDosDigitosNegativo() {
        double resultado = numero.mediaDosDigitos(-9876);
        assertEquals(7.5, resultado);
    }

    @Test
    public void testMediaDosDigitosZero() {
        double resultado = numero.mediaDosDigitos(0);
        assertEquals(0.0, resultado);
    }

    @Test
    public void testMediaDosDigitosUmDigito() {
        double resultado = numero.mediaDosDigitos(5);
        assertEquals(5.0, resultado);
    }
}

