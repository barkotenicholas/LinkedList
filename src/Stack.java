
public class Stack {
    private final int[] array;
    private final int capacity;
    private int top;

    public Stack(int size) {
        array = new int[size];
        capacity = size;
        top =-1;
    }

    public void push(int data){

        if(isFull()){
            System.out.println("Overflow--\n" +
                    "Program Terminated--\n");
        }
        System.out.println("Inserting "+ data);
        array[++top] = data;
    }

    public int pop(){

        if(isEmpty()){
            System.out.println("Underflow--\n" +
                               "Program Terminated--");
        }
        System.out.println("Removing"+ peek());
        return array[top--];
    }

    private int peek() {
        if(!isEmpty()){
            return array[top];
        }
        else {
            System.exit(-1);
        }
        return -1;
    }

    public int size(){
        return top + 1;
    }

    public boolean isFull(){
        return top == capacity - 1;
    }
    public boolean isEmpty(){

        return top == -1;
    }
    static class Main
    {
        public static void main (String[] args)
        {
            Stack stack = new Stack(3);

            stack.push(1);      // inserting 1 in the stack
            stack.push(2);      // inserting 2 in the stack

            stack.pop();        // removing the top element (2)
            stack.pop();        // removing the top element (1)

            stack.push(3);      // inserting 3 in the stack

            System.out.println("The top element is " + stack.peek());
            System.out.println("The stack size is " + stack.size());

            stack.pop();        // removing the top element (3)

            // check if the stack is empty
            if (stack.isEmpty()) {
                System.out.println("The stack is empty");
            }
            else {
                System.out.println("The stack is not empty");
            }
        }
    }
}
