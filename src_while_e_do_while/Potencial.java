import java.util.Scanner;
 
public class Potencial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int base = sc.nextInt();
        System.out.print("Digite o expoente: ");
        int exp = sc.nextInt();
 
        int resultado = 1;
        while (exp > 0) {
            resultado *= base;
            exp--;
        }
 
        System.out.println("Resultado = " + resultado);
        sc.close();
    }
}