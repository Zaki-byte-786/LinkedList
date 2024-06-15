public class striver_L9 extends striver_L6{
    static Node reverseLL(Node head){
        if (head == null || head.next == null)return head;
        Node prev = null,n = null,current = head;
        while (current != null){
             n = current.next;
             current.next = prev;
             prev = current;
             current = n;
        }
        return prev;
    }

//    recursive approach
    static Node reverseLL2(Node head){
        if (head == null || head.next == null)return head;
        Node newHead = reverseLL2(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        int [] array1 = {1,2,3};
        int [] array2 = {1,0,1,2,0,2,1,0};
        Node ll1 = arr2LL(array1);
        Node ll2 = arr2LL(array2);
//        display(reverseLL2(ll2));


    }
}
