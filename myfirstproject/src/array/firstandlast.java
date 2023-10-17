package array;
import java.util.Arrays;
import java.util.Scanner;
public class firstandlast {
    public static void main(String[] args)
    {
        public int[] searchRange(int[] nums, int target) 
    {
        int [] ans ={-1,1};
        int start = search(nums , target , true);
        int end   = search(nums ,target  , false);

        ans[0]=start;
        ans[1]=end;
        return ans;

        static int search(int[] nums , int target , boolean findindex)
        {
            int start= 0;
            int end = nums.length-1;
            int ans=-1;

            while( start<=end)
            {
                int middle = start+(end-start)/2;
                if( target < nums[middle])
                {
                    end= middle-1;
                }
                else if ( target > nums[middle])
                {
                    start = middle+1;
                }
                else 
                {
                    ans = middle;

                  if(findindex==true)
                 {
                    end=middle-1;
                 }
                 else
                    start=middle+1;
                }
            }
            return ans;
        }

    }
    }
    
}
