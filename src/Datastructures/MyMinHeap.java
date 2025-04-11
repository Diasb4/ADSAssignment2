package Datastructures;

import java.util.NoSuchElementException;

/**
 * Реализация минимальной кучи на основе MyArrayList.
 * @param <T> тип элементов, должен быть сравнимым
 */
public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> heap;

    /**
     * Создает пустую минимальную кучу.
     */
    public MyMinHeap() {
        heap = new MyArrayList<>();
    }

    /**
     * Добавляет элемент в кучу.
     * @param element элемент для добавления
     */
    public void add(T element) {
        heap.add(element);
        siftUp(heap.size() - 1);
    }

    /**
     * Удаляет и возвращает минимальный элемент.
     * @return минимальный элемент
     * @throws NoSuchElementException если куча пуста
     */
    public T removeMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("Куча пуста");
        }
        T min = heap.get(0);
        T last = heap.remove(heap.size() - 1);
        if (!isEmpty()) {
            heap.set(0, last);
            siftDown(0);
        }
        return min;
    }

    /**
     * Возвращает минимальный элемент без удаления.
     * @return минимальный элемент
     * @throws NoSuchElementException если куча пуста
     */
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Куча пуста");
        }
        return heap.get(0);
    }

    /**
     * Возвращает количество элементов в куче.
     * @return размер кучи
     */
    public int size() {
        return heap.size();
    }

    /**
     * Проверяет, пуста ли куча.
     * @return true, если куча пуста
     */
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private void siftUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index).compareTo(heap.get(parent)) >= 0) {
                break;
            }
            swap(index, parent);
            index = parent;
        }
    }

    private void siftDown(int index) {
        int minIndex = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < heap.size() && heap.get(left).compareTo(heap.get(minIndex)) < 0) {
            minIndex = left;
        }
        if (right < heap.size() && heap.get(right).compareTo(heap.get(minIndex)) < 0) {
            minIndex = right;
        }
        if (minIndex != index) {
            swap(index, minIndex);
            siftDown(minIndex);
        }
    }

    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}