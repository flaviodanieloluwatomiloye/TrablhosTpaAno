
public class Vetor10 {

	public static void main(String[] args) {
		
		int a[] = {21, 12, 54, 2, 1, 93, 3, 83, 75, 163};
		int b[] = {83, 51, 12, 64, 2, 86, 93, 153, 53, 75};
		int c[] = new int [10];
		int l=0;
		
		for (int i=0; i<10; i++) {
		     for(int j=0; j<10; j++) {
		         if (a[j] == b[i]) {
		             c[l] = b[i];
		             l++;
		         }
		     }
		}
		
		for(int k=0; k<l; k++) {
		System.out.println(c[k]);
		}

	}

}
