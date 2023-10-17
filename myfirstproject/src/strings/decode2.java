package strings;

public class decode2 {
    public static void main(String[] args) {
        String a =  "9elc9me hello";
        String ans = code(a);
        System.out.println(ans);
   }
   public static String code (String a)
   {
      String s2 = a;
    for (int i = 0; i < s2.length(); i++) 
       {
          
           for(int j=0 ;j<=9; j++)
           {

            
             if(s2.charAt(i) == '9')
             {
                 System.out.println("h");
               for( int k=1 ; k<j ;k++)
               {
                   s2 = s2 + 'a';
                   System.out.println("h");
               }
   
             }
           }
       }
           
       
          
       
       
       
      return s2;
      
   }
 
}
