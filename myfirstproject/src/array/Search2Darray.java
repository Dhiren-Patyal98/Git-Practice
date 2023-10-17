package array;
import java.util.Scanner;
import java.util.Arrays;
public class Search2Darray {
    public static void main(String[] args)
    {
        int[][] arr = {{1,2,3},
                       {2,5},
                       {34,77,2},
                       {21,28,22,54}
                      };
        int target = 54;
        int[] ans = search(arr , target );
        System.out.println(Arrays.toString(ans));

    }
    public static int[] search(int[][] arr , int target)
    {

        for(int row=0; row < arr.length ; row++)
        {
            for( int col=0; col< arr[row].length;col++)
            {
            if( arr[row][col]== target)
            {
                return new int[]{row,col};
            }
            }

        }
          return new int[]{-1,-1};
    }
    
}
