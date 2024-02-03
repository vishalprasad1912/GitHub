import java.util.Scanner;

public class OddSum {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number : ");
        byte num = input.nextByte();
        System.out.println("Sum of odd numbers from 1 to "+ num+" is : "+oddSum(num));

    }
    public static byte oddSum(byte num){
        byte i = 1;
        byte sum = 0;
        while(i<=num){
            sum +=i;
            i +=2;
        }
        return sum;
    }
}
