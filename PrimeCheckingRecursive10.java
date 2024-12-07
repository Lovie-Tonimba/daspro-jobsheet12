import java.util.Scanner;
public class PrimeCheckingRecursive10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input numbers: ");
        int numbers = sc.nextInt();

        if(primeCheckingRecursive(numbers)){
            System.out.println(numbers + " is a prime number");
        }else{
            System.out.println(numbers + " is not a prime number");

        }
    }
    static int i = 2;
    static boolean primeCheckingRecursive(int n){
        if(n <= 1){
            return false;
        }
        if(i == n/2+1){
            return true;
        }
        if(n % i == 0){
            return false;
        }else{
            i++;
            return primeCheckingRecursive(n);
        }
    }
}