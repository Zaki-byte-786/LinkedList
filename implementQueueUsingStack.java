import java.util.Stack;
class implementQueueUsingStackOptimised{
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    void push(int x){
        input.push(x);
    }
    int remove(){
        if (!output.isEmpty())return output.pop();
        else{
            while (!input.isEmpty()){
                output.push(input.pop());
            }
          return output.pop();
        }
    }
    int peek(){
        if (!output.isEmpty())return output.peek();
        else {
            while (!input.isEmpty()){
                output.push(input.pop());
            }
        return output.peek();
        }
    }
}
public class implementQueueUsingStack {
    int size = 0;
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    void push(int x){
        while (!s1.isEmpty()){
        s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        size++;
    }
    int remove(){
        if (size == 0)return -1;
        int x = s1.pop();
        size--;
        return x;
    }
    int peek(){
        return s1.peek();
    }
    boolean isEmpty(){
        if (size == 0)return true;
        return false;
    }


    public static void main(String[] args) {
        implementQueueUsingStack queue = new implementQueueUsingStack();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.s1);
        queue.remove();
        System.out.println(queue.s1);
        System.out.println(queue.peek());
        implementQueueUsingStackOptimised queue2 = new implementQueueUsingStackOptimised();
        queue2.push(1);
        queue2.push(2);
        queue2.push(3);
        queue2.push(4);
        System.out.println(queue2.input);
        queue2.remove();
        System.out.println(queue2.output);
        System.out.println(queue2.peek());

    }
}
