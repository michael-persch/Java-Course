
public class arr {

	public static void main(String[] args) {
		 int arr [][] = new int [3][3];
		 for(int i = 0;i<3; i++) {
			 for(int j = 0;j<3;j++) {
				 arr[i][j] = i+j;
			 }
		 }
		 //Hier wird ein 2-dimensionales Array mithilfe for-Schleife initializiert.
		 
		 System.out.println(arr[2][2]);
		 //arr[2][2]=2+2=4, hier wird 4 ausgedruckt.

	}

}
