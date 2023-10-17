package array;
import java.util.ArrayList;
import java.util.Scanner;
public class arry {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         ArrayList<Integer> list = new ArrayList<>();
        // list.add(65);
        // list.add(55);
        // list.add(74);
        // list.add(78);
        // list.add(25);

        // list.set(0,99);
        // list.remove(3);

        // System.out.println(list.contains(55));

        // System.out.println(list);
        for(int i=0;i<5;i++)
        {
            list.add(sc.nextInt());
        }
        System.out.println(list);

    }
}
