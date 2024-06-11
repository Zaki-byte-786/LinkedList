public class striver_L5 {
    static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node arr2LL(int [] array){
        Node head = new Node(array[0]);
        Node temp = head;
        for (int i = 1; i < array.length; i++) {
            temp.next = new Node(array[i]);
            temp = temp.next;
        }
        return head;
    }
    static int llToNumberInReverseOrder(Node head){
        int number = 0,factor = 1;
        Node temp = head;
        while (temp != null){
            number += factor * temp.data;
            factor = factor * 10;
            temp = temp.next;
        }
        return number;
    }
    static Node numberToLLInReverseOrder(int number){
        Node temp = new Node(number % 10);
        Node head = temp;
        number = number / 10;
        while (number > 0 ){
            temp.next = new Node(number % 10);
            number = number / 10;
            temp = temp.next;
        }
        return head;
    }
//    striver Method
    static Node addToLL(Node head1,Node head2){
        int sum = 0;
        Node t1 = head1;
        Node t2 = head2;
        Node dummy = new Node(-1);
        Node current = dummy;
        while (t1 != null || t2 != null){
            if (t1 != null){
                sum += t1.data;
                t1 = t1.next;
            }
            if (t2 != null){
                sum += t2.data;
                t2 = t2.next;
            }
            current.next = new Node(sum % 10);
            sum /= 10;
            current = current.next;
        }
        if (sum > 0){
            current.next = new Node(sum);
        }
        return dummy.next;
    }
    public static void main(String[] args) {
     int [] array1 = {1,2,3};
     int [] array2 = {6,7,8,1,2};
     Node ll1 = arr2LL(array1);
     Node ll2 = arr2LL(array2);
//     display(ll1);
//        System.out.println(llToNumberInReverseOrder(ll1));
//        System.out.println(llToNumberInReverseOrder(ll2));
        int n1 = llToNumberInReverseOrder(ll1);
        int n2 = llToNumberInReverseOrder(ll2);
        int n = n1 + n2;
//        System.out.println(n);
//display(numberToLLInReverseOrder(n));
display(addToLL(ll1,ll2));
    }
}
