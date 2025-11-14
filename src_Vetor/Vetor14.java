
public class Vetor14 {

	public static void main(String[] args) {
		
		 int n[] = {42, 61, 51, 72, 3, 62, 74, 65, 41, 22};
         int[] m = new int[10];
         
         for(int i=0; i<10; i++) {
              m[i] = n[i];
         }
         
          for (int j = 0; j < 10; j++) {
              if (m[j] % 2 == 0) {
              m[j] = m[j] + 1;
              }
          }
          
          for (int k=0; k<10; k++) {
              System.out.println((n[k])+" "+m[k]);
          }

	}

}
