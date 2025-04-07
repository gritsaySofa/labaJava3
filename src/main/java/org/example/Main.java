package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Класс для сравнения производительности операций ArrayList и LinkedList.
 */
public class Main {
    /**
     * Основной метод для тестирования производительности.
     * @param args Аргументы командной строки
     * */
    public static void main(String[] args) {
        int n = 10000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Тестирование операции добавления
        long start = System.nanoTime();
        for (int i = 0; i < n; ++i) {
            arrayList.add(i);
        }
        long finish = System.nanoTime();
        long arrayListAddTime = finish - start;

        start = System.nanoTime();
        for (int i = 0; i < n; ++i) {
            linkedList.add(i);
        }
        finish = System.nanoTime();
        long linkedListAddTime = finish - start;

        // Тестирование операции получения
        start = System.nanoTime();
        for (int i = 0; i < n; ++i) {
            arrayList.get(i);
        }
        finish = System.nanoTime();
        long arrayListGetTime = finish - start;

        start = System.nanoTime();
        for (int i = 0; i < n; ++i) {
            linkedList.get(i);
        }
        finish = System.nanoTime();
        long linkedListGetTime = finish - start;

        // Тестирование операции удаления
        start = System.nanoTime();
        for (int i = n - 1; i >= 0; --i) {
            arrayList.remove(i);
        }
        finish = System.nanoTime();
        long arrayListRemoveTime = finish - start;

        start = System.nanoTime();
        for (int i = n - 1; i >= 0; --i) {
            linkedList.remove(i);
        }
        finish = System.nanoTime();
        long linkedListRemoveTime = finish - start;

        // Вывод
        System.out.println("Метод(" + n + " раз)\tArrayList\tLinkedList");
        System.out.println("add\t\t\t\t\t" + arrayListAddTime + "\t\t" + linkedListAddTime);
        System.out.println("get\t\t\t\t\t" + arrayListGetTime + "\t\t" + linkedListGetTime);
        System.out.println("remove\t\t\t\t" + arrayListRemoveTime + "\t\t" + linkedListRemoveTime);
    }
}