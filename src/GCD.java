import java.sql.SQLOutput;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        byte num1 = input.nextByte();
        System.out.print("Enter second number : ");
        byte num2 = input.nextByte();
        System.out.println("GCD of first and second number is : "+gcd(num1,num2));
    }
    public static int gcd(int num1, int num2){
        if (num1<num2){
            if ((num2 % num1) == 0) {
                return num1;
            }
            else{
                return gcd((num2 % num1),num1);
            }
        }
        else{
            if ((num1 % num2) == 0) {
                return num2;
            }
            else{
                return gcd((num1 % num2),num2);
            }
        }
    }
}
