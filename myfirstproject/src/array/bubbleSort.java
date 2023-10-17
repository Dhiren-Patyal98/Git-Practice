package array;
import java.util.Arrays;
import java.util.Scanner;
public class bubbleSort {
    public static void main(String[] args)
    {
        int[] arr = {5,2,9,3,6,2,55,22};
        int[] ans = bubblesort(arr);
        System.out.println(Arrays.toString(ans));
    }
    
    public static int[] bubblesort(int[] arr1)
    {
        ;
        for( int i=0 ; i < arr1.length ; i++)
        {
            for (int j =1 ; j < arr1.length-i ; j++ )
            {
                if( arr1[j]<arr1[j-1])
                {
                    int temp = arr1[j];
                    arr1[j]= arr1[j-1];
                    arr1[j-1] = temp;
                }

            }

        }
        return arr1;

    }
}
