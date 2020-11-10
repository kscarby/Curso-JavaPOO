import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
		
		System.out.printf("Digite um Valor: ");
		
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		
		if(valor >= 0 && valor <=25) {
			
			System.out.println("Intervalo [0,25]");
			
		}
		if(valor >= 25 && valor <=50) {
			
			System.out.println("Intervalo [25,50]");
			
		}
		if(valor >= 50 && valor <= 75) {
	
			System.out.println("Intervalo [50,75]");
	
		}
		if(valor >= 75 && valor <= 100) {
	
			System.out.println("Intervalo [75,100]");
	
		}
		else if (valor < 0 || valor > 100) {
	
			System.out.println("Fora de Intervalo");
	
		}
			
			

		sc.close();
	}

}
