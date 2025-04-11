package Datastructures;

import java.util.NoSuchElementException;

/**
 * Реализация стека на основе MyArrayList.
 * @param <T> тип элементов в стеке
 */
public class MyStack<T> {
    private MyArrayList<T> list;

    /**
     * Создает пустой стек.
     */
    public MyStack() {
        list = new MyArrayList<>();
    }

    /**
     * Добавляет элемент на вершину стека.
     * @param element элемент для добавления
     */
    public void push(T element) {
        list.add(element);
    }

    /**
     * Удаляет и возвращает элемент с вершины.
     * @return элемент с вершины
     * @throws NoSuchElementException если стек пуст
     */
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Стек пуст");
        }
        return list.remove(list.size() - 1);
    }

    /**
     * Возвращает элемент с вершины без удаления.
     * @return элемент с вершины
     * @throws NoSuchElementException если стек пуст
     */
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Стек пуст");
        }
        return list.get(list.size() - 1);
    }

    /**
     * Возвращает количество элементов в стеке.
     * @return размер стека
     */
    public int size() {
        return list.size();
    }

    /**
     * Проверяет, пуст ли стек.
     * @return true, если стек пуст
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }
}