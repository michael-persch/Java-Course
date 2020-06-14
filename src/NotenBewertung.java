import java.util.Scanner;

public class NotenBewertung {

	public static void main(String[] args) {
		System.out.println("Wie viel Punkte hast du?");
		Scanner sc = new Scanner(System.in);
		int Punkte = sc.nextInt();
		int Note;
		if (Punkte<20) {Note = 6;}
		else if(Punkte<60) {Note = 5;}
		else if(Punkte<80) {Note = 4;}
		else if(Punkte<90) {Note = 3;}
		else if(Punkte<95) {Note = 2;}
		else {Note = 1;}
		System.out.println("Dein Note ist "+Note+".");

	}

}
