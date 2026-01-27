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
   - Approach: Recursion
   - File: RabbitProblem.java

### Submission IV

### 1. Tower of Hanoi

Recursive algorithm to move all disks from source rod to destination rod using an auxiliary rod, following the rules of the Tower of Hanoi problem.
- Time Complexity: O(2ⁿ)
- Approach: Recursion
File: TowerOfHanoi.java

### 2. Bubble Sort Algorithm

A simple comparison-based sorting algorithm that repeatedly swaps adjacent elements if they are in the wrong order.
- Time Complexity:
- Best Case: O(n)
- Average Case: O(n²)
- Worst Case: O(n²)
- Approach: Iterative
File: BubbleSort.java

### 3. Optimized Bubble Sort Algorithm

An improved version of Bubble Sort that stops early if no swaps occur in a pass, reducing unnecessary iterations.
- Time Complexity:
- Best Case: O(n)
- Average Case: O(n²)
- Worst Case: O(n²)
- Approach: Iterative with early termination
File: OptimizedBubbleSort.java

### 4. Insertion Sort Algorithm

A comparison-based sorting algorithm that builds the sorted array one element at a time by inserting elements into their correct position.
- Time Complexity:
- Best Case: O(n)
- Average Case: O(n²)
- Worst Case: O(n²)
- Approach: Iterative
File: InsertionSort.java

### Submission V

### 1. Optimized Insertion Sort Algorithm

A comparison-based sorting algorithm that builds the sorted array one element at a time by inserting elements into their correct position with reduced unnecessary shifts.

- Time Complexity:
- Best Case: O(n)
- Average Case: O(n²)
- Worst Case: O(n²)
- Approach: Iterative
File: OptimizedInsertionSort.java

### 2. Selection Sort Algorithm

A comparison-based sorting algorithm that repeatedly selects the minimum element from the unsorted part of the array and places it at the beginning.

- Time Complexity:
- Best Case: O(n²)
- Average Case: O(n²)
- Worst Case: O(n²)
- Approach: Iterative
- File: SelectionSort.java

### 3. Merge Sort Algorithm

A divide-and-conquer sorting algorithm that divides the array into smaller subarrays, sorts them recursively, and merges them to produce a sorted array.

- Time Complexity:
- Best Case: O(n log n)
- Average Case: O(n log n)
- Worst Case: O(n log n)
- Approach: Recursive
File: MergeSort.java

### 4. Quick Sort Algorithm

A divide-and-conquer sorting algorithm that selects a pivot element and partitions the array such that elements smaller than the pivot are placed on the left and larger elements on the right.

- Time Complexity:
- Best Case: O(n log n)
- Average Case: O(n log n)
- Worst Case: O(n²)
- Approach: Recursive
File: QuickSort.java

### Submission VI

### 1.Optimized Quick Sort Algorithm

An improved version of Quick Sort that uses a better pivot selection strategy (Median of Three) to reduce the chances of worst-case performance and improve average efficiency.

- Time Complexity:
- Best Case: O(n log n)
- Average Case: O(n log n)
- Worst Case: O(n²)
- Approach: Recursive with optimized pivot selection
File: OptimizedQuickSort.java

### 2.Binary Search Tree (BST)

A hierarchical data structure in which each node has at most two children, and for every node, all elements in the left subtree are smaller and those in the right subtree are larger. Supports efficient insertion, deletion, and searching operations.

- Time Complexity:
- Best Case: O(log n)
- Average Case: O(log n)
- Worst Case: O(n)
- Approach: Recursive
File: BinarySearchTree.java

### 3.AVL Tree

A self-balancing Binary Search Tree in which the height difference between left and right subtrees is maintained within ±1 using rotations. This ensures balanced structure and guarantees logarithmic time complexity for operations.

- Time Complexity:
- Best Case: O(log n)
-  Average Case: O(log n)
- Worst Case: O(log n)
- Approach: Recursive with rotations
- File: AVLTree.java

   
Each file contains a `main()` method with sample test cases.
