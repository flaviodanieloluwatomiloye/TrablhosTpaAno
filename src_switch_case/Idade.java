 
import java.util.Scanner;
 
public class Idade {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
 
        // 0 = menor de idade, 1 = maior de idade
        int status = (idade >= 18) ? 1 : 0;
 
        switch (status) {
            case 0:
                System.out.println("Menor de idade");
                break;
            case 1:
                System.out.println("Maior de idade");
                break;
            default:
                System.out.println("Idade inválida");
                break;
        }
 
        sc.close();
    }
}
