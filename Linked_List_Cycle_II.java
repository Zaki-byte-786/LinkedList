public class Linked_List_Cycle_II {

//    brute
//public ListNode detectCycle(ListNode head) {
//    HashSet<ListNode> set = new HashSet<>();
//    ListNode temp = head;
//    while(temp != null){
//        if(set.contains(temp))return temp;
//        set.add(temp);
//        temp = temp.next;
//    }
//    return null;
//}

//    optimal
//public ListNode detectCycle(ListNode head) {
//    ListNode slow = head,fast = head;
//    while(fast != null && fast.next != null){
//        slow = slow.next;
//        fast = fast.next.next;
//        if(fast == slow)break;
//    }
//    if(fast == null || fast.next == null)return null;
//    slow = head;
//    while(slow != fast){
//        slow = slow.next;
//        fast = fast.next;
//    }
//    return slow;
//}

}
