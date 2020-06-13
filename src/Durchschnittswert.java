
import java.util.Scanner;

public class Durchschnittswert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr [] = new int [10];
		float sum = 0;
		System.out.println("Bitte 10 Integer eingeben.");
		for(int i = 0; i < 10 ;i++) {
			arr [i] = sc.nextInt();
		}
		//Mithilfe for-Schleife werden 10 Zahlen eingegeben.
		for(int elem : arr) {
			sum += elem;
		}
		//Mithilfe each for-Schleife rechnet man die Summe der Zahlen.
		System.out.println("Der durchschnittswert ist "+sum/10+".");
		/*Durchschnittwert ist die Summe durch Zusammenzahl der Elementen.
		 * Weil der Durchschnittswert Dezimale wäre, wird hier "sum" als float deklariert.
		 */
	}

}
