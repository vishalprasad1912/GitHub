import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the integer : ");
        int num = input.nextInt();
        System.out.println("Sum of all digits are : "+sum(num));

    }
    public static int sum(int num){
        int sum = 0;
        if(num<10){
            return num;
        }
        else{
            sum = num%10;
            num /=10;
            return sum+sum(num);
        }
    }
}

