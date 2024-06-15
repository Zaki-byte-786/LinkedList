import java.util.Stack;

public class striver_10 extends striver_L5{
    static boolean palindrome(Node head){
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while (temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null){
            if (temp.data != st.peek())return false;
            temp = temp.next;
            st.pop();
        }
        return true;
    }
//    optimal solution
public static Node reverse(Node head) {
    Node prev = null;
    Node curr = head;
    while(curr != null) {
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}

    public static boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node rev = reverse(slow.next); // reverse second list
        Node newHead = rev;
        while(rev != null) {
            if(head.data != rev.data) {
                reverse(newHead);
                return false;
            }
            head = head.next;
            rev = rev.next;
        }
        reverse(newHead);
        return true;
    }
    public static void main(String[] args) {
        int [] array1 = {1,2,3};
        int [] array2 = {6,7,8,7,6};
        Node ll1 = arr2LL(array1);
        Node ll2 = arr2LL(array2);
//        System.out.println(palindrome(ll2));
        System.out.println(isPalindrome(ll2));
    }
}
