import java.util.Scanner;

public class CadeiaIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero");
        int numero = scanner.nextInt();
        
        if(numero > 0){
            System.out.println("positivo");

        }else if( numero <0){
            System.out.println("negativo");

        }else {
            System.out.println("neutro");
        }
        scanner.close();
    }
}
