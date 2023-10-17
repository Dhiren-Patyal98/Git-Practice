import java.util.Scanner;
public class sumMax 
{

    public static void main(String[] args)
{
 Scanner in = new Scanner(System.in);
 int[] arr1 = {2, 7, 12, 23, 40, 44, 67, 88, 102};
 int target1 = 19;
 int result = minSubArrayLen( target1,arr1);
 System.out.println(result);
 }
    public static int minSubArrayLen(int target, int [] nums) 
    {
    int arrLength = nums. length;
    int result = arrLength + 1;
    int j = 0;
    int sum = 0;
    for(int i=0; i<arrLength; i++)
    {
      sum = sum+nums [i];
      if (sum >= target)
      {
        while(sum >= target)
         {
           sum -= nums [j++];
         }
        result = Math.min(result, i-j+2);
      }
    }
    return result == nums.length+1 ?0:result;
    
}
}

    
 
  


 
    

