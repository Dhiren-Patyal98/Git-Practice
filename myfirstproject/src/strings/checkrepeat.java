package strings;

public class checkrepeat {
    public static void main(String[] args) {
        String h = "leetcodeee";
        String n = "leetoo";
        int ans = strStr(h,n);
        System.out.println(ans);
    }
    public static int strStr(String haystack, String needle) {
        int start = 0;
        int start1 = 0;
        int end = haystack.length()-1;
        int end1 = needle.length()-1;

        if(haystack.length()<needle.length())
        {
            return-1;
        }

        while(start1<=end1)
        {
            if(start<end)
            {
               if( haystack.charAt(start)==needle.charAt(start1))
               {
                 if(start1==end1)
                  {
                     return start-start1;
                  }
                   start++;
                   start1++;
                
                
              }
                else
                {
                  start1=0;
                  start++;
                 }
           }
           
        }
       return -1; 
    }
    
}
