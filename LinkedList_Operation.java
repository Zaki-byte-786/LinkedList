public class LinkedList_Operation {
    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("x");
    }
   static Node addElement(int val,Node head){
       if(head == null){
           head = new Node(val);
           return head;
       }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
       temp.next = new Node(val);
       temp = temp.next;
       return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        head.next = a;
        a.next = b;
        display(head);
        display(addElement(1,null));
        addElement(4,head);
        display(head);
        addElement(5,head);
        display(head);
    }
}
