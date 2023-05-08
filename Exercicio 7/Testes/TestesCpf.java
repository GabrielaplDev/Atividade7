import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CadastroUsuarioTest {

    @Test
    void testCadastroUsuario() {
        String input = "John Doe\n12345678901\n30\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        CadastroUsuario.main(new String[]{});

        assertEquals("Nome: John Doe\nCPF: 12345678901\nIdade: 30\n", getOutput());
    }

    @Test
    void testCadastroUsuarioNomeVazio() {
        String input = "\nJohn Doe\n12345678901\n30\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        CadastroUsuario.main(new String[]{});

        assertEquals("Nome não pode ser vazio. Digite
