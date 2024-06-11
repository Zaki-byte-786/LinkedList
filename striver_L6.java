public class striver_L6 {
    static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node arr2LL(int [] array){
        Node head = new Node(array[0]);
        Node temp = head;
        for (int i = 1; i < array.length; i++) {
            temp.next = new Node(array[i]);
            temp = temp.next;
        }
        return head;
    }
    static Node oddEvenSegregate(Node head){
        Node newHead = head,odd = head,even = head.next;
        Node dummy = new Node(-1);
        Node temp = dummy;
        while (odd != null){
             temp.next = new Node(odd.data);
             temp = temp.next;
             if (odd != null && odd.next != null){
                 odd = odd.next.next;
             }
             else break;
         }
        while (even != null){
            temp.next = new Node(even.data);
            temp = temp.next;
            if (even != null && even.next != null){
                even = even.next.next;
            }
            else break;
        }
        dummy = dummy.next;
        while (newHead != null){
            newHead.data = dummy.data;
            newHead = newHead.next;
            dummy = dummy.next;
        }
        return head;
    }

//    optimize solution

    static Node oddEvenList(Node head) {
        Node odd = head;
        Node even = head.next,secondNode = head.next;
        if(head == null || head.next == null)return head;
        while(even != null && even.next != null){ // even agar last hoga to odd
//                                                   to safe rhega na
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = secondNode;
        return head;
    }
    public static void main(String[] args) {
        int [] array1 = {1,2,3};
        int [] array2 = {6,7,8,1,2,4,3,5};
        Node ll1 = arr2LL(array1);
        Node ll2 = arr2LL(array2);
//        display(oddEvenSegregate(ll2));
display(oddEvenList(ll2));
    }
}
