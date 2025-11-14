import java.util.Scanner;
 
public class Invertido {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM=5;
		
		int a[], i;
		double total=0, media;
		
		a=new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° Valor de A:");
			a[i]=in.nextInt();
			total=a[i]+total;
		}
		media=total/TAM;
		
		System.out.print(media+" ");
		
 
	}
 
}
