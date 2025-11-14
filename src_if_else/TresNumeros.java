import java.util.Scanner;
 
public class TresNumeros {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        int A, B, C, temp;
 
        System.out.print("Digite o valor de A: ");
        A = scanner.nextInt();
 
        System.out.print("Digite o valor de B: ");
        B = scanner.nextInt();
 
        System.out.print("Digite o valor de C: ");
        C = scanner.nextInt();
 
        if (A > B) {
            temp = A;
            A = B;
            B = temp;
        }
 
        if (A > C) {
            temp = A;
            A = C;
            C = temp;
        }
 
        if (B > C) {
            temp = B;
            B = C;
            C = temp;
        }
 
        System.out.printf("Valores em ordem crescente: %d, %d, %d\n", A, B, C);
 
        scanner.close();
    }
}