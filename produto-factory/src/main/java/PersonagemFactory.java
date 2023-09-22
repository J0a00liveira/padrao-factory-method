public class PersonagemFactory {

    public static IPersonagem obterPersonagem(String personagem) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Personagem" + personagem);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Personagem inexistente");
        }
        if (!(objeto instanceof IPersonagem)) {
            throw new IllegalArgumentException("Personagem inválido");
        }
        return (IPersonagem) objeto;
    }
}