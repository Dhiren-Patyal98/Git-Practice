package array;
import java.util.Scanner;
import java.util.Arrays;
public class binarySearch 
{
    public static void main(String[] args)
    {
        int[] arr = {-8,-3,1,2,3,4,6,7,8,10};
        int target = 9;
        int ans = binarysearch( arr , target );
        System.out.println(ans);
    }

    public static int binarysearch(int[] arr1, int target1)
    {
        int start=0;
        int end = arr1.length-1;
        int middle = (start+end)/2;
        

        while(start <= end)
        {
            if(target1 == arr1[middle])
            {
                return middle;
            }
            else if(target1 > arr1[middle])
            {
                start = middle+1;
                middle = (start+end)/2;
            }
            else if( target1 < arr1[middle])
            {
                end = middle -1;
                middle =(start+end)/2;
            }

           
        }
       
        return arr1[end];

                


        
    }
    
}

