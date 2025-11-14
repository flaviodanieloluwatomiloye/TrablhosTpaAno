import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
 
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();
 
        int idade = anoAtual - anoNascimento;
 
        if (idade < 10) {
            System.out.println("Você tem " + idade + " anos. É uma criança.");
        } else if (idade < 18) {
            System.out.println("Você tem " + idade + " anos. É um adolescente.");
        } else if (idade < 60) {
            System.out.println("Você tem " + idade + " anos. É um adulto.");
        } else {
            System.out.println("Você tem " + idade + " anos. É um idoso.");
        }
 
        scanner.close();
    }
}