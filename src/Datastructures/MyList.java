package Datastructures;

import java.util.Iterator;

/**
 * Интерфейс для структуры данных типа список.
 * @param <T> тип элементов в списке
 */
public interface MyList<T> {
    void add(T element); // Добавить элемент в конец
    void add(int index, T element); // Добавить элемент по индексу
    T get(int index); // Получить элемент по индексу
    T remove(int index); // Удалить элемент по индексу
    void set(int index, T element); // Заменить элемент по индексу
    int size(); // Вернуть количество элементов
    boolean isEmpty(); // Проверить, пуст ли список
    Iterator<T> iterator(); // Вернуть итератор
}