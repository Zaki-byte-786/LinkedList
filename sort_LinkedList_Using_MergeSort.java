import java.util.ArrayList;
import java.util.Collections;

public class sort_LinkedList_Using_MergeSort {
//    brute
//public ListNode sortList(ListNode head) {
//    ArrayList<Integer> arl = new ArrayList<>();
//    ListNode temp = head;
//    while(temp != null){
//        arl.add(temp.val);
//        temp = temp.next;
//    }
//    Collections.sort(arl);
//    temp = head;
//    for(int x : arl){
//        temp.val = x;
//        temp = temp.next;
//    }
//    return head;
//}



//    optimal
    ListNode middleNode(ListNode head){
        if(head == null || head.next == null)return head;
        ListNode slow = head,fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    ListNode mergeList(ListNode head1,ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode t1 = head1,t2 = head2;
        while(t1 != null && t2 != null){
            if(t1.val <= t2.val){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }
            else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if(t1 != null){
            temp.next = t1;
        }
        if(t2 != null){
            temp.next = t2;
        }
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode mid = middleNode(head);
        ListNode lefthead = head;
        ListNode righthead = mid.next;
        mid.next = null;
        lefthead = sortList(lefthead);
        righthead = sortList(righthead);
        return mergeList(lefthead,righthead);
    }
    public static void main(String[] args) {

    }
}
