import java.util.Scanner;

public class VolumeMetrosParaLitros {
    public static void main(String[] args) {
        double volumeMetros, volumeLitros;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o volume em metros cúbicos: ");
        volumeMetros = scanner.nextDouble();
        volumeLitros = volumeMetros * 1000;
        System.out.println("O volume em litros é: " + volumeLitros);
        scanner.close();
    }
}
