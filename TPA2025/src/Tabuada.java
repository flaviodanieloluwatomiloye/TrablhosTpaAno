import java.util.Scanner;
 
public class Tabuada {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 
        System.out.print("Digite um número de 1 a 10 para ver a tabuada: ");
        int num = sc.nextInt();
 
        switch (num) {
            case 1: case 2: case 3: case 4: case 5:
            case 6: case 7: case 8: case 9: case 10:
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + " x " + i + " = " + (num * i));
                }
                break;
 
            default:
                System.out.println("Número inválido! Digite de 1 a 10.");
        }
 
        sc.close();
    }
}