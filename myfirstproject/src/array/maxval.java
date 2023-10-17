package array;
import java.util.Scanner;
import java.util.Arrays;
public class maxval {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int[] arr ={3,53,25,77,22,666,2234,25,7,0};
        System.out.println(max(arr));

    }
    public static int max(int[] arr)
    {
        int max= 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            
        }
        return max;
    }
    
}
