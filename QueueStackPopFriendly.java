import java.util.*;

public class QueueStackPopFriendly {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push is O(n)
    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop is O(1)
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.remove();
    }

    public static void main(String[] args) {
        QueueStackPopFriendly stack = new QueueStackPopFriendly();
        stack.push(3);
        stack.push(5);
        stack.push(7);
        System.out.println(stack.pop()); // 7
        System.out.println(stack.pop()); // 5
    }
}
