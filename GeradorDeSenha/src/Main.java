import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o tamanho da senha a ser criada: ");
        int tamanhoSenha = leitor.nextInt();

        System.out.println("Selecione o tipo de senha: ");
        System.out.println("1 - Apenas números ");
        System.out.println("2 - Apenas letras minúsculas");
        System.out.println("3 - Letras minúsculas e números");
        System.out.println("4 - Letras Maiúsculas, minúsculas e números");
        System.out.println("5 - Letras Maiúsculas, minúsculas, números e símbolos ( $, &, #, @, _ ):");
        int tipoSenha = leitor.nextInt();
    
        GeradorSenha gerador = null;

        switch (tipoSenha) {
            case 1:
                gerador = new ApenasNumeros(tamanhoSenha);
                break;
            case 2:
                gerador = new LetrasMinusculas(tamanhoSenha);
                break;
            case 3:
                gerador = new MinusculasENumeros(tamanhoSenha);
                break;
            case 4:
                gerador = new MaiúsculasMinúsculasNúmeros(tamanhoSenha);
                break;
            case 5:
                gerador = new Completo(tamanhoSenha);
                break;
            default:
                System.out.println("ERRO. Opção não existe");
                leitor.close();
                return; 
        }

        String senha = gerador.gerarSenha();
        System.out.println("Senha gerada: " + senha);

        leitor.close();
    }   
}
