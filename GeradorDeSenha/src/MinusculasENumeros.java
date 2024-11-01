public class MinusculasENumeros extends GeradorSenha{
    public MinusculasENumeros(int tamanhoSenha) {
        super(tamanhoSenha);
    }

    @Override
    public String gerarSenha() {
        String caracteres = "abcdefghijklmnopqrstuvwxyz0123456789";
        return gerarSenha(caracteres);
    }
}
