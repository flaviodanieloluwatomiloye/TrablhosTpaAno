import java.util.Scanner;
 
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de termos: ");
        int N = sc.nextInt();
 
        int a = 1, b = 1, contador = 2;
        System.out.print(a + " " + b + " ");
 
        while (contador < N) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            contador++;
        }
 
        sc.close();
    }
}