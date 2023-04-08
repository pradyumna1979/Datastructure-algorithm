package stack;

public class QueueUsingTwoStacks {
    private int TOP1=-1;
    private int TOP2= -1;
    private final int DEFAULT_SIZE=5;

    private final int[] stack1;

    private final int[] stack2;

    public QueueUsingTwoStacks() {
        stack1 = new int[DEFAULT_SIZE];
        stack2 = new int[DEFAULT_SIZE];
    }

    public QueueUsingTwoStacks(int SIZE) {
        stack1 = new int[SIZE];
        stack2 = new int[SIZE];
    }
    public int pushOnStack1(int data) throws Exception {
        if(isStack1Full()){
            throw new Exception("stack is full");
        }
        stack1[++TOP1] = data;
        return data;
    }
    public int pushOnStack2(int data) throws Exception {
        if(isStack2Full()){
            throw new Exception("stack is full");
        }
        stack2[++TOP2] = data;
        return data;
    }

    public int remove() throws Exception {
        int i = 0;
        if(isStack1Empty()){
            throw new Exception("stack is Empty");
        }
        while(TOP1!=0){
          pushOnStack2(pop1());
          TOP1--;
        }
        int removed = pop1();
        while(!isStack2Empty()){
            pushOnStack1(pop2());
            TOP2--;
        }
        return removed;
    }
    public int pop1() throws Exception {
        if(isStack1Empty()){
            throw new Exception("stack is Empty");
        }
        return stack1[TOP1--];
    }
    public int pop2() throws Exception {
        if(isStack2Empty()){
            throw new Exception("stack is Empty");
        }
        return stack2[TOP2--];
    }
    private boolean isStack1Empty() {
        return TOP1 == -1;
    }
    private boolean isStack2Empty() {
        return TOP2 == -1;
    }
    private boolean isStack1Full() {
        return TOP1 == stack1.length-1;
    }
    private boolean isStack2Full() {
        return TOP2 == stack2.length-1;
    }

}
