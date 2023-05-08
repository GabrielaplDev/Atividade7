import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteConversorTemperatura {

    @Test
    void testConversaoTemperatura() {
        String input = "68\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ConversorTemperatura.main(new String[]{});

        assertEquals("Esse programa converte uma temperatura em graus Fahrenheit para graus Celsius.\n\n" +
                "Informe a temperatura em graus Fahrenheit:\n" +
                "68.0 graus Fahrenheit equivale a 20.00 graus Celsius.\n", getOutput());
    }

    private String getOutput() {
        return System.out.toString().trim() + "\n";
    }
}
