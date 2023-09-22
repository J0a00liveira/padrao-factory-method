import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemHeroiTest {

    @Test
    void deveAndar() {
        IPersonagem personagem = PersonagemFactory.obterPersonagem("Heroi");
        assertEquals("Personagem andou", personagem.andar());
    }

    @Test
    void devePular() {
        IPersonagem servico = PersonagemFactory.obterPersonagem("Heroi");
        assertEquals("Personagem pulou", servico.pular());
    }

}