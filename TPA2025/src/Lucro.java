import java.util.Scanner;
 
public class Lucro {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 
        char continuar;
        do {
            System.out.print("Digite o preço de custo do produto: ");
            double preco = sc.nextDouble();
 
            System.out.print("Digite a margem de lucro (%): ");
            double margem = sc.nextDouble();
 
            double precoVenda = preco + (preco * margem / 100);
            System.out.println("Preço de venda: R$ " + precoVenda);
 
            System.out.print("Deseja continuar a execução? (S/N): ");
continuar = sc.next().toUpperCase().charAt(0);
 
        } while (continuar == 'S');
 
        sc.close();
    }
}