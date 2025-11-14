
public class Vetor5 {

	public static void main(String[] args) {
		
		int a[] = {10, 15, 18, 25, 43, 52, 74, 64, 21, 92};
		for(int i=0; i<10; i++){
		    System.out.println(a[i]);
		    
		    for( int j=1;  j<a[i]+1; j++){
		    	if(a[i] % j ==0){
		        System.out.print(j+" ");
		    	}
		    }
		    System.out.println();
		}
	}
}
