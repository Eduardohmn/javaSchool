import java.util.Scanner;
public class LeCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um caractere: ");
        String str = scanner.nextLine();
        char letra = str.charAt(0);
        
        System.out.println("voce digitou  " + str);
        System.out.println("o primeiro caracter é " + letra);
        
        char outraLetra = scanner.nextLine().charAt(0);
        System.out.println("outra letra = " + outraLetra);
        
        System.out.println("tamanho da palavra: " + str.length());
        System.out.println("ultima letra: " + str.charAt(str.length()-1));
        System.out.println("caixa alta: " + str.toUpperCase());
        System.out.println("caixa baixa: " + str.toLowerCase());

        scanner.close();
    }
}
