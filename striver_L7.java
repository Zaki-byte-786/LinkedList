public class striver_L7 extends striver_L6 {
    static Node sort_0_1_2_List(Node head){
        int count_0 =0,count_1 =0,count_2 = 0;
        Node temp = head;
        while (temp != null){
            if (temp.data == 0)count_0++;
            else if (temp.data == 1) count_1++;
            else count_2++;
            temp = temp.next;
        }
        temp = head;
        while (count_0 != 0){
            temp.data = 0;
            count_0--;
            temp = temp.next;
        }
        while (count_1 != 0){
            temp.data = 1;
            count_1--;
            temp = temp.next;
        }
        while (count_2 != 0){
            temp.data = 2;
            count_2--;
            temp = temp.next;
        }
        return head;
    }
    // TC -> O(2N), SC -> O(1)
    static Node segregate(Node head) {
        // add your code here
        Node temp = head;
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);
        Node zero = zeroHead,one = oneHead,two = twoHead;
        while(temp != null){
            if(temp.data == 0){
                zero.next = temp;
                zero = temp;
            }
            else if(temp.data == 1){
                one.next = temp;
                one = temp;
            }
            else{
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }
        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;
        return zeroHead.next;
    }
    public static void main(String[] args) {
        int [] array1 = {1,2,3};
        int [] array2 = {1,0,1,2,0,2,1,0};
        Node ll1 = arr2LL(array1);
        Node ll2 = arr2LL(array2);
        display(sort_0_1_2_List(ll2));
        display(segregate(ll2));
    }
}
