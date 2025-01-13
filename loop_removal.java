public class loop_removal {
    public static void removeLoop(Node head) {
        // code here
        // remove the loop without losing any nodes
        Node prev = null;
        Node slow = head,fast = head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)break;
        }
        if(fast == null || fast.next == null)return;
        if(slow == head){
            prev.next = null;
            return;
        }
        slow = head;
        prev = fast;
        while(slow != fast){
            prev = fast;
            fast = fast.next;
            slow = slow.next;
        }
        prev.next = null;
    }
    public static void main(String[] args) {

    }
}
