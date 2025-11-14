import java.util.Scanner;
 
public class CalculaIRPF {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite o salário: R$ ");
        double salario = scanner.nextDouble();
        double irpf;
 
        if (salario <= 1434.59) {
            irpf = 0.0;
        } else if (salario <= 2150.00) {
            irpf = salario * 0.075 - 107.59;
        } else if (salario <= 2866.70) {
            irpf = salario * 0.15 - 268.84;
        } else if (salario <= 3582.00) {
            irpf = salario * 0.225 - 183.84;
        } else {
            irpf = salario * 0.275 - 662.94;
        }
 
        System.out.printf("Desconto de IRPF: R$ %.2f\n", irpf);
 
        scanner.close();
    }
}