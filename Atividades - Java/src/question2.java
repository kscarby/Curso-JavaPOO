import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		
		System.out.printf("Digite um N�mero: ");
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N % 2 == 0) {
			System.out.println("N�mero PAR");
			
		}
		
		else {
			
			System.out.println("N�mero IMPAR");
		}
		
		sc.close();
		

	}

}
