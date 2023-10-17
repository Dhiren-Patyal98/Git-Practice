package array;
import java.util.Scanner;
import java.util.Arrays;
public class swap {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] arr = {11,23,55,44,77};

        reverse(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void reverse(int[] arr)
    {
        int start=0;
        int end = arr.length - 1;
        while(start<end)
        {
            swap(arr , start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] arr, int index1,int index2)
    {
        int temp;
        temp = arr[index1] ;
       arr[index1] = arr[index2];
        arr[index2] = temp;


    }


    

    


    }
    

