package strings;

public class decode 
{
    public static void main(String[] args) 
    {
         String a =  "wel5come hel3o";
         String ans = decoder(a);
         System.out.println(ans);
    }

   

    public static String decoder(String a)
{
    String s2 ="";
    String s5 ="";
    String s4 ="";
    String[] s1 = a.split(" ");
    int length = s1.length;
    for (int z = length-1; z >=0; z--) 
    {
        
    
      s2 = s2 + s1[z];
    
        s2 = s2+" ";
    } 
    char[] s3 = s2.toCharArray();
    for (int i = 0; i < s3.length; i++) 
    {
        
        if (s3[i] >= '2' && s3[i] <= '9')
        {
            char w = s3[i];
            int x = Character.getNumericValue(w);
            System.out.println(x);
            for(int j = 1 ;j<x;j++)
            {
              s4 =s4 + s3[i-1];
              
            }
            i++;
        }
        s4 = s4 + s3[i];
      }
        
    

   
    return s4;
    





    
    
      
  
    
   
    

}
}
