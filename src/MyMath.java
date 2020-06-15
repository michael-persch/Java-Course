import java.util.Scanner;
public class MyMath {
    Scanner sc = new Scanner(System.in);
    public int arrSumRechnen (){
        System.out.println("Wie viele Zahlen wollen Sie eingeben?");
        int index = sc.nextInt();
        int [] arr = new int [index];
        int sum = 0;
        for (int i = 0;i<index;i++){
            arr [i] = sc.nextInt();
            sum += arr[i];
        }
        return(sum);
    }
}
