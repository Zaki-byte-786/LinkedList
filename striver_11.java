public class striver_11 extends striver_L6{
        static Node reverse(Node head){
            Node prev = null,curr = head;
            while(curr != null){
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
        public static Node addOne(Node head)
        {
            //code here.
            Node newHead = reverse(head);
            int carry = 1;
            Node temp = newHead;
            while(carry != 0 && temp != null){
                int nodeData = temp.data;
                temp.data = (nodeData + carry) % 10;
                carry = (nodeData + carry) / 10;
                temp = temp.next;
            }
            reverse(newHead);
            if(carry == 1){
                Node node = new Node(carry);
                node.next = head;
                return node;
            }
            return head;
        }

//    optimal solution
    static int backTrack(Node temp){
        if(temp == null)return 1;
        int carry = backTrack(temp.next);
        int node = temp.data;
        temp.data = (node + carry) % 10;
        return (node + carry) / 10;
    }
    public static Node addOne2(Node head)
    {
        //code here.
        int carry = backTrack(head);
        if(carry == 1){
            Node newHead = new Node(1);
            newHead.next = head;
            return newHead;
        }
        return head;

    }
    public static void main(String[] args) {
        int [] array1 = {1,2,3};
        int [] array2 = {6,7,8,7,6};
        Node ll1 = arr2LL(array1);
        Node ll2 = arr2LL(array2);
    }
}
