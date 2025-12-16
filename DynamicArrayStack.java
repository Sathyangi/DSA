public class DynamicArrayStack {
    private int[] stack;
    private int top;

    public DynamicArrayStack() {
        stack = new int[2];
        top = -1;
    }

    public void push(int x) {
        if (top == stack.length - 1) {
            resize(stack.length * 2);
        }
        stack[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        int val = stack[top--];
        if (top > 0 && top == stack.length / 4) {
            resize(stack.length / 2);
        }
        return val;
    }

    private void resize(int newSize) {
        int[] newStack = new int[newSize];
        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    public static void main(String[] args) {
        DynamicArrayStack stack = new DynamicArrayStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop()); // 30
        System.out.println(stack.pop()); // 20
        stack.push(40);
        System.out.println(stack.pop()); // 40
    }
}
