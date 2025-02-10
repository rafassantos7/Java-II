package Exercicio1;
import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        
        final int prestacao = 5;
        
        Scanner ler = new Scanner(System.in);
        
        float valor;
        
        System.out.print("Informe o valor a ser parcelado: ");
        valor = ler.nextFloat();
        
        float valorprest;
        
        valorprest = valor / prestacao;

        

        System.out.println("Mamão com Açúcar");
        
        for (int i =1; i<= prestacao; i ++){
            System.out.println("O valor da " + i + " prestacao é: " + valorprest + " R$");

        }
    }
}
