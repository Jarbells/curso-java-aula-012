import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int initialHour = sc.nextInt();
		int finalHour = sc.nextInt();
		int result;
		
		if (initialHour < finalHour) {
			result = finalHour - initialHour;
		}
		else {
			result = 24 - initialHour + finalHour;
		}
		
		System.out.println("O JOGO DUROU " + result + " HORA(S)");
		
		sc.close();
	}
}
