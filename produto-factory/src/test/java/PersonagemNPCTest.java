import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemNPCTest {

    @Test
    void deveAndar() {
        IPersonagem personagem = PersonagemFactory.obterPersonagem("NPC");
        assertEquals("Personagem andou", personagem.andar());
    }

    @Test
    void devePular() {
        IPersonagem servico = PersonagemFactory.obterPersonagem("NPC");
        assertEquals("Personagem pulou", servico.pular());
    }

}