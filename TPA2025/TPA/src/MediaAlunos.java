import java.util.Scanner;
 
public class MediaAlunos {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
 
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
 
        double media = (nota1 + nota2) / 2;
        System.out.printf("Média: %.2f\n", media);
 
        if (media < 3) {
            System.out.println("Situação: REPROVADO");
        } else if (media >= 6) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: EXAME");
 
            System.out.print("Digite a nota do exame: ");
            double notaExame = scanner.nextDouble();
 
            double novaMedia = (media + notaExame) / 2;
 
            if (novaMedia >= 6) {
                System.out.printf("Nova média: %.2f\n", novaMedia);
                System.out.println("Situação: APROVADO no EXAME");
            } else {
                System.out.printf("Nova média: %.2f\n", novaMedia);
                System.out.println("Situação: REPROVADO no EXAME");
            }
        }
 
        scanner.close();
    }
}