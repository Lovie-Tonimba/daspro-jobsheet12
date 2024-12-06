
import java.util.Scanner;

public class DescendingSequenceRecursive10 {
    static int descendingSequenceIterative(int n){
        int sequence = 0;
        for (int i = n; i > 0; i--) {
            sequence = 0;
            sequence += i;
            System.out.println(sequence);
        }
        return sequence;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input numbers: ");
        int numbers = sc.nextInt();

        System.out.println(descendingSequenceIterative(numbers));
    }
}
