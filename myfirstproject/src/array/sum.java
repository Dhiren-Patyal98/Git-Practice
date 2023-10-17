package array;
import java.util.Scanner;


public class sum {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input");
        String a = sc.nextLine();
        // String a = "88";
        char j = a.charAt(0);
        boolean b1;
        if(b1 = Character.isDigit(j))
        {
            String[] Arr = a.split(" ");
            int[] array = new int [Arr.length];
            for (int i = 0; i < Arr.length; i++)
             {
               array[i] = Integer.parseInt(Arr[i]); 
             }
              int ans = output(array);
              System.out.println(ans); 

        }
        else
        {
             String ans = output(a);
             System.out.println(ans); 

        }
        
     
    
       
    }
    public static int output(int[] a)
    {
        int sum1=0;
        for (int i = 0; i < a.length; i++) 
        {
            sum1= sum1 +a[i];
            
        }
        return sum1;
    }
    public static String output( String a)
    {
        String[] s1 = a.split(" ");
        String s2 ="";
         for (int i = 0; i < s1.length; i++)
          {
            s2 = s2 + s1[i];
            
         }
         return s2;
    }
    
}
