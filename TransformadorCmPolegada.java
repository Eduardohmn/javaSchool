import java.util.Scanner;

public class TransformadorCmPolegada {
    public static void main(String[] args) {
        double cm, polegada;
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira :");
        cm = scanner.nextDouble();
        polegada = cm / 2.54;
        System.out.println("o valor em polegadas é: "+ polegada);
        scanner.close();
    }
}
