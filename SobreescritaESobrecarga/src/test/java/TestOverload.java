import br.unipar.overload.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestOverload {

    @Test
    public void testAdicionarDoisInt() {
        Calculadora calc = new Calculadora();
        assertEquals(3, calc.adicionar(1,2));
    }

    @Test
    void testAdicionarTresInt() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.adicionar(1,2,3));
    }

    @Test
    public void testAdicionarDoisDouble() {
        Calculadora calc = new Calculadora();
        assertEquals(3.6, calc.adicionar(1.3,2.3), 0.0001);
    }
}
