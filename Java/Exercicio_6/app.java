import java.util.Scanner;

public class app{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();

        while (idade < 18){
            System.out.println("Voce não pode ser de menor");
            System.out.println("Digite sua idade novamente: ");
            idade = ler.nextInt();
        }

        int avaliacao;
        do{
            System.out.println("Avalie o nosso atendimento de 1 a 5: ");
            avaliacao = ler.nextInt();
        } 
        while(avaliacao < 1 || avaliacao >5);
        System.out.println("Obrigado!");
    }
}