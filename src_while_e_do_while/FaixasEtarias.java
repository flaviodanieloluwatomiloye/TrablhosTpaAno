import java.util.Scanner;
 
public class FaixasEtarias {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j, idade, E1, E2, E3, E4, E5;
 
        i = 1;
        j = 10;
        E1 = 0;
        E2 = 0;
        E3 = 0;
        E4 = 0;
        E5 = 0;
 
        while (i <= j) {
            System.out.println("Idade da Pessoa " + i + ":");
            idade = in.nextInt();
 
            if (idade <= 15) {
                E1++;
            } else if (idade <= 30) {
                E2++;
            } else if (idade <= 45) {
                E3++;
            } else if (idade <= 60) {
                E4++;
            } else {
                E5++;
            }
            i++;
        }
 
        System.out.println("Há " + E1 + " pessoas com até 15 anos (" + (E1 * 100) / j + "% das 10 pessoas)");
        System.out.println("Há " + E2 + " pessoas entre 16 e 30 anos (" + (E2 * 100) / j + "% das 10 pessoas)");
        System.out.println("Há " + E3 + " pessoas entre 31 e 45 anos (" + (E3 * 100) / j + "% das 10 pessoas)");
        System.out.println("Há " + E4 + " pessoas entre 46 e 60 anos (" + (E4 * 100) / j + "% das 10 pessoas)");
        System.out.println("Há " + E5 + " pessoas com mais de 60 anos (" + (E5 * 100) / j + "% das 10 pessoas)");
    }
}