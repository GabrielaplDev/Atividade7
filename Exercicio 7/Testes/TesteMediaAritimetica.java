import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MediaAritmeticaTest {

    @Test
    void testMediaAritmetica() {
        String input = "4\n6\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        MediaAritmetica.main(new String[]{});

        assertEquals("Média aritmética: 5.0\n", getOutput());
    }

    @Test
    void testMediaAritmeticaNumerosNegativos() {
        String input = "-2\n-4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        MediaAritmetica.main(new String[]{});

        assertEquals("Média aritmética: -3.0\n", getOutput());
    }

    @Test
    void testMediaAritmeticaNumerosFracionados() {
        String input = "3.5\n2.5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        MediaAritmetica.main(new String[]{});

        assertEquals("Média aritmética: 3.0\n", getOutput());
    }

    private String getOutput() {
        return System.out.toString().trim() + "\n";
    }
}
