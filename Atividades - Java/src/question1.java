import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		
		System.out.printf("Digite o Número:");
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		
		if (N<0) {
			
			System.out.println("Negativo!");
		}
		
		else {
			System.out.println("Positivo!");
		}
	 
		
		
		
		sc.close();
		
	}	
	
	
}