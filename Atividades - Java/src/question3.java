import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		
		System.out.printf("Digite dois N�meros: ");
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("N�meros M�ltiplos");
			
		}
		
		else {
			
			System.out.println("N�meros N�o M�ltiplos");
		}
		
		sc.close();
		

	}

}