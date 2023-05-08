import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteNovoValorProduto {

    @Test
    void testNovoValorProduto() {
        String input = "50\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        NovoValorProduto.main(new String[]{});

        assertEquals("Esse programa irá calcular o novo valor do produto acrescido 10% ao seu valor inicial.\n\n" +
                "Informe o Valor do produto:\n" +
                "O novo valor do produto é: 55.00\n", getOutput());
    }

    @Test
    void testNumeroInvalido() {
        String input = "0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        NovoValorProduto.main(new String[]{});

        assertEquals("Esse programa irá calcular o novo valor do produto acrescido 10% ao seu valor inicial.\n\n" +
                "Informe o Valor do produto:\n" +
                "Número inválido, tente novamente.\n", getOutput());
    }

    private String getOutput() {
        return System.out.toString().trim() + "\n";
    }
}
