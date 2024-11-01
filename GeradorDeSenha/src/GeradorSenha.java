import java.util.Random;

abstract class GeradorSenha {
    private int tamanhoSenha;

    public GeradorSenha(int tamanhoSenha) {
        this.tamanhoSenha = tamanhoSenha;
    }

    public abstract String gerarSenha();
    
    public String gerarSenha(String caracteres) {
        Random r = new Random();
        StringBuilder senha = new StringBuilder();
        for (int i = 0; i < tamanhoSenha; i++) {
            senha.append(caracteres.charAt(r.nextInt(caracteres.length())));
        }
        return senha.toString();
    }
}
