import java.util.HashSet;

public class striver_14 extends striver_L5{
    static boolean loopDetect(Node head){
        Node temp = head;
        HashSet<Node> hs = new HashSet<>();
        while (temp != null){
            if (hs.contains(temp))return true;
            hs.add(temp);
            temp = temp.next;
        }
        return false;
    }
//    optimal solution
 static boolean hasCycle(Node head) {
    Node slow = head,fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast)return true;
    }
    return false;
}
    public static void main(String[] args) {
        int [] array1 = {1,2,3};
        int [] array2 = {6,7,8,7,6,3,4,5,6,1,2};
        Node ll1 = arr2LL(array1);
        Node ll2 = arr2LL(array2);
        int jump = 3;
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
        System.out.println(loopDetect(ll2));
        System.out.println(hasCycle(ll2));
    }
}
