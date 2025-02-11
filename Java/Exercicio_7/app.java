package Exercicio_7;
import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i;
        float nota1,nota2;
        do{
            System.out.println("Digite o valor da 1° nota");
            nota1 = ler.nextFloat();

        }  while (nota1 < 0 || nota1 >10);
        } 
    }
