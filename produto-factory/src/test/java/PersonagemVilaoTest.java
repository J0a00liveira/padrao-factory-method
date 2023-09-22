import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemVilaoTest {

    @Test
    void deveAndar() {
        IPersonagem personagem = PersonagemFactory.obterPersonagem("Vilao");
        assertEquals("Personagem andou", personagem.andar());
    }

    @Test
    void devePular() {
        IPersonagem servico = PersonagemFactory.obterPersonagem("Vilao");
        assertEquals("Personagem pulou", servico.pular());
    }

}