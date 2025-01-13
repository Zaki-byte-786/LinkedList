public class delete_every_Kth_Node {
    Node deleteK(Node head, int k) {
        // Your code here
        if(k == 1)return null;
        if(head == null || head.next == null)return null;
        Node prev = null,curr = head;
        int j = k;
        while(curr != null){
            while(curr != null && j > 1){
                prev = curr;
                curr = curr.next;
                j--;
            }
            if(curr == null)break;
            prev.next = curr.next;
            curr = curr.next;
            j = k;
        }
        return head;
    }
    public static void main(String[] args) {

    }
}
