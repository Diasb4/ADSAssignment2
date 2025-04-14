# MyDataStructures

The project implements custom data structures in Java without using `java.util.*` (except `Iterator`).

## Structure

- **MyList.java**: Interface for list operations.
- **MyArrayList.java**: A list based on a dynamic array.
- **MyLinkedList.java**: A bi-linked list.
- **MyStack.java**: Stack (LIFO) based on MyArrayList.
- **MyQueue.java**: Queue (FIFO) based on MyLinkedList.
- **MyMinHeap.java**: MyArrayList-based minimal heap for comparable items.

## Design Choices

- **MyStack**: Uses MyArrayList for O(1) operations with end.
- **MyQueue**: Uses MyLinkedList for O(1) operations on both ends.
- **MyMinHeap**: Uses MyArrayList to efficiently implement a binary heap in an array.

## Usage

```java
MyStack<Integer> stack = new MyStack<>();
stack.push(1);
System.out.println(stack.pop()); // 1

MyQueue<String> queue = new MyQueue<>();
queue. enqueue("hello");
System.out.println(queue.dequeue()); // hello

MyMinHeap<Integer> heap = new MyMinHeap<>();
heap.add(3);
heap.add(1);
System.out.println(heap.removeMin()); // 1

Translated with DeepL.com (free version)