class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
  class LL{
    Node head = null,tail = null;
    int size = 0;

     void add(int x){
         Node temp = new Node(x);
        if (size == 0){
      head = tail = temp;
        }
        else {
            tail.next = temp;
            tail = tail.next;
        }
        size++;
    }
    int remove(){
         if (size == 0){
             System.out.println("Queue is empty!");
             return -1;
         }
         else {
             int x = head.val;
             head = head.next;
             size--;
             return x;
         }
    }
    void display(){
         Node temp = head;
         while (temp != null){
             System.out.print(temp.val+" ");
             temp = temp.next;
         }
        System.out.println();
    }
}
public class queueImplementationUsingLL {
    public static void main(String[] args) {
    LL ll = new LL();
    ll.add(1);
    ll.display();
        ll.add(2);
        ll.display();
        ll.add(3);
        ll.display();
    }
}
