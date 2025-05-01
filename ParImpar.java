import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");

        }
        scanner.close();

    }
}
