
public class arrayToLL {
    static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    static int lengthOfLL(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    static Node array2ll(int [] array){
        Node head = new Node(array[0]);
        Node temp = head;
        for (int i = 1; i < array.length; i++) {
            temp.next = new Node(array[i]);
            temp = temp.next;
        }
        return head;
    }

    static Node removeHeadOfLL(Node head){
        Node temp = head;
        head = head.next;
        temp.next = null;
        return head;
    }
    static Node removeTailOfLL(Node head){
//        if (lengthOfLL(head) < 2)return null;
        // or we can say
        if (head == null || head.next == null)return null;
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    static Node removeAnyRandomNode(Node head,int k){
        Node temp = head;
        Node prev = null;
        if (head == null || head.next == null)return null; // size(ll) <= 1
        if (lengthOfLL(head) < k || k < 1)return head; // if k exceeds the length of ll
        if (k == 1){                          // for removing head
          prev = head;
          head = head.next;
          return head;
        }
        for (int i = 1; i < k; i++) {
            prev = temp;
            temp = temp.next;
        }
            prev.next = temp.next;
            return head;
    }
    static Node removeAParticularValue(Node head,int val){
        if (head == null)return null;
        if (head.data == val){
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null){
            if (temp.data == val){
               prev.next = temp.next;
               break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    static Node insertHead(Node head){
        Node temp = new Node(0);
        if (head == null)return temp;
        temp.next = head;
        return temp;
    }
    static Node insertTail(Node head){
        Node tail = new Node(5);
        if (head == null)return tail;

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = tail;
        return head;
    }
    static Node insertAtKthPosition(Node head,int K,int val){
        if (head == null){
            Node n = new Node(val);
            return n;
        }
        if (K == 1){
            Node previousNodeOfHead = new Node(val);
            previousNodeOfHead.next = head;
            return previousNodeOfHead;
        }
        if (K < 1 || K > lengthOfLL(head)){
            return head;
        }
        Node extraNode = new Node(val);
        Node previous = null;
        Node temp = head;
        for (int i = 1; i < K; i++) {
            previous = temp;
            temp = temp.next;
        }
        previous.next = extraNode;
        extraNode.next = temp;
        return head;
    }

    public static void main(String[] args) {
    int [] array = {1,2,3,4,7};
       Node ll = array2ll(array);
//       display(ll);
//       display(removeHeadOfLL(ll));
//        display(removeTailOfLL(ll));
//        display(removeAnyRandomNode(ll,1));

//        System.out.println(lengthOfLL(removeAnyRandomNode(ll,3)));
//        display(removeAParticularValue(ll,3));
//        display(insertHead(ll));
//        display(insertTail(ll));
display(insertAtKthPosition(ll,10,0));
    }
}
