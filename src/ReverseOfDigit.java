import java.util.Scanner;

public class ReverseOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer : ");
        int num = input.nextInt();
        System.out.println("Reverse of given number is : " + reverse(num));
    }

    public static int reverse(int num) {
        int num2 = 0;
        if (num < 10) {
            return num;
        } else {
            num2 = (num % 10)*10;
            num /= 10;
            return num2 + reverse(num);
        }
    }
}
