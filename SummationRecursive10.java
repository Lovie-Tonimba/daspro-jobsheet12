import java.util.Scanner;
public class SummationRecursive10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input numbers: ");
        int numbers = sc.nextInt();

        int sum = sumRecursive(numbers);
        System.out.println(sumRecursiveString(numbers) + " = " + sum);
    }
    static int sumRecursive(int n){
        if(n == 0){
            return 0;
        }else{
            return n + sumRecursive(n - 1);
        }
    }
    static String sumRecursiveString(int n){
        if(n == 1){
            return "1";
        }else{
            return sumRecursiveString(n - 1) + "+" + n;
        }
    }
}