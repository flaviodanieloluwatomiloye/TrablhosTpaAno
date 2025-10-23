import java.util.Scanner;
 
public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int idade, peso;
        double alt;
        int cont50 = 0, cont1020 = 0, contPeso40 = 0;
        double somaAlt = 0;
        int velho = 0, novo = Integer.MAX_VALUE;
 
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a idade: ");
            idade = sc.nextInt();
            System.out.print("Digite a altura (em metros): ");
            alt = sc.nextDouble();
            System.out.print("Digite o peso: ");
            peso = sc.nextInt();
 
            
            if (idade > 50) {
                cont50++;
            }
 
            
            if (idade >= 10 && idade <= 20) {
                somaAlt += alt;
                cont1020++;
            }
 
            
            if (peso < 40) {
                contPeso40++;
            }
 
            
            if (idade > velho) {
                velho = idade;
            }
            if (idade < novo) {
                novo = idade;
            }
        }
 
        double mediaAlt = (cont1020 > 0) ? somaAlt / cont1020 : 0;
        double percPeso = (contPeso40 * 100.0) / 25;
 
        System.out.println("\nQuantidade de pessoas com idade > 50: " + cont50);
        System.out.println("Média das alturas (10 a 20 anos): " + mediaAlt);
        System.out.println("Porcentagem com peso < 40kg: " + percPeso + "%");
        System.out.println("Pessoa mais velha: " + velho);
        System.out.println("Pessoa mais nova: " + novo);
 
        sc.close();
    }
}