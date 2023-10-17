package array;
import java.util.Scanner;
import java.util.Arrays;

public class fibonice {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x=0;
        int y=1;
        int z=0;
        int n ;
        
        System.out.print("enter value of n");
        n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println(z);
            arr[i] = z;

            x=y;
            y=z;
            z=x+y;


        }
        for(int i= n-2; i >=0 ;i--)
        {
            System.out.println(arr[i]);
        }
        
    }
    

    
}
