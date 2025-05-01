import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha

        System.out.println("Você é homem ou mulher? Digite M para homem ou F para mulher:");
        char sexo = scanner.nextLine().toUpperCase().charAt(0);

        if (sexo == 'M') {
            System.out.println("Seu peso ideal é: " + ((72.7 * altura) - 58));
        } else if (sexo == 'F') {
            System.out.println("Seu peso ideal é: " + ((62.1 * altura) - 44.7));
        } else {
            

        scanner.close();
    }
    }
}