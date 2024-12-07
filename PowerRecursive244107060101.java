import java.util.Scanner;
public class PowerRecursive244107060101 {
    static int calculatePower(int base, int pow){
        if(pow == 0){
            return 1;
        }else{
            return base * calculatePower(base, pow-1);
        }
    }
    static String calculatePowerString(int base, int pow){
        if(pow == 0){
            return "1";
        }else if(pow == 1){
            return String.valueOf(base);
        }else{
            return base + "x" + calculatePowerString(base, pow - 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Base Number: ");
        int base = input.nextInt();
        System.out.print("Input Power Number: ");
        int power = input.nextInt();
        
        // System.out.println("Result of " + base + " power " + power + " = " + calculatePower(base, power));
        String modif = calculatePowerString(base, power);
        System.out.println(modif + "x1 = " + calculatePower(base, power));
    }
}