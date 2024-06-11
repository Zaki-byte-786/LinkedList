import java.util.List;

class ListNode{
    int val;
    ListNode prev;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
public class doublyLinkedList {
    static int lengthOfDLL(ListNode head){
        ListNode temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    static void displayForward(ListNode head){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    static void displayBackward(ListNode tail){
        ListNode temp = tail;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    static ListNode arr2DLL(int[] array){
        ListNode head = new ListNode(array[0]);
        ListNode temp = head;
        for (int i = 1; i < array.length; i++) {
            temp.next = new ListNode(array[i]);
            temp.next.prev = temp;
            temp = temp.next;
        }
        return head;
    }
    static ListNode lastNode(ListNode head){
        ListNode temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        return temp;
    }
    static ListNode removeHead(ListNode head){
        if (head == null || head.next == null)return null;
        ListNode previousOfHead = head;
        head = head.next;
        previousOfHead.next = null;
        head.prev = null;
        return head;
    }
    static ListNode removeTail(ListNode head){
        if (head == null || head.next == null)return null;
        ListNode temp = head;
        ListNode tail = null;
        while (temp.next != null){
            temp = temp.next;
        }
        tail = temp.prev;
        tail.next = null;
        temp.prev = null;
        return head;
    }
    static ListNode removeKthNode(ListNode head,int K){
        if (head == null || head.next == null)return null;
        if (K == 1){
            ListNode temp = head;
            head = head.next;
            head.prev = null;
            temp.next = null;
            return head;
        }
        if(K < 1 || K > lengthOfDLL(head))return head;
        if (K == lengthOfDLL(head)){
            ListNode temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            ListNode tail = temp.prev;
            temp.prev = null;
            tail.next = null;
//            temp.prev.next = null; // Alternate lines of (89,90,91)
//            temp.prev = null;
            return head;
        }
        ListNode temp = head;
        for (int i = 1; i < K; i++) {
            temp = temp.next;
        }
        ListNode previousOfK = temp.prev;
        previousOfK.next = temp.next;
        temp.next.prev = previousOfK;
        return head;
    }
    static ListNode insertAtKthPosition(ListNode head,int K,int val){
        ListNode node = new ListNode(val);
           if (head == null || head.next == null)return node;
           if (K == 1){
               node.next = head;
               head.prev = node;
               return node;
           }
           if (K == lengthOfDLL(head) + 1){
               ListNode temp = head;
               while (temp.next != null){
                   temp = temp.next;
               }
               temp.next = node;
               node.prev = temp;
               return head;
           }
           if (K < 1 || K > lengthOfDLL(head))return head;
           ListNode temp = head;
        for (int i = 1; i < K; i++) {
            temp = temp.next;
        }
        ListNode prevOfTemp = temp.prev;
        prevOfTemp.next = node;
        node.prev = prevOfTemp;
        temp.prev = node;
        node.next = temp;
        return head;
    }
    static ListNode reverseDLL(ListNode head){
        ListNode temp = head;
        ListNode add = null;
        while (temp != null){
            add = temp.prev;
            temp.prev = temp.next;
            temp.next = add;
            temp = temp.prev;
        }
        return add.prev;
    }
    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        ListNode a = new ListNode(2);
//        ListNode b = new ListNode(3);
//        head.next = a;
//        a.prev = head;
//        a.next = b;
//        b.prev = a;
//        displayForward(head);
//        displayBackward(b);
        int [] array = {1,2,3,4,4,5};
        ListNode dll = arr2DLL(array);
//        displayForward(arr2DLL(array));
//        displayBackward(lastNode(arr2DLL(array)));
//        displayForward(removeHead(dll));
//        displayForward(removeTail(dll));
//        displayForward(removeKthNode(dll,6));
//displayForward(reverseDLL(dll));
//displayForward(insertAtKthPosition(dll,7,15));

    }
}
