import java.util.List;

public class striver_18 extends doublyLinkedList{
   static ListNode keyDeleteFromDLL(ListNode head, int key){
       ListNode temp = head;
       while (temp != null){
           if (temp.val == key){
               if (temp == head){
                   head = head.next;
               }
               ListNode prevNode = temp.prev;
               ListNode nextNode = temp.next;
               if (prevNode != null)prevNode.next = nextNode;
               if (nextNode != null)nextNode.prev = prevNode;
               temp = temp.next;
           }
           else temp = temp.next;
           }
return head;
   }
    public static void main(String[] args) {
        int [] array = {10,6,4,10,7};
        ListNode dll = arr2DLL(array);
displayForward(keyDeleteFromDLL(dll,10));
    }
}
