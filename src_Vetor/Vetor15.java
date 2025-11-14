
public class Vetor15 {

	public static void main(String[] args) {
		
		//Acho que o resultado ta errado mas foi o que eu entendi
		
		int A[] = {5, 8, 3, 9, 1, 6, 7, 2, 4, 10};
        int B[] = {3, 8, 4, 1, 1, 7, 7, 5, 2, 10};
        int C[] = new int[10];
 
        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i]) {
                C[i] = 1;
            }
            else if (A[i] == B[i]) {
                C[i] = 0;
            }
            else {
                C[i] = -1;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println( C[i]);
        }

	}

}
