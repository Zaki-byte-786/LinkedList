import java.util.HashMap;

public class striver_15 extends striver_L5{
    static int loopLength(Node head){
        HashMap<Node,Integer> hm = new HashMap<>();
        int index = 0;
        Node temp = head;
        while (temp != null){
            if (hm.containsKey(temp)){
              int oldIndex =  hm.get(temp);
              return index - oldIndex;
            }
            hm.put(temp,index);
            index++;
            temp = temp.next;
        }
        return 0;
    }

//    optimal solution
    static int lengthOfLoop(Node slow,Node fast){
        int count = 1;
        fast = fast.next;
        while (fast != slow){
            count++;
            fast = fast.next;
        }
        return count;
    }
    static int loopLength2(Node head){
        Node slow = head,fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)return lengthOfLoop(slow,fast);
        }
        return 0;
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
        System.out.println(loopLength(ll2));
        System.out.println(loopLength2(ll2));
    }
}
