import java.util.Scanner;
 
public class Soma {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM=10;
		
		int a[], b[], c[], i;
		
		a=new int [TAM];
		b=new int [TAM];
		c=new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° Valor de A:");
			a[i]=in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° Valor de B:");
			b[i]=in.nextInt();	
		}
		
		System.out.print("[");
		
		for(i=0; i<TAM; i++) {
			System.out.print((a[i]+b[i])+" ");
		}
		
		System.out.println("]");
	}
 
}