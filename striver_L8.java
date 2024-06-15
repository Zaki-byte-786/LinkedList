public class striver_L8 extends striver_L6 {
    static Node lastKthNodeDelete(Node head,int K){
        Node temp = head;
        int lengthOfLL = 0;
        while (temp != null){
            lengthOfLL++;
            temp = temp.next;
        }
        if (lengthOfLL == K){
            Node newHead = head.next;
            return newHead;
        }
        int nodeBehindDeletionNode = lengthOfLL - K;
        temp = head;
        for (int i = 1; i < nodeBehindDeletionNode; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

//    optimal solution
static Node lastKthNodeDelete2(Node head,int K){
        Node fast = head,slow = head;
        while (K > 0){
            fast = fast.next;
            K--;
        }
        if (fast == null){
            Node newHead = head.next;
            return newHead;
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
}
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {1,0,1,2,0,2,1,0};
        Node ll1 = arr2LL(array1);
        Node ll2 = arr2LL(array2);
    display(lastKthNodeDelete2(ll1,4));
    }
}
