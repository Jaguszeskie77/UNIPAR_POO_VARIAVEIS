import br.unipar.override.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestOverride {

    @Test
    public void testOverrideSuperClasse() {
        SuperClasse superClasse = new SuperClasse();
        superClasse.imprime();
    }

    @Test
    public void testOverrideSubClasse() {
        SubClasse subClasse = new SubClasse();
        subClasse.imprime();
    }

    @Test
    public void testLigarSuper() {
        SuperClasse superClasse = new SuperClasse();
        superClasse.ligar();
    }

    @Test
    public void testLigarSub() {
        SubClasse subClasse = new SubClasse();
        subClasse.ligar();
    }
}
