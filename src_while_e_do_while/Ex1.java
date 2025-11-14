import java.util.Scanner;
 
public class Ex1 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 
        int i = 1;
        while (i <= 4) { // repete para 4 funcionários
            System.out.print("Digite o salário do funcionário " + i + ": ");
            double salario = sc.nextDouble();
 
            double desconto;
            if (salario < 2000.0) {
                desconto = salario * 0.085;
            } else {
                desconto = salario * 0.11;
            }
 
            System.out.println("Desconto do INSS: R$ " + desconto);
            i++;
        }
 
        sc.close();
    }
}