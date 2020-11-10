import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		
		System.out.printf("Código do Produto: ");
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		
		System.out.printf("Quantidade do Produto: ");
		
		double quantidade = sc.nextInt();
		
		double total = 0;
		
		if (codigo == 1) {
			
			total = 4.00 * quantidade;
			
		}
		
		if (codigo == 2) {
			
			total = 4.50 * quantidade;
			
		}

		if (codigo == 3) {
	
			total = 5.00 * quantidade;
	
		}
		
		if (codigo == 4) {
			
			total = 2.00 * quantidade;
			
		}
		
		if (codigo == 5) {
	
			total = 1.50 * quantidade;
	
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();

	}

}
