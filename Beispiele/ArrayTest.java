
public class ArrayTest {

	public static void main(String[] args) {
		int arr[ ] = new int[3];
		//Ein Integer-Array mit 4 Elementen deklarieren.
		for (int i = 0; i < 3; i++) {
		arr[i] = i;
		}
		/*
		 Mit For Schleife Array arr zuordnen.
		 Das Integer-Array ist jetzt {0,1,2,3}.
		 */
		int res = arr[0] + arr[2];
		//res ist Summe der erste und dritte Element von arr. 0+2 =2
		System.out.println(res);
		//Wert 2 von res wird ausdruckt.
		
		
		int result = 0;
		for (int i = 0; i < 5; i++) {
		//Hier wird eine 5-Mal Schleife erstellt.
		if (i == 3) {
		result += 10;
		} else {
		result += i;
		}
		}
		//Jeder Runde wird result mit i addiert. Außerdem wenn i 3 wertet, wird 10 auf result addiert.
		//result ist (0+5)*5/2+7=17
		System.out.println(result);
		//Output ist 17.
		
		int Arr [] = new int [4];
		int Sum = 0;
		for (int j = 0; j < 4; j++) {
			Arr [j] = j*2;
		}
		// Hier wird ein Interger-Array mit 4 Elementen deklariert. {0,2,4,8}
		for (int elem : Arr) {
			Sum += elem;
		}
		System.out.println(Sum);
		//Hier wird die Summe aller Elemente Arr´s gerechnet und ausdruckt.
	}

}
