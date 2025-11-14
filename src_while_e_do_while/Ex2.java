import java.util.Scanner;
 
public class Ex2 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
 
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
 
        sc.close();
    }
}