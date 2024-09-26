class queueImplementation{
    int front = 0,rear = -1,x = 0;
    int [] array = new int[5];
    int size = 0;
     void add(int data){
         if (size == array.length){
             System.out.println("Queue is full!");
             return;
         }
         rear = (rear + 1) % array.length;
            array[rear] = data;
            size++;
    }
    int remove(){
         if(size == 0) {System.out.println("Queue is empty!");
             return -1;
         }
         front = (front + 1) % array.length;
         x = array[front];
         size--;
         return x;
    }
    void display(){
        for (int i = front; i <= rear; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

}
public class queueImplementationUsingArray {
    public static void main(String[] args) {
queueImplementation q = new queueImplementation();
q.add(1);
q.add(2);
q.add(3);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.add(1);
        q.display();
        q.add(2);
        q.display();
        q.add(3);
        q.display();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.add(1);
        q.display();
        q.add(2);
        q.display();
        q.add(3);
        q.display();
    }
}
