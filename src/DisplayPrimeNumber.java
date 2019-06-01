import java.util.Scanner;
public class DisplayPrimeNumber {
    public static void main(String[] args) {
        int max=100;
        for (int i=1;i<max;i++){
            int number =i;
            boolean isPrime=true;
            if (number<2) isPrime=false;
            for (int j=2;j<=Math.sqrt(number);j++){
                if (number%j==0) {
                    isPrime=false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(i);
        }
    }
}
