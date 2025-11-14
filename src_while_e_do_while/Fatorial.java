import java.util.Scanner;
 
public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int i = 1;
 
        while (n > 1) {
            i = i * n;
            n--;
        }
 
        System.out.println("Fatorial = " + i);
        sc.close();
    }
}