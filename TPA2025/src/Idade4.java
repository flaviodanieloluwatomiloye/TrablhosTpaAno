import java.util.Scanner;
 
public class Idade4 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 
        String nomeMaisNovo = "";
        String nomeMaisVelho = "";
        int idadeMaisNova = 0;
        int idadeMaisVelha = 0;
 
        int i = 1;
        while (i <= 10) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
String nome = sc.next();
            System.out.print("Digite a idade de " + nome + ": ");
            int idade = sc.nextInt();
 
            if (i == 1) {
                // primeira pessoa serve como referência
                nomeMaisNovo = nome;
                nomeMaisVelho = nome;
                idadeMaisNova = idade;
                idadeMaisVelha = idade;
            } else {
                if (idade < idadeMaisNova) {
                    nomeMaisNovo = nome;
                    idadeMaisNova = idade;
                }
                if (idade > idadeMaisVelha) {
                    nomeMaisVelho = nome;
                    idadeMaisVelha = idade;
                }
            }
 
            i++;
        }
 
        System.out.println("A pessoa mais nova é " + nomeMaisNovo + " com " + idadeMaisNova + " anos.");
        System.out.println("A pessoa mais velha é " + nomeMaisVelho + " com " + idadeMaisVelha + " anos.");
 
        sc.close();
    }
}