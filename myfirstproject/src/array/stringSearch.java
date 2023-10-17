package array;
import java.util.Scanner;
import java.util.Arrays;
public class stringSearch {
    public static void main (String[] args)
    {
        String name ="dhiren";
        char target = 'd';
        boolean ans = Search(name,target);
        System.out.println(ans);


    }

    public static boolean Search(String name1 , char target1) 
    {
        for(int i=0; i<name1.length();i++)
        if(name1.charAt(i)== target1)
        {
            return true;
        }
        return false;
    }
    
}
