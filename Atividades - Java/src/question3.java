import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		
		System.out.printf("Digite dois Números: ");
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("Números Múltiplos");
			
		}
		
		else {
			
			System.out.println("Números Não Múltiplos");
		}
		
		sc.close();
		

	}

}