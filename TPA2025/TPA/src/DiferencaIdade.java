public class DiferencaIdade {
public static void main(String[] args) {
		
		int i = 1340;
        int j = 1450;
        int anos = 0;
 
        while (i <= j) {
            i = i + 25;
            j = j + 20;
            anos = anos + 1;
        }
 
        System.out.println("Irá demorar " + anos + " anos para que João fique mais alto que Pedro");
	}
}