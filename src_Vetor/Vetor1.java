import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		 int[] n = new int[20];
	        int[] m = new int[20];
	        
	        System.out.println("Insira os valores:");
	        for (int i = 0; i < 20; i++) {
	            n[i] = in.nextInt();
	        }
	 
	        for (int i = 0; i < 20; i++) {
	            if (n[i] % 2 == 0) {
	                m[i] = n[i];
	            }
	        }
	 
	        System.out.println("Esses são os valores ímpares:");
	        for (int j = 0; j < 20; j++) {
	            if (n[j] % 2 != 0) {
	                System.out.println(n[j]);
	            }
	        }
	 
	        System.out.println("Esses são os valores pares:");
	        for (int k = 0; k < 20; k++) {
	            if (m[k] != 0) {
	                System.out.println(m[k]);
	            }
	        }

	}

}
