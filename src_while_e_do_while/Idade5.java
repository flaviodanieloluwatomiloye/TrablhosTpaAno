import java.util.Scanner;
 
public class Idade5 {
 
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int nas, at, id, i = 0;
		
		
		do {
			System.out.println("Informe o ano Atual");
			at = in.nextInt();
			System.out.println("Informe o ano de Nascimento");
			nas = in.nextInt();
			System.out.println("A idade da pessoa é " +(at-nas));
			System.out.println("Deseja continuar");
			i = in.nextInt();
		}while (i==1);
			
		}
 
	}