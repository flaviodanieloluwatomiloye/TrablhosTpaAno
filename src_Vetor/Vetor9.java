import java.util.Scanner;

public class Vetor9 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        
        int a[] = new int [10];
        int b[] = new int [10];
        int c[] = new int [10];
        
        System.out.println ("incira os valores para o vetor A:");
        for (int i=0; i<10; i++) {
        a[i]=in.nextInt();
        }
        
        System.out.println ("incira os valores para o vetor B:");
        for (int i=0; i<10; i++) {
            b[i]=in.nextInt();       
        }
            
        for (int i=0; i<10; i++) {
        	for (int j=0; j<10; j++) {
        		if (a[i] == b[j]) {
                    c[j] = a[i];
        		}
        	}
        }
         for (int i = 0; i < 10; i++) {
        	 if (c[i] != 0) {
            System.out.println(c[i]);
        	 }
         }
	}
}
