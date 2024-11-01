public class MaiúsculasMinúsculasNúmeros extends GeradorSenha{
    public MaiúsculasMinúsculasNúmeros(int tamanhoSenha) {
        super(tamanhoSenha);
    }

    @Override
    public String gerarSenha() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        return gerarSenha(caracteres);
    }
}
