package array;

public class compare {
    public static void main(String[] args)
    {
         String a = "hello world";
         String b = "hello World";
        
       boolean ans = comparee(a,b);
       System.out.println(ans);
        
    }
      static boolean comparee(int a,int b)
        {
            if( a == b)
            {
                return true;
            }
            return false;

        }
        static boolean comparee( int[] a, int[] b)
        {
            if(a.length == b.length)
            {
              for(int i=0; i<a.length;i++ )
             {
                if(a[i]!=b[i])
                {
                    return false;
                }

             }
             
            }
            else if(a.length != b.length)
            {
                return false;
            }
            return true;
        }
        static boolean comparee(String a ,String b)
        {
            // String[] s1 = a.split(" ");
            // String[] s2 = b.split(" ");
            if(a.length() == b.length() )
            {
                for (int i = 0; i < b.length(); i++)
                 {
                   if(a.charAt(i) != b.charAt(i)) 
                   {
                    return false;
                   }
                }
                
            }
            else if(a.length() != b.length() )
            {
                return false;
            }
            return true;

        }
    
}
