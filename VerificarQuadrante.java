import java.util.Scanner;

public class VerificarQuadrante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de x: ");
        int x = scanner.nextInt();
        System.out.println("Digite o valor de y: ");
        int y = scanner.nextInt();
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else if (x > 0 && y < 0){
            System.out.println("quadrante 4");
        }
        else if(x < 0 && y <0 ){
            System.out.println("quadrante 3");
        }
        else if (x < 0 && y > 0){
            System.out.println("quadrante 2");
        }
        else if(x == 0 && y != 0){
            System.out.println("Eixo Y");
        }
        else if(x != 0 && y == 0){
            System.out.println("Eixo X");
        }
        else {
            System.out.println("quadrante 1");
        }
        scanner.close();
    }
}
