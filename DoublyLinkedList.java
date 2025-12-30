class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;
        
        Node(int data) {
            this.data = data;
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
        newNode.prev = temp;
    }
    
    void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        
        System.out.println("=== Insert Operations ===\n");
        list.insert(5);
        list.insert(15);
        list.insert(25);
        
        System.out.println("\n=== Final Output ===");
        list.displayForward();
    }
}
