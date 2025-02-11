package array2;
import java.util.Scanner;
public class app {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double[] notas = new double[2];

    for(int i =0; i<2; i++){
        System.out.println("Digite a " + (i+1) + " nota: ");
        notas[i] = ler.nextDouble();
    }
    System.out.println("Exibindo as notas: ");
    for (double nota : notas){
        System.out.println("Nota: " + nota);
    }
    ler.close();
    }
}
