import java.util.*;

public class StackQueueEnqueueFriendly {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Enqueue is O(1)
    public void enqueue(int x) {
        s1.push(x);
    }

    // Dequeue is O(n)
    public int dequeue() {
        if (s1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        while (s1.size() > 1) {
            s2.push(s1.pop());
        }
        int dequeued = s1.pop();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return dequeued;
    }

    public static void main(String[] args) {
        StackQueueEnqueueFriendly queue = new StackQueueEnqueueFriendly();
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(7);
        System.out.println(queue.dequeue()); // 3
        System.out.println(queue.dequeue()); // 5
    }
}
