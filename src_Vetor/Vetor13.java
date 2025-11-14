import java.util.Scanner;

public class Vetor13 {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 
		 //pode anular pq eu precisei de assitência nessa questão 
	        
	        int a[]=new int [10];
	        int b[]=new int [5];
	        int c[]=new int [5];
	        
	        System.out.println("insira o valor para analise:");
	        for (int i=0; i<10; i++) {
	            a[i]=in.nextInt();
	        }
	 
	        for (int j=0; j<5; j++) {
	            b[j]=a[j];
	        }
	 
	        for (int l = 5; l < 10; l++) {
	            c[l - 5] = a[l];
	        }
	 
	        boolean pa = true;
	 
	        for (int m = 0; m < 5; m++) {
	            if (b[m] != c[4 - m]) {  
	                pa = false;
	                break;
	            }
	        }
	 
	        if (pa) {
	            System.out.println("É palíndromo");
	        } else {
	            System.out.println("Não é palíndromo");
	        }

	}

}
