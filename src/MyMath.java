public class MyMath {
    public int arrSumRechnen (int[] integersToSumUp){
        int sum = 0;
        for (int i = 0;i<integersToSumUp.length;i++){
            sum += integersToSumUp [i];
        }
        return(sum);
    }
}
