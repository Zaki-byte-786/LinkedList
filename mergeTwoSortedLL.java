public class mergeTwoSortedLL {
    //brute force solution using external space
     ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        ListNode h1 = list1;
        ListNode h2 = list2;
        while(h1 != null && h2 != null){
            if(h1.val < h2.val){
                curr.next = new ListNode(h1.val);
                curr = curr.next;
                h1 = h1.next;
            }
            else if(h2.val < h1.val){
                curr.next = new  ListNode(h2.val);
                curr = curr.next;
                h2 = h2.next;
            }
            else{
                curr.next = new ListNode(h1.val);
                curr = curr.next;
                h1 = h1.next;
                curr.next = new  ListNode(h2.val);
                curr = curr.next;
                h2 = h2.next;
            }
        }
        while(h1 != null){
            curr.next = new ListNode(h1.val);
            curr = curr.next;
            h1 = h1.next;
        }
        while(h2 != null){
            curr.next = new ListNode(h2.val);
            curr = curr.next;
            h2 = h2.next;
        }
        return dummy.next;
    }


    // optimal -> SC - O(1)
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode dummy = new ListNode(-1);
//        ListNode curr = dummy;
//        ListNode h1 = list1;
//        ListNode h2 = list2;
//        while(h1 != null && h2 != null){
//            if(h1.val < h2.val){
//                curr.next = h1;
//                curr = curr.next;
//                h1 = h1.next;
//            }
//            else if(h2.val < h1.val){
//                curr.next = h2;
//                curr = curr.next;
//                h2 = h2.next;
//
//            }
//            else{
//                curr.next = h1;
//                curr = curr.next;
//                h1 = h1.next;
//                curr.next = h2;
//                curr = curr.next;
//                h2 = h2.next;
//            }
//        }
//        if(h1 != null)curr.next = h1;
//        if(h2 != null)curr.next = h2;
//        return dummy.next;
//    }

//    easy code
//public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//    ListNode dummy = new ListNode(-1);
//    ListNode temp = dummy;
//    ListNode t1 = list1,t2 = list2;
//    while(t1 != null && t2 != null){
//        if(t1.val < t2.val){
//            temp.next = t1;
//            temp = temp.next;
//            t1 = t1.next;
//        }
//        else{
//            temp.next = t2;
//            temp = temp.next;
//            t2 = t2.next;
//        }
//    }
//    if(t1 == null){
//        temp.next = t2;
//    }
//    if(t2 == null){
//        temp.next = t1;
//    }
//    return dummy.next;
//}
    public static void main(String[] args) {
    }
}
