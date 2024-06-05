public class linkedList_Scaler_2 {
   static void display(Node a){
        while (a != null){
            System.out.print(a.data+" ");
            a = a.next;
        }
    }
    static Node linkedList(){
        Node head = new Node(1);
        Node tail = head;
        for (int i = 2; i < 7; i++) {
            tail.next = new Node(i);
            tail = tail.next;
        }
        return head;
    }

    static int targetUsingRecursion(Node head,int target){
       if (head == null)return -1;
       if (head.data == target )return 0;
       else {
           int subLLIndex = targetUsingRecursion(head.next,target);
           if (subLLIndex == -1)return -1;
           else return subLLIndex + 1;
       }
    }
    static int llLength(Node head){
       Node temp = head;
       int count = 0;
       while (temp != null){
           count++;
           temp = temp.next;
       }
       return count;
    }
    static int midNodeData(Node head){
       int lengthOfLL = llLength(linkedList());
       int mid = lengthOfLL / 2;
       Node temp = head;
       if (lengthOfLL % 2 == 0){
           for (int i = 1; i <= mid-1; i++) {
                temp = temp.next;
           }
       return temp.data;
       }
       else{
           for (int i = 1; i <= mid ; i++) {
               temp = temp.next;
           }
           return temp.data;
        }
    }

    public static void main(String[] args) {
   Node ll = linkedList();
    display(ll);
        System.out.println();
//        System.out.println(targetUsingRecursion(ll,8));
        System.out.println(midNodeData(ll));
    }
}
