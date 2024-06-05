public class merge2Sortedll {
    static void display(Node head){
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    static Node mergeLL(Node a,Node b){
        Node t1 = a;
        Node t2 = b;
        Node dummy = new Node(-7);
        Node temp = dummy;
        if(a == null)return b;
        if(b == null)return a;
        while (t1 != null && t2 != null){
            if (t1.data < t2.data){
                temp.next = t1;
                t1 = t1.next;
                temp = temp.next;
            }
            else {
                temp.next = t2;
                t2 = t2.next;
                temp = temp.next;
            }
        }
        temp.next = (t1 == null ) ? t2 : t1;
        return dummy.next;
    }
    public static void main(String[] args) {
Node l1Head = new Node(1);
     Node temp = l1Head;
        for (int i = 2; i < 35; i=i+4) {
            temp.next = new Node(i);
            temp = temp.next;
        }
        display(l1Head);
        Node l2Head = new Node(0);
        temp = l2Head;
        for (int i = 1; i < 10; i= 2*i+1) {
            temp.next = new Node(i);
            temp = temp.next;
        }
        display(l2Head);
      Node ans =  mergeLL(l1Head,l2Head);
      display(ans);
    }
}
