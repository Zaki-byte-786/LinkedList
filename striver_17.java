import java.util.HashSet;
public class striver_17 extends striver_L5{

    static Node startingNodeOfLoop(Node head){
        HashSet<Node> hs = new HashSet<>();
        Node temp = head;
        while (temp != null){
            if (hs.contains(temp))return temp;
            hs.add(temp);
            temp = temp.next;
        }
        return null;
    }
//    optimal solution
static Node startingNodeOfLoop2(Node head){
        Node slow = head,fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                fast = head;
                while (fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
return null;
}
    public static void main(String[] args) {
        int [] array1 = {1,2,3};
        int [] array2 = {6,7,8,7,6,3,4,5,6,1,2};
        Node ll1 = arr2LL(array1);
        Node ll2 = arr2LL(array2);
        int jump = 5;
        Node temp1 = ll2;
        while (temp1.next != null){
            temp1 = temp1.next;
        }
        Node temp2 = ll2;
        while (jump > 0){
            temp2 = temp2.next;
            jump--;
        }
        temp1.next = temp2;
    }
}
