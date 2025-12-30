import java.util.Stack;

class StackQueueDequeueFriendly {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    
    // Enqueue operation - O(n)
    void enqueue(int x) {
        System.out.println("Enqueuing: " + x);
        
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }
    
    // Dequeue operation - O(1)
    int dequeue() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = stack1.pop();
        System.out.println("Dequeuing: " + removed);
        return removed;
    }
    
    public static void main(String[] args) {
        StackQueueDequeueFriendly q = new StackQueueDequeueFriendly();
        
        System.out.println("=== Queue Operations ===\n");
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        
        System.out.println("=== Dequeue Operations ===\n");
        
        int first = q.dequeue();
        int second = q.dequeue();
        
        System.out.println("=== Final Output ===");
        System.out.println("First dequeued: " + first);
        System.out.println("Second dequeued: " + second);
    }
}
