public class Queue {

    private int[] array;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public Queue(int size) {
        array = new int[size];
        capacity = size;
        front =0;
        rear =-1;
        count=0;
    }

    public void enqueue(int data) {

        if(isFull()){
            System.out.println("Overflow\n" +
                    "Program Terminated");
        }
        System.out.println("Inserting "+ data);
        rear = (rear + 1) % capacity;
        array[rear] =data;
        count++;
    }
    public int dequeue(){

        if(isEmpty()){
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        int x = array[front];

        front = (front + 1) % capacity;
        count--;
        return x;

    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        return array[front];

    }
    private boolean isEmpty() {
        return size() == 0;
    }

    private boolean isFull() {
        return size() == capacity;
    }
    public int size(){
        return count;
    }
    static class Main
    {
        public static void main (String[] args)
        {
            // create a queue of capacity 5
            Queue q = new Queue(5);

            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);

            System.out.println("The front element is " + q.peek());
            q.dequeue();
            System.out.println("The front element is " + q.peek());

            System.out.println("The queue size is " + q.size());

            q.dequeue();
            q.dequeue();

            if (q.isEmpty()) {
                System.out.println("The queue is empty");
            }
            else {
                System.out.println("The queue is not empty");
            }
        }
    }
}
