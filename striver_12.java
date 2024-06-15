import java.util.HashSet;
public class striver_12 extends striver_L5{
    static Node intersectingNode(Node head1,Node head2){
        HashSet<Node> hs = new HashSet<>();
        Node temp = head1;
        while (temp != null){
            hs.add(temp);
            temp = temp.next;
        }
        temp = head2;
        while (temp != null){
            if (hs.contains(temp))return temp;
            temp = temp.next;
        }
        return null;
    }
//    optimal solution -1

    static Node intersectingNode2HelperFunction(Node t1,Node t2,int d){
        while (d > 0){
            t1 = t1.next;
            d--;
        }
        while (t1 != t2){
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
    }
    static Node intersectingNode2(Node head1,Node head2){
        if (head1 == null || head2 == null)return null;
        Node temp = head1;
        int lengthOfLL1 = 0,lengthOfLL2 = 0;
        while (temp != null){
            lengthOfLL1++;
            temp = temp.next;
        }
        temp = head2;
        while (temp != null){
            lengthOfLL2++;
            temp = temp.next;
        }
        int extraLength = Math.abs(lengthOfLL1-lengthOfLL2);
        if (lengthOfLL1 > lengthOfLL2){
           return intersectingNode2HelperFunction(head1,head2,extraLength);
        }
            return intersectingNode2HelperFunction(head2,head1,extraLength);
    }

    //    optimal solution -2
    static Node intersectingNode3(Node head1,Node head2){
        Node t1 = head1;
        Node t2 = head2;
        while (t1 != t2){
            t1 = t1.next;
            t2 = t2.next;
            if (t1 == t2)return t1;   // this line will avoid infinite loop
                                      // for two ll having no common node
            if (t1 == null)t1 = head2;
            if (t2 == null)t2 = head1;
        }
        return t1;
    }

    public static void main(String[] args) {
        HashSet<Node> hs = new HashSet<>();
        int [] array1 = {1,2,3};
        int [] array2 = {6,7,8,7,6,3,4,5,6,1,2};
        Node ll1 = arr2LL(array1);
        Node ll2 = arr2LL(array2);
        Node temp = ll2;
        for (int i = 1; i < 5; i++) {
            temp = temp.next;
        }
        ll1.next.next.next = temp;
        Node intersectingNode2 = intersectingNode2(ll1,ll2);
        System.out.println(intersectingNode2.data);
        Node ans = intersectingNode3(ll1,ll2);
        System.out.println(ans.data);
    }
}
