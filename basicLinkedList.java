class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
    void display(Node a){
        while (a != null){
            System.out.print(a.data+" ");
            a = a.next;
        }
    }
}

public class basicLinkedList {
   static void recursionDisplay(Node a){
        if (a == null)return;
        System.out.print(a.data+" ");
        recursionDisplay(a.next);
    }
    static int linkedListLength(Node a){
       int count = 0;
       while (a != null){
           count++;
           a = a.next;
       }
       return count;
    }
   static Node nNodeLinkedList(){
        Node head = new Node(1);
        Node tail = head;
        for (int i = 2; i < 10; i++) {
            tail.next = new Node(i*2);
            tail = tail.next;
        }
        return head;
    }
    static Node insertAtHead(Node head,int data){
       Node x = new Node(data);
       x.next = head;
       return x;
    }

    static Node insertAtRandomPosition(Node head,int data,int position){
        Node x = new Node(data);
        Node temp = head;
        Node temp2 = null;
        if (position == 0){
            return insertAtHead(head,data);
        }
        if (position > linkedListLength(head))return head;
        for (int i = 1; i <=position-1; i++) {
            temp = temp.next;
        }
        temp2 = temp.next;
        temp.next = x;
        x.next = temp2 ;
        return head;
    }

//     to get the kth Node data (Node starts from k = 0)

    static int KthNodeData(Node head,int K){
       if(K >= linkedListLength(head))return -1;
       Node temp = head;
        for (int i = 1; i <= K ; i++) {
            temp = temp.next;
        }
            return temp.data;
    }

   /* Q -> given a sorted ll connect the given element at its correct position
   */
//my code

//    static Node insertElementInSortedLL(Node head,int data){
//        Node x = new Node(data);
//        Node temp = head;
//        Node tempPrevious = null;
//        if ( head == null || temp.data >= x.data ){ // head == null handle null ll
//            x.next = temp;
//            return x;
//        }
//        while (temp.data <= x.data && temp.next != null){
//            tempPrevious = temp;
//            temp = temp.next;
//        }
//        if (temp.next == null){
//            temp.next = x;
//            return head;
//        }
//        tempPrevious.next = x;
//        x.next = temp;
//        return head;
//    }

//  sir code

//    static Node insertElementInSortedLL2(Node head,int data){
//        Node x = new Node(data);
//        Node temp = head;
//        Node tempPrevious = null;
//        if (head == null || x.data <= head.data){
//            x.next = head;
//            return x;
//        }
//        while (temp.next != null && temp.data < x.data ){
//            tempPrevious = temp;
//            temp = temp.next;
//        }
//        if (temp.next == null){
//            temp.next = x;
//            return head;
//        }
//        tempPrevious.next = x;
//        x.next = temp;
//        return head;
//    }

//    static Node insertElementInSortedLL3(Node head,int data){
//        Node x = new Node(data);
//        Node temp = head;
//        if (head == null || x.data <= head.data){
//            x.next = head;
//            return x;
//        }
//        while (temp.next != null && temp.next.data < x.data ){
//            temp = temp.next;
//        }
//         x.next = temp.next;
//        temp.next = x;
//        return head;
//    }

//    Q --> reverse a ll

//    static Node reverseLinkedList(Node head){
//        Node previous = null;
//        Node n = null;
//        Node current = head;
//        while (current != null){
//            n = current.next;
//            current.next = previous;
//            previous = current;
//            current = n;
//        }
//        return previous;
//    }

    static int sizeOfLL(Node head){
        int count = 0;
        Node temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
            static Node reverseKElementGroupLinkedList(Node head,int K){
        if (sizeOfLL(head) < K){
           return head;
        }
        int count = 0;
        Node previous = null;
        Node current = head;
                Node n = null;
        while (count < K){
          n = current.next;
          current.next = previous;
          previous = current;
          current = n;
          count++;
        }
                head.next = reverseKElementGroupLinkedList(current,K);

        return previous;
    }

    public static void main(String[] args) {
        Node a = new Node(3); // 3
        Node b = new Node(5); // 3  5
        Node c = new Node(9); // 3  5  9
        Node d = new Node(12);// 3  5  9  12
        a.next = b;                // 3->5  9  12
        b.next = c;                // 3->5->9  12
        c.next = d;                // 3->5->9->12
        // now we want to add a node 'e' of data 10 between b & c
        // i.e  3->5->7->9->12
//        Node e = new Node(7);
//        b.next = e;
//        e.next = c;

//        printing the linkList

//        System.out.println(a.data);                   // 3
//        System.out.println(a.next.data);              // 5
//        System.out.println(a.next.next.data);         // 9
//        System.out.println(a.next.next.next.data);    // 12

//        printing the linkList using while loop

//        Node temp = a;
//        while (temp != null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }

//        cant we avoid temp variable

//        while (a != null){
//            System.out.print(a.data+" ");
//            a = a.next;
//        }
//        System.out.println(a.data);  // throwing an error because the a node has lost its original
                                     // position now it is pointing to a null node that is not
                                     // even created hence error is coming

//        using function
//        a.display(a);
//        System.out.println();
//        System.out.println(a.data);
//since we have used function the original a was not changed but the a of function is changing
//                so yes we can do it using function

//        display the list using recursion
//          recursionDisplay(a);
//        System.out.println();
//         int length = linkedListLength(a);
//        System.out.println(length);

//  creating n Node linked List
        Node linkedList = nNodeLinkedList();
//        a.display(linkedList);
//       linkedList =  insertAtHead(linkedList,10);
//        a.display(linkedList);
//        a.display(a);
//        a.display(linkedList);
//        System.out.println();
//        a.display(linkedList);
//      Node ll = insertAtRandomPosition(linkedList,21,12);
//        a.display(ll);
//       int kthNodedata =  KthNodeData(linkedList,3);
//        System.out.println(kthNodedata);
//        Node sortedll = insertElementInSortedLL3 (linkedList,3);
//        a.display(sortedll);

//Node reversellans =  reverseLinkedList(linkedList);
//a.display(reversellans);
a.display(linkedList);
        System.out.println();
Node ans = reverseKElementGroupLinkedList(linkedList,2);
a.display(ans);
    }
}
