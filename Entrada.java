import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "!");
        
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Você tem " + idade + " anos.");

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Você pesa " + peso + " kg.");
        scanner.close();
    }
}
