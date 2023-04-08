package stack;

public class AddAnElementToStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        try {
            stack.push(4);
            stack.push(2);
            stack.push(3);
            stack.push(5);
            stack.push(1);
            //stack.push(1);
            stack.pop();
            stack.peek();
            stack.printStack();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
