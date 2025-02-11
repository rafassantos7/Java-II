import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        double media;
        double[] notas = new double[2];
        Scanner ler = new Scanner(System.in);
        for(int i = 0; i <2; i++){
            System.out.print("Digite sua " + (i+1) + (" nota: "));
            notas[i] = ler.nextDouble();
            
            while (notas[i] < 0 || notas[i] >10){
                System.out.println("A nota deve ser entre 0 e 10");
                System.out.println("Digite a nota novamente: ");
                notas[i] = ler.nextDouble();
            }
            
        }
        media = (notas[0] + notas[1])/notas.length; 
        for (double nota: notas){
            System.out.println("Nota: " + nota);
        }
        System.out.println(media);
    }
}
