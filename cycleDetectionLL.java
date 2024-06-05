import java.util.HashSet;

public class cycleDetectionLL {
    static Node nNodeLinkedList(){
        Node head = new Node(1);
        Node a = new Node(121);
        head.next = a;
        Node b = new Node(144);
        a.next = b;
        Node tail = b;
        for (int i = 2; i < 11; i++) {
            tail.next = new Node(i);
            tail = tail.next;
        }
        tail.next = b;
        return head;
    }
    static void display(Node head){
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    static boolean cyclicDetectionMethod(Node head){
        HashSet<Node> hs = new HashSet<>();
        Node temp = head;
        while (temp != null){
            if (hs.contains(temp))return true;
            hs.add(temp);
            temp = temp.next;
        }
        return false;
    }
    static boolean cyclicDetectionMethod2(Node head){
        Node slow = head,fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)return true;
        }
        return false;
    }
    static Node breakCycle(Node head){
        HashSet<Node> hs = new HashSet<>();
        Node temp = head;
        Node previous = null;
        while (temp != null){
            hs.add(temp);
            previous = temp;
            temp = temp.next;
            if (hs.contains(temp)){
                previous.next = null;
                break;
            }
        }
        return head;
    }
    static Node breakCycle2(Node head){
        Node slow = head,fast = head,previous = null;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)break;
        }
        slow = head;
        while(slow != fast){
            previous = fast;
            slow = slow.next;
            fast = fast.next;
        }
        previous.next = null;
        return head;
    }
    static int loopBeginningElement(Node head){
        Node slow = head,fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)break;
        }
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
//     System.out.println(cyclicDetectionMethod2(nNodeLinkedList()));
//        display(breakCycle(nNodeLinkedList()));
        System.out.println(loopBeginningElement(nNodeLinkedList()));
       display(breakCycle2(nNodeLinkedList()));
    }
}
