import java.util.*;

public class QueueStackPushFriendly {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push is O(1)
    public void push(int x) {
        q1.add(x);
    }

    // Pop is O(n)
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int popped = q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return popped;
    }

    public static void main(String[] args) {
        QueueStackPushFriendly stack = new QueueStackPushFriendly();
        stack.push(3);
        stack.push(5);
        stack.push(7);
        System.out.println(stack.pop()); // 7
        stack.push(9);
        System.out.println(stack.pop()); // 9
        System.out.println(stack.pop()); // 5
    }
}
