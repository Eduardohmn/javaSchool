import java.util.Scanner;
public class Entrada2 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.next();
        System.out.print("sua frase: " + frase);
        System.out.println("....");
        String sobra = scanner.nextLine();
        System.out.println(sobra);
        System.out.println("...");



        scanner.close();


    }
}
