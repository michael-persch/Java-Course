import java.util.Scanner;
class MaxUndMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wie viele Zahlen wollen Sie eingeben?");
		int index = sc.nextInt();
		//Erst die Lange des Arrays bestätigen.
		int arr [] = new int [index];
		System.out.println("Bitte geben Sie Ihre Zahlen ein.");
		for (int i = 0; i<index; i++) {
			arr [i] = sc.nextInt();
		}
		//Hier werden die Zahlen zu Array arr gefüllt.
		int x;
		for(int j = 0;j<index-1;j++) {
			for(int k = 0; k< index-j-1;k++) {
				if (arr [j] < arr [j+k+1]) {
					x = arr [j];
					arr [j] = arr [j+k+1];
					arr [j+k+1] = x;
					//Mit Hilfe der Variable x können die Werte von arr[j] und arr [j+k+1] tauschen.
					
				}
			}
		}
		/* In der Schleife werden 2 benachbarte Zahlen verglichen.
		 * Falls die rechte Zahl größer als die linke, werden die beiden Zahlen vertauscht.
		 * Dann wird eine Position weiter nach rechts gegangen und das Verfahren widerholt.
		 * Nach dem ersten Durchgang befindet sich auf diese Weise die größte Zahl der Arrays arr ganz links.
		 * Hier wird es durch k kontrolliert.*/
		/* Es folgen weitere Durchgänge, bis schließlich alle Zahlen an der richtigen Position stehen.
		 * Hier wird es durch j kontrolliert. */
		System.out.println("Die größte eingegebene Zahl ist "+arr[0]+".");
		System.out.println("Die kleinste eingegebene Zahl ist "+arr[index-1]+".");
	}

}
