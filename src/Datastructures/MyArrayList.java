package Datastructures;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Реализация списка на основе динамического массива.
 * @param <T> тип элементов в списке
 */
public class MyArrayList<T> implements MyList<T>, Iterable<T> {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Создает пустой список с начальной емкостью по умолчанию.
     */
    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void add(T element) {
        if (size == array.length) {
            resize();
        }
        array[size++] = element;
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + size);
        }
        if (size == array.length) {
            resize();
        }
        // Сдвиг элементов вправо
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndex(index);
        return (T) array[index];
    }

    @Override
    @SuppressWarnings("unchecked")
    public T remove(int index) {
        checkIndex(index);
        T removed = (T) array[index];
        // Сдвиг элементов влево
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null; // Очистка ссылки
        return removed;
    }

    @Override
    public void set(int index, T element) {
        checkIndex(index);
        array[index] = element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int current = 0;

            @Override
            public boolean hasNext() {
                return current < size;
            }

            @Override
            @SuppressWarnings("unchecked")
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (T) array[current++];
            }
        };
    }

    private void resize() {
        Object[] newArray = new Object[array.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + size);
        }
    }
}