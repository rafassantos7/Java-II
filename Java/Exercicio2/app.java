package Exercicio2;
import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        String nome;
        float nota1, nota2,media;

        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        
        nome = ler.nextLine();  
        
        System.out.print("Digite a nota da primeira prova: ");
        nota1 = ler.nextFloat();
        System.out.print("Digite a nota da segunda prova: ");
        nota2 = ler.nextFloat();
        
        media = (nota1+nota2)/2;

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua media é: " + media);

        if (media < 7) {
            System.out.println("Você está reprovado!");
        }
        else {
            System.out.println("Você está aprovado =D");
        }
    }
}
