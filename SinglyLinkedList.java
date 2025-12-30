class SinglyLinkedList {
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    Node head = null;
    
    void insert(int data) {
        System.out.println("Inserting: " + data);
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }
    
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
        System.out.println("=== Insert Operations ===\n");
        list.insert(10);
        list.insert(20);
        list.insert(30);
        
        System.out.println("\n=== Final Output ===");
        list.display();
    }
}
