public class runnerTechnique {
//    for odd number of node ans is exactly middle one
//    1->2->3->4->5->x
//    ans = 3
//    for even number of node there are two ans possible
//    1->2->3->4->5->6->x
//    ans1 = 3
//    ans2 = 4
// i am writing 2 method first will give ans1 and 2nd method will give ans2
static Node nNodeLinkedList(){
    Node head = new Node(1);
    Node tail = head;
    for (int i = 2; i < 11; i++) {
        tail.next = new Node(i);
        tail = tail.next;
    }
    return head;
}
    static void display(Node head){
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    static int mid1OfLL(Node head){
        Node slow = head,fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    static int mid2OfLL(Node head){
        Node slow = head,fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    // kth last node problem
//    algo-1


    public static void main(String[] args) {
//    display(nNodeLinkedList());
//        System.out.println(mid1OfLL(nNodeLinkedList()));
//        System.out.println(mid2OfLL(nNodeLinkedList()));

    }
}
