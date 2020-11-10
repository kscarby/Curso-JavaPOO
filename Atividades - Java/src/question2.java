import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		
		System.out.printf("Digite um Número: ");
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N % 2 == 0) {
			System.out.println("Número PAR");
			
		}
		
		else {
			
			System.out.println("Número IMPAR");
		}
		
		sc.close();
		

	}

}
