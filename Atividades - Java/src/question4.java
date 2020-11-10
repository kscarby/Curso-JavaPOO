import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		
		System.out.printf("Hora Inicial:");
		
		Scanner sc = new Scanner(System.in);
		int HI = sc.nextInt();
		
		System.out.printf("Hora Final:");
		
		int HF = sc.nextInt();
		
		int D;
		if (HI < HF) {
			D = HF - HI;
		
		}
		
		else {
			
			D = 24 - HI + HF;
			
		}
		
		System.out.println("Duração do Jogo: " + D + " horas!");
		
		
		
		sc.close();
		

	}

}
