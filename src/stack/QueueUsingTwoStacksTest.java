package stack;

public class QueueUsingTwoStacksTest {
    public static void main(String[] args) {
        QueueUsingTwoStacks stack = new QueueUsingTwoStacks();
        try {
            stack.pushOnStack1(4);
            stack.pushOnStack1(2);
            stack.pushOnStack1(3);
            stack.pushOnStack1(5);
            stack.pushOnStack1(1);
            int removed = stack.remove();
            System.out.println(removed);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
