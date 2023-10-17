package strings;

public class palindrome {
    public static void main(String[] args)
    {
        String name = "aabbaa";
        boolean ans = ispalindrome(name);
        System.out.println(ans);

    }
    static boolean ispalindrome(String str)
    {
        if( str.length() == 0)
        {
            return false;
        }
        str = str.toLowerCase();
        int start =0;
        int end = str.length()-1;

        while(start <= end )
        {
            if(str.charAt(start) != str.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
}
