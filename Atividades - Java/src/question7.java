import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {
		
		System.out.printf("Digite X e Y:");
		
		Scanner sc = new Scanner(System.in);		
		
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		
		if (x == 0 && y == 0) {			
			System.out.println("Origem");
			
		}
		
		if (x == 0 && y != 0) {			
			System.out.println("Eixo Y");
		}
		
		if (y == 0 && x != 0) {
			System.out.println("Eixo X");
			
		}
		
		if (x > 0 && y > 0) {
			System.out.println("Quadrante I");
		}
		
		if (x < 0 && y > 0) {
			System.out.println("Quadrante II");
		}
		
		if (x < 0 && y < 0) {
			System.out.println("Quadrante III");
		}
		
		if (x > 0 && y < 0) {
			System.out.println("Quadrante IV");
		}
		
		sc.close();		

	}

}
