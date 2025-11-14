import java.util.Scanner;

public class Vetor8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		 	int a[]=new int [10];
	        int b[]=new int [10];
	        
	        for (int k=0; k<10; k++){
	        System.out.println ("Incira os valores:");
	        a[k]=in.nextInt();
	        }
	        
	        for(int i=0; i<10; i++) {
	        int r=0;
	        
	        for(int j=i; j<10; j++) {
	            r+=a[j];
	        }
	        
	        b[i] = r;
	        }
	        for(int i=0; i<10; i++) {
	        System.out.println(b[i]);
	        }
	}
}
