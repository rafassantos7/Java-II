package arraylist;
import java.util.ArrayList;
import java.util.Scanner;
public class app {
    public static void main(String[] args) {
    ArrayList<Double> notas = new ArrayList<>();
    notas.add(10.0);
    notas.add(8.0);

    for (double nota: notas){
        System.out.println("Nota: " + nota);
    }
    }
}
