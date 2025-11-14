import java.util.Scanner;
 
public class CalculaIMC {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();
 
        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();
 
        if (altura <= 0) {
            System.out.println("Erro: Altura deve ser maior que zero.");
        } else {
            double imc = peso / (altura * altura);
            System.out.printf("Seu IMC é: %.2f\n", imc);
 
            if (imc < 18.5) {
                System.out.println("Classificação: Excesso de Magreza");
            } else if (imc < 25) {
                System.out.println("Classificação: Peso Normal");
            } else if (imc < 30) {
                System.out.println("Classificação: Excesso de Peso");
            } else if (imc < 35) {
                System.out.println("Classificação: Obesidade Grau I");
            } else if (imc <= 40) {
                System.out.println("Classificação: Obesidade Grau II");
            } else {
                System.out.println("Classificação: Obesidade Grau III");
            }
        }
 
        scanner.close();
    }
}
