import java.util.LinkedList;
import java.util.Queue;

public  class implementStackUsingQueue {
//   Queue<Integer> q1 = new LinkedList<>();
//    Queue<Integer> q2 = new LinkedList<>();
//   void push(int x){
//        q2.add(x);
//        while (!q1.isEmpty()){
//            q2.add(q1.remove());
//        }
//        Queue<Integer> temp = q1;
//        q1 = q2;
//        q2 = temp;
//    }
//    int pop(){
//       int x = q1.remove();
//       return x;
//    }
//    int top(){
//       if (q1.isEmpty()){
//           System.out.println("Stack is empty!");
//           return -1;
//       }
//       return q1.peek();
//    }


//    optimal approach
//    i.e. using single QUEUE

    Queue<Integer> q1 = new LinkedList<>();
    int size = q1.size();
    void push(int x){
        q1.add(x);
        size++;
        int count = size;
        while (count > 1){
            q1.add(q1.remove());
            count--;
        }
    }
    int top(){
        if (q1.isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        return q1.peek();
    }
    int pop(){
        if (q1.isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        int x = q1.remove();
        return x;
    }
    public static void main(String[] args) {
        implementStackUsingQueue stack = new implementStackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.q1);
        stack.pop();
        System.out.println(stack.q1);
        System.out.println(stack.top());
        System.out.println(stack.q1);
    }
}
