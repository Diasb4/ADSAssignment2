package Datastructures;

public class Main {
    public static void main(String[] args) {
        // Тест MyArrayList
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1, 3);
        System.out.println("MyArrayList: " + arrayList.get(1)); // 3
        arrayList.remove(0);
        System.out.println("MyArrayList size: " + arrayList.size()); // 2

        // Тест MyLinkedList
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add(1, "c");
        System.out.println("MyLinkedList: " + linkedList.get(1)); // c
        linkedList.remove(0);
        System.out.println("MyLinkedList size: " + linkedList.size()); // 2

        // Тест MyStack
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        System.out.println("MyStack pop: " + stack.pop()); // 2
        System.out.println("MyStack peek: " + stack.peek()); // 1

        // Тест MyQueue
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("x");
        queue.enqueue("y");
        System.out.println("MyQueue dequeue: " + queue.dequeue()); // x
        System.out.println("MyQueue peek: " + queue.peek()); // y

        // Тест MyMinHeap
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.add(3);
        heap.add(1);
        heap.add(2);
        System.out.println("MyMinHeap removeMin: " + heap.removeMin()); // 1
        System.out.println("MyMinHeap peek: " + heap.peek()); // 2
    }
}