public class LetrasMinusculas extends GeradorSenha{
    public LetrasMinusculas(int tamanhoSenha) {
        super(tamanhoSenha);
    }

    @Override
    public String gerarSenha() {
        String caracteres = "abcdefghijklmnopqrstuvwxyz";
        return gerarSenha(caracteres);
    }
    
}
