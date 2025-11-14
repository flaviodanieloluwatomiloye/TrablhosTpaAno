
public class Vetor4 {

	public static void main(String[] args) {
		
		int a[] = {10, 15, 18, 25, 43, 52, 74, 64, 21, 92};
		for(int i=0; i<10; i++){
		    System.out.println(a[i]);
		    
		    for( int j=0; j<a[i]+1; j=j+2){
		    System.out.print(j+" ");
		    }
		    System.out.println();
		}
	}
}
