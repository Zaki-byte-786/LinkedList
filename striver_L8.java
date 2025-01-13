public class striver_L8 extends striver_L6 {
//    static Node lastKthNodeDelete(Node head,int K){
//        Node temp = head;
//        int lengthOfLL = 0;
//        while (temp != null){
//            lengthOfLL++;
//            temp = temp.next;
//        }
//        if (lengthOfLL == K){
//            Node newHead = head.next;
//            return newHead;
//        }
//        int nodeBehindDeletionNode = lengthOfLL - K;
//        temp = head;
//        for (int i = 1; i < nodeBehindDeletionNode; i++) {
//            temp = temp.next;
//        }
//        temp.next = temp.next.next;
//        return head;
//    }
//another brute solution

//    public ListNode removeNthFromEnd(ListNode head, int k) {
//        if(head == null || head.next == null)return null;
//        ListNode temp = head,prev = null;
//
//        int N = 0;
//        while(temp != null){
//            temp = temp.next;
//            N++;
//        }
//        if(k >= N){
//            ListNode curr = head;
//            head = head.next;
//            curr.next = null;
//            return head;
//        }
//        temp = head;
//        int j = N - k + 1;
//        while(j > 1){
//            prev = temp;
//            temp = temp.next;
//            j--;
//        }
//        prev.next = temp.next;
//        temp.next = null;
//        return head;
//    }

//    optimal solution
//static Node lastKthNodeDelete2(Node head,int K){
//        Node fast = head,slow = head;
//        while (K > 0){
//            fast = fast.next;
//            K--;
//        }
//        if (fast == null){
//            Node newHead = head.next;
//            return newHead;
//        }
//        while (fast.next != null){
//            fast = fast.next;
//            slow = slow.next;
//        }
//        slow.next = slow.next.next;
//        return head;
//}
//2nd optimal method


//    public ListNode removeNthFromEnd(ListNode head, int k) {
//        if(head == null || head.next == null)return null;
//        ListNode prev = null,fast = head,slow = head;
//        int jump = k;
//        while(fast != null && jump > 0){
//            fast = fast.next;
//            jump--;
//        }
//        if(fast == null)return head.next;
//        while(fast != null){
//            fast = fast.next;
//            prev = slow;
//            slow = slow.next;
//        }
//        prev.next = slow.next;
//        return head;
//    }


    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {1,0,1,2,0,2,1,0};
        Node ll1 = arr2LL(array1);
        Node ll2 = arr2LL(array2);
//    display(lastKthNodeDelete2(ll1,4));
    }
}
