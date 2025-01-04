public class reverse_LL_of_K_size_group {
    int size(ListNode head){
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(size(head) < k)return head;
        ListNode prev = null,curr = head;
        int count = 0;
        while(count < k){
            ListNode Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
            count++;
        }
        head.next = reverseKGroup(curr,k);
        return prev;
    }
}
