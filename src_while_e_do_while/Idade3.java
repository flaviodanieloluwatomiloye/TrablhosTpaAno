import java.util.Scanner;
 
public class Idade3 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 
        String nomeMaisNovo = "";
        String nomeMaisVelho = "";
        int idadeMaisNova = Integer.MAX_VALUE;
        int idadeMaisVelha = Integer.MIN_VALUE;
 
        int i = 1;
        while (i <= 10) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
String nome = sc.next();
            System.out.print("Digite a idade de " + nome + ": ");
            int idade = sc.nextInt();
 
            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
 
            if (idade > idadeMaisVelha) {
                idadeMaisVelha = idade;
                nomeMaisVelho = nome;
            }
 
            i++;
        }
 
        System.out.println("Mais novo: " + nomeMaisNovo + " (" + idadeMaisNova + " anos)");
        System.out.println("Mais velho: " + nomeMaisVelho + " (" + idadeMaisVelha + " anos)");
 
        sc.close();
    }
}