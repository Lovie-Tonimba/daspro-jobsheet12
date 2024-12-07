import java.util.Scanner;
public class DescendingSequenceRecursive10 {
    static int descendingSequenceIterative(int n){
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
        return 0;
    }
    static int descendingSequenceRecursive(int n){
        if(n == -1){
            return 0;
        }else{
            System.out.println(n);
            return descendingSequenceRecursive(n-1);
        }
        //another code
        // if(n >= 0){
        //     System.out.println(n);
        //     return descendingSequenceRecursive(n-1);
        // }else{
        //     return 0;
        // }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input numbers: ");
        int numbers = sc.nextInt();
        System.out.println("Iterative function: ");
        descendingSequenceIterative(numbers);
        System.out.println("Recursive function: ");
        descendingSequenceRecursive(numbers);
    }
}