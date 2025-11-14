import java.util.Scanner;
 
public class RaizQuadrada {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM =10;
		int a[], b[], i;
		
		a=new int [TAM];
		b=new int [TAM];
 
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° Valor A:");
			a[i]=in.nextInt();
			b[i]=a[i]*a[i];
		}
		System.out.print("[");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
	}
 
}