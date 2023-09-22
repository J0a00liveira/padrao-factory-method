import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemFactoryTest {

    @Test
    void deveRetornarExcecaoParaPersonagemInexistente() {
        try {
            IPersonagem personagem = PersonagemFactory.obterPersonagem("Boss");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Personagem inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPersonagemInvalido() {
        try {
            IPersonagem personagem = PersonagemFactory.obterPersonagem("Mercador");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Personagem inválido", e.getMessage());
        }
    }
}