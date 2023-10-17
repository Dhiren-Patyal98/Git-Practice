package package1;

public class palindrome {


    private Node head;
    private Node headd;
    private Node tail;

    private int size;
    
     public palindrome()
     {
         this.size = 0;
    }

    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next =head;
        head =node;

        if(tail == null)
        {
            tail = head;
        }
        size += 1;
    }

    public void middleNode()
    {
       Node slow = head;
       Node fast = head;
       
       while((fast != null && fast.next != null))
       {
        slow = slow.next;
        fast = fast.next.next;
       }
       System.out.println(slow.value);
       
        headd = slow;
        System.out.println(headd.value);
       }


    public void display() 
    {
        Node temp = headd;
        while(temp != null)
        {
            System.out.print(temp.value + "->");
            temp = temp.next;

        }
        System.out.println("end");

    }

    public void reverselist()
    {
        if( headd == null || headd.next == null)
        {
        return ;
        }
        Node prev = headd;
        Node present = headd.next;

       while( present != null)
        {
            Node nextNode = present.next;
            present.next =prev;

            prev = present;
            present = nextNode;
        
        }
        headd.next = null;
        headd = prev;
        
    }

    public boolean palindrome1()
    {
         middleNode();
         reverselist();
         while(head != null && headd != null)
         {
            if ( head.value != headd.value)
            {
                break;
            }
            head = head.next;
            headd = headd.next;
         }
         if ( head == null || headd == null)
         {
            System.out.println("palindrome");
            return true ;
         }
         System.out.println("not palindrome");
         return false;
         

    }

    
    private class Node
    {
        private int value;
        private Node next;
        
        public Node(int value)
        {
            this.value = value;

        }
        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }
}
