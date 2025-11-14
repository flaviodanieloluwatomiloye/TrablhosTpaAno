import java.util.Scanner;
 
public class Gastos {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite a distância percorrida (em km): ");
        double distancia = scanner.nextDouble();
 
        System.out.print("Digite a capacidade do tanque (em litros): ");
        double capacidade = scanner.nextDouble();
 
        if (capacidade <= 0) {
            System.out.println("Erro: Capacidade do tanque deve ser maior que zero.");
        } else {
            double gastoMedio = distancia / capacidade;
            System.out.printf("Gasto médio: %.2f km/L\n", gastoMedio);
 
            if (gastoMedio >= 10) {
                System.out.println("O carro é econômico.");
            } else {
                System.out.println("O carro não é econômico.");
            }
        }
 
        scanner.close();
    }
}