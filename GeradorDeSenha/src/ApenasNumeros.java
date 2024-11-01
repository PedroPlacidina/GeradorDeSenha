public class ApenasNumeros extends GeradorSenha {
    public ApenasNumeros(int tamanhoSenha){
        super(tamanhoSenha);
    }

    @Override
    public String gerarSenha() {
        String caracteres = "0123456789";
        return gerarSenha(caracteres);
    }
}
