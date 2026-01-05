# DSA – Stack and Queue Implementations

This repository contains Java implementations of Stack and Queue data structures
using different approaches as part of academic submissions.

## Submission I

### 1. QueueStack – Push Friendly
- Stack implemented using two Queues
- Push: O(1)
- Pop: O(n)
- File: QueueStackPushFriendly.java

### 2. QueueStack – Pop Friendly
- Stack implemented using two Queues
- Push: O(n)
- Pop: O(1)
- File: QueueStackPopFriendly.java

### 3. Unbounded Array Stack
- Stack implemented using dynamic array
- Automatically grows and shrinks
- File: DynamicArrayStack.java

### 4. StackQueue – Enqueue Friendly
- Queue implemented using two Stacks
- Enqueue: O(1)
- Dequeue: O(n)
- File: StackQueueEnqueueFriendly.java

## Submission II

### 1. StackQueue – Dequeue Friendly 
Queue implemented using two Stacks 
- Enqueue: O(n) 
- Dequeue: O(1) 
- Concept: 
o Always keep the front element on top of stack1 
o While enqueuing, move elements between stacks to maintain order
- File:  StackQueueDequeueFriendly.java

### 2. Array Circular Queue 
Queue implemented using a fixed-size circular array 
- Enqueue: O(1) 
- Dequeue: O(1) 
- Advantage: Efficient memory usage (no shifting)
- File:  ArrayCircularQueue.java
  
### 3. Singly Linked List 
Linked list where each node points to the next node 
- Insert at end: O(n) 
- Display: O(n)
- File:  SinglyLinkedList.java
  
### 4. Doubly Linked List 
Linked list with previous and next pointers 
- Forward traversal: O(n) 
- Backward traversal: O(n) 
- Advantage: Easy reverse traversal
- File:  DoublyLinkedList.java
  
## Submission III

### 1. Circular Doubly Linked List  
   Circular linked list with previous and next pointers  
  - Traversal: O(n)  
  - File: CircularDoublyLinkedList.java

### 2. Linked List Stack  
   Stack implemented using linked list  
- Push: O(1)  
- Pop: O(1)  
- File: LinkedListStack.java  

### 3. Linked List FIFO Queue  
   Queue implemented using linked list  
 -  Enqueue: O(1)  
 -  Dequeue: O(1)  
 -  File: LinkedListFIFOQueue.java  

### 4. Rabbit Problem  
   Fibonacci-based population growth problem  
  - File: RabbitProblem.java  
   

Each file contains a `main()` method with sample test cases.
