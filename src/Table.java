import java.util.Scanner;

public class Table {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        byte num = input.nextByte();
        System.out.println();
        table(num);
    }
    public static void table(byte num){
        byte i=1;
        System.out.println("Table of "+num+" is as follows -");
        while(i<=10){
            System.out.println(num+" * "+i+" = "+(num*i));
            i++;
        }
    }

}
