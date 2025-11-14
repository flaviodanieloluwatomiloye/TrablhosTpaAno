import java.util.Scanner;
 
public class Bissexto {
 
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int ai, af;
		
		System.out.println("Informe o Ano Inicial");
		ai = in.nextInt();
		System.out.println("Informe o Ano Final");
		af = in.nextInt();
		
		int al = ai;
		while(al<= af) {
			if ((al % 4 == 0 && al % 100!= 0) || (al % 400 == 0)) {
				System.out.println(al);
			}
			al++;
		}
		
	}
}
