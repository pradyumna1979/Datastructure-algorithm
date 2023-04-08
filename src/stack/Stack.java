package stack;

public class Stack {
    private int SIZE = 5;
    private int top = -1;
    private int[] stack;

    public Stack() {
        this.stack = new int[SIZE];
    }
    public int push(int data) throws Exception {
        if(isFull()){
            throw new Exception("stack is full");
        }
        stack[++top] = data;
        return data;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("stack is Empty");
        }
        return stack[top--];
    }
    private boolean isEmpty(){
        return top == -1;
    }
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("stack is Empty");
        }
        return stack[top];
    }

    private boolean isFull() {
        return top == SIZE-1;
    }
    public void printStack() throws Exception {
        for (int i = 0; i < stack.length; i++) {
            System.out.println(pop());
        }
    }

}
