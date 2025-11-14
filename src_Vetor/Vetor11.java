import java.util.Scanner;

public class Vetor11 {

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        
        int a[] = new int [10];
        int b, c=0;
        
        System.out.println("incira os 10 valores:");
        for(int i=0; i<10; i++) {
        a[i]=in.nextInt();
        
        }
        System.out.println("qual valor vc procura?");
        b=in.nextInt();
        
        for(int j=0; j<10; j++) {
            if(b == a[j]) {
                c=b;
            }
        }
        if(c == b) {
        System.out.println("Sim, o valor "+ c +" está na lista");
        
        }else {
            System.out.println("O valor que vc procura não está no historico");
        }

	}

}
