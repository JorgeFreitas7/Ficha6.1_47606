import org.example.Calculadora;
import org.example.Perimetro;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

public class TestePerimetro {
    @Test
    public void testeArea(){
        Perimetro p = new Perimetro();
        int soma = p.area(3,5);
        int testSoma = 15;
        assertEquals (soma, testSoma);
    }
    @Test
    public void testeTriangulo() {
        Perimetro p = new Perimetro();

        assertTrue(p.isTriangle(3, 4, 5));

        assertFalse(p.isTriangle(1, 2, 10));
    }
}
