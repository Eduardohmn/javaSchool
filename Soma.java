import java.util.Scanner;
public class Soma {
    public static void main(String[] args) {
        double ent1, ent2, soma;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        ent1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        ent2 = scanner.nextDouble();
        soma = ent1 + ent2;
        System.out.println("A soma dos números é: " + soma);
        scanner.close();
    }
}
