class ArrayCircularQueue {
    int[] queue;
    int front, rear, size, capacity;
    
    ArrayCircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = size = 0;
        rear = capacity - 1;
    }
    
    boolean isFull() {
        return size == capacity;
    }
    
    boolean isEmpty() {
        return size == 0;
    }
    
    void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        
        System.out.println("Enqueued: " + item);
    }
    
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        
        System.out.println("Dequeued: " + item);
        
        return item;
    }
    
    public static void main(String[] args) {
        ArrayCircularQueue q = new ArrayCircularQueue(5);
        
        System.out.println("=== Enqueue Operations ===\n");
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        
        System.out.println("=== Dequeue Operations ===\n");
        int first = q.dequeue();
        int second = q.dequeue();
        
        System.out.println("=== Final Output ===");
        System.out.println("First dequeued: " + first);
        System.out.println("Second dequeued: " + second);
    }
}
