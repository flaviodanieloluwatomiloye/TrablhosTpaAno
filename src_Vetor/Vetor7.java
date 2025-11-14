
public class Vetor7 {

	public static void main(String[] args) {
		
		int a[] = {2, 7, 5, 9, 10, 16, 13, 1, 19, 20, 12, 11, 4, 14, 21};
		int b[] = new int [15];
		    
		for(int i = 0; i<=14; i++) {
		    int c = 1;
		    
		    for(int j=1; j<=a[i]; j++){
		    
		  c = c * j;
		    }
		    b[i] = c;
		    System.out.println(a[i]+ "= " + b[i]);
		    System.out.println(" ");
		}
	}
}
