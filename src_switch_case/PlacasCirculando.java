import java.util.Scanner;
 
public class PlacasCirculando {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int u;
		
		System.out.println("Informe o ultimo digito da sua placa:");
		u = in.nextInt();
		
		switch(u) {
			case 1:
			case 2:
				System.out.println("Circulação do veiculo somente nas segundas-feiras");
				break;
			case 3:
			case 4:
				System.out.println("Circulação do veiculo somente nas terças-feiras");
				break;
			case 5:
			case 6:
				System.out.println("Circulação do veiculo somente nas quartas-feiras");
				break;
			case 7:
			case 8:
				System.out.println("Circulação do veiculo somente nas quintas-feiras");
				break;
			case 9:
			case 0:
				System.out.println("Circulação do veiculo somente nas sextas-feiras");
				break;
			default:
				System.out.println("Seu carro não se encontra cadstrado no Detran, atualize a sua placa");		
		}
	}
 
}