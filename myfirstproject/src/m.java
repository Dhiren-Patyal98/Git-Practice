import java.util.Scanner;

public class m{
public static void main(String[] args)
{
 Scanner in = new Scanner(System.in);
 int[] arr1 = {2, 7, 12, 23, 40, 44, 67, 88, 102};
 int[] arr2 = {3, 12, 14, 17, 23, 40, 41, 67, 108};
 int[] arr3 = {8, 12, 23, 40, 59, 86, 119, 130,};
 maxsum(arr1,arr2,arr3);
 }
 static void maxsum(int[] ar1,int[]ar2,int[]ar3)
 {
    
    int length1 =ar1.length + ar2.length ;
    int length = ar1.length + ar2.length + ar3.length;
    System.out.println(length);
    int[] arrayfinal1 = new int[length1];
    int[] arrayfinal2 = new int[length];
    int[] arrayfinal = new int[length];
        
    int i=0;
    int j=0;
    int z=0;
    int k=0;
    int m=0;
    int n=0;

     while(i<ar1.length && j<ar2.length )
    {
        if(ar1[i]<ar2[j] )
        {
            arrayfinal1[k]=ar1[i];
            i++;
           
        }
       
         else 
         {
             arrayfinal1[k]=ar2[j];
             j++;
         }
        k++;
        
        while( i< ar1.length)
        {
            arrayfinal1[k]= ar1[i];
            i++;
            k++;
        }

        while(j<ar2.length)
        {
            arrayfinal1[k]=ar2[j];
            j++;
            k++;
        }




 
        while(m<arrayfinal1.length && z<ar3.length )
    {
        if(arrayfinal1[m]<ar3[z] )
        {
            arrayfinal2[n]=arrayfinal1[m];
            m++;
           
        }
       
         else 
         {
             arrayfinal2[n]=ar3[z];
             z++;
         }
        n++;
    }
        
        while( m< arrayfinal1.length)
        {
            arrayfinal2[n]= arrayfinal1[m];
            m++;
            n++;
        }

        while(z<ar3.length)
        {
            arrayfinal2[n]=ar3[z];
            z++;
            n++;
        }
    }
    for(i=0;i<length;i++)
    {
         System.out.print(arrayfinal2[i]+ " , ");
     }
}
 }


    

//     while(i<ar1.length && j<ar2.length && z<ar3.length)
//     {
//         if(ar1[i]<ar2[j] && ar1[i]<ar3[z])
//         {
//             arrayfinal[k]=ar1[i];
//             i++;
           
//         }
//         else if(ar2[j]<ar1[i] && ar2[j]<ar3[z])
//         {
//              arrayfinal[k]=ar2[j];
//             j++;
//         }
//          else 
//          {
//              arrayfinal[k]=ar3[z];
//              z++;
//          }
//         k++;
//     }
// // if ar3 is out
//         while(i<ar1.length && j < ar2.length)
//         {
//            if(ar1[i]<ar2[j]) 
//            {
//              arrayfinal[k]=ar1[i];
//             i++;
//            }
           
        
//         else
//         {
//             arrayfinal[k]=ar2[j];
//             j++;

//         }
//         k++;
//     }
//     while(i  < ar1.length )
//     {
//         arrayfinal[k]=ar1[i];
//         i++;
//         k++;
//     }
//      while(j  < ar2.length )
//     {
//         arrayfinal[k]=ar2[j];
//         j++;
//         k++;
//     }

// //if ar1 is out
//      while(j<ar2.length && z < ar3.length)
//         {
//            if(ar2[j]<ar3[z]) 
//            {
//              arrayfinal[k]=ar2[j];
//             j++;
//            }
           
        
//            else
//           {
//             arrayfinal[k]=ar3[z];
//             z++;

//           }
//         k++;
//         }


//     while(j  < ar2.length )
//     {
//         arrayfinal[k]=ar2[j];
//         j++;
//         k++;
//     }
//      while(z  < ar3.length )
//     {
//         arrayfinal[k]=ar3[z];
//         z++;
//         k++;
//     }

//     //if ar2 is out 

//      while(i<ar1.length && z < ar3.length)
//         {
//            if(ar1[i]<ar3[z]) 
//            {
//              arrayfinal[k]=ar1[i];
//             i++;
//            }
           
        
//            else
//            {
//             arrayfinal[k]=ar3[z];
//             z++;

//            }
//           k++;
//         }


//     while(i  < ar1.length )
//     {
//         arrayfinal[k]=ar1[i];
//         i++;
//         k++;
//     }
//      while(z  < ar3.length )
//     {
//         arrayfinal[k]=ar3[z];
//         z++;
//         k++;
//     }

//     for(i=0;i<length;i++)
//     {
//         System.out.print(arrayfinal[i]+ " , ");
//     }

//  }
// }




