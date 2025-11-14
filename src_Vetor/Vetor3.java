
public class Vetor3 {

	public static void main(String[] args) {
		
		int a[] = {7, 10, 23, 37, 22, 79, 101, 72, 54, 126};
		
		for(int i=0; i<10; i++){
		    if(a[i] % 2 == 0){
		        System.out.println("o numero " + a[i] + " não é um numero primo");
		    }
		        else {
		            System.out.println("o numero "+ a[i] +" é um numero primo");
		        }
		    
		}
	}
}
