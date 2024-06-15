public class striver_16 extends striver_L5{
    static int lengthOfLL(Node head){
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    static Node deleteMiddleNode(Node head){ // we will remove first middle element
        int length = lengthOfLL(head);
        if (head == null || head.next == null)return null;
        if (lengthOfLL(head) == 2)return head.next;
        int mid =(length / 2);
        int jump;
        if (length % 2 == 0){
           jump = mid - 2;
        }
        else {
            jump = mid - 1;
        }
        Node temp = head;
        while (jump > 0){
            temp = temp.next;
            jump--;
        }
        temp.next = temp.next.next;
        return head;
    }
    static Node deleteMiddleNode2(Node head){ // we will remove second middle element
        int length = lengthOfLL(head);
        if (head == null || head.next == null)return null;
        int mid =(length / 2);
           int jump = mid - 1;
        Node temp = head;
        while (jump > 0){
            temp = temp.next;
            jump--;
        }
        temp.next = temp.next.next;
        return head;
    }
     static Node deleteMiddle(Node head) {
        if(head == null || head.next == null)return null;
        Node slow = head,fast = head,previous = null;
        while(fast != null && fast.next != null){
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        previous.next = slow.next;
        return head;
    }
    public static void main(String[] args) {
        int [] array1 = {1,2,3};
        int [] array2 = {1,2,3,4,5,6};
        Node ll1 = arr2LL(array1);
        Node ll2 = arr2LL(array2);
        display(deleteMiddleNode(ll2));
    }
}
