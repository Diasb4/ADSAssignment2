# MyDataStructures

Проект реализует пользовательские структуры данных на Java без использования `java.util.*` (кроме `Iterator`).

## Структура

- **MyList.java**: Интерфейс для операций со списком.
- **MyArrayList.java**: Список на основе динамического массива.
- **MyLinkedList.java**: Двусвязный список.
- **MyStack.java**: Стек (LIFO) на основе MyArrayList.
- **MyQueue.java**: Очередь (FIFO) на основе MyLinkedList.
- **MyMinHeap.java**: Минимальная куча на основе MyArrayList для сравнимых элементов.

## Выбор дизайна

- **MyStack**: Использует MyArrayList для операций O(1) с концом.
- **MyQueue**: Использует MyLinkedList для операций O(1) с обоих концов.
- **MyMinHeap**: Использует MyArrayList для эффективной реализации бинарной кучи в массиве.

## Использование

```java
MyStack<Integer> stack = new MyStack<>();
stack.push(1);
System.out.println(stack.pop()); // 1

MyQueue<String> queue = new MyQueue<>();
queue.enqueue("привет");
System.out.println(queue.dequeue()); // привет

MyMinHeap<Integer> heap = new MyMinHeap<>();
heap.add(3);
heap.add(1);
System.out.println(heap.removeMin()); // 1