import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		final int TAM=11;
		
		int a[], i, j=1;
		
		a=new int [TAM];
		
		for(i=10; i>=1; i--) {
			System.out.println("Digite o "+(j++)+"° Valor A:");
		 			a[i]=in.nextInt();   
		}
		
		for(i=1; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
			
	}

}