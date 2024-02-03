import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        byte num = input.nextByte();
        System.out.println("Factorial is : "+fact(num));
    }
    public static int fact(int num){
        if (num==0){
            return 1;
        }else{
            return num*fact(num-1);
        }
    }
}
