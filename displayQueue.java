import java.util.LinkedList;
import java.util.Queue;

public class displayQueue {
    static void display(Queue<Integer> q){
        Queue<Integer> helper = new LinkedList<>();
        int size = q.size();
        for (int i = 0; i < size; i++) {
            System.out.print(q.peek()+" ");
            helper.add(q.remove());
        }
        System.out.println();
        for (int i = 0; i < size; i++) q.add(helper.remove());

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println(q.size());
       display(q);
        System.out.println(q);

    }
}
