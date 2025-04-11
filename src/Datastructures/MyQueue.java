package Datastructures;

import java.util.NoSuchElementException;

/**
 * Реализация очереди на основе MyLinkedList.
 * @param <T> тип элементов в очереди
 */
public class MyQueue<T> {
    private MyLinkedList<T> list;

    /**
     * Создает пустую очередь.
     */
    public MyQueue() {
        list = new MyLinkedList<>();
    }

    /**
     * Добавляет элемент в конец очереди.
     * @param element элемент для добавления
     */
    public void enqueue(T element) {
        list.add(element);
    }

    /**
     * Удаляет и возвращает элемент из начала очереди.
     * @return элемент из начала
     * @throws NoSuchElementException если очередь пуста
     */
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Очередь пуста");
        }
        return list.remove(0);
    }

    /**
     * Возвращает элемент из начала без удаления.
     * @return элемент из начала
     * @throws NoSuchElementException если очередь пуста
     */
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Очередь пуста");
        }
        return list.get(0);
    }

    /**
     * Возвращает количество элементов в очереди.
     * @return размер очереди
     */
    public int size() {
        return list.size();
    }

    /**
     * Проверяет, пуста ли очередь.
     * @return true, если очередь пуста
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }
}