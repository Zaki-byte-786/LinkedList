import java.util.LinkedList;
import java.util.Queue;

public class Basics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
//        q.remove();
//        System.out.println(q);
//        System.out.println(q.peek());
//        System.out.println(q.element()); //
//        System.out.println(q.size());

        // code to display queue
     for (int element : q){
         System.out.print(element+" ");
     }

    }
}
