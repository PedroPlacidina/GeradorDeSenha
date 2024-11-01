public class Completo extends GeradorSenha{
    public Completo(int tamanhoSenha) {
        super(tamanhoSenha);
    }

    @Override
    public String gerarSenha() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789$&#@_";
        return gerarSenha(caracteres);
    }
}
