import java.util.Scanner;
 
public class SegundoGrau {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();
 
        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();
 
        System.out.print("Digite o valor de C: ");
        double C = scanner.nextDouble();
 
        if (A < 0) {
            System.out.println("Não existem raízes reais para a equação.");
        } else if (A == 0) {
            if (B != 0) {
                double x = -C / B;
                System.out.printf("Existe uma raiz real: %.2f\n", x);
            } else {
                System.out.println("Equação inválida (B = 0).");
            }
        } else {
            double delta = B * B - 4 * A * C;
 
            if (delta < 0) {
                System.out.println("Não existem raízes reais.");
            } else {
                double x1 = (-B + Math.sqrt(delta)) / (2 * A);
                double x2 = (-B - Math.sqrt(delta)) / (2 * A);
                System.out.printf("As raízes reais são: x1 = %.2f e x2 = %.2f\n", x1, x2);
            }
        }
 
        scanner.close();
    }
}