import java.util.Scanner;
 
public class TipoTriangulo {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite o lado A: ");
        double A = scanner.nextDouble();
 
        System.out.print("Digite o lado B: ");
        double B = scanner.nextDouble();
 
        System.out.print("Digite o lado C: ");
        double C = scanner.nextDouble();
 
        if (A < B + C && B < A + C && C < A + B) {
            if (A == B && B == C) {
                System.out.println("Triângulo Equilátero");
            } else if (A == B || B == C || A == C) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo");
        }
 
        scanner.close();
    }
}