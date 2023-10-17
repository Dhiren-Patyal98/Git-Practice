package array;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number");
        num = sc.nextInt();
        int sum=0;
        int temp = num;
        int rev=0;

        while(num!=0)
        {
            rev = num%10;
            sum = (sum*10)+rev;
            num = num/10;
        }
        if(temp == sum )
        {
            System.out.println("palindrome");
        }
        else
        System.out.println("not a palindrome");

    }
    
}
