import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        byte num = input.nextByte();
        if (primeCheck(num)) {
            System.out.println("It is a prime number.");
        } else {
            System.out.println("It is not a prime number.");
        }
    }

    public static boolean primeCheck(int num) {
        int i = 2;
        boolean flag = true;
        if (num < 2) {
            return flag =false;
        } else {
            while (i < num) {
                if ((num % i) == 0) {
                    flag = false;
                    break;
                } else {
                    i++;
                }
            }
            return flag;
        }
    }
}