package by.zimin.task7;

import by.zimin.general.ArrayInt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Array implements ISort {
    private ArrayList<Integer> array;


    public static void main(String[] args) {
        ArrayInt ai = new ArrayInt(new ArrayList<>(), 100);
        Array ar = new Array();
        Random random = new Random();
        for (int i = 0; i < ai.getSize() - 1; i++) {
            ai.addElement(random.nextInt(99));
        }
        int[] arr = new int[ai.getSize()];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = ai.getElementByIndex(i);
        }
        ar.sortAsc(arr);
        ar.sortDsc(arr);
        System.out.println(Arrays.toString(arr));
    }


    @Override
    public void sortAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
        }


    }

    @Override
    public void sortDsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++)
                if (array[j] > array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
        }

    }

    /**
     * Задание 7
     * Создайте интерфейс ISort. В нём должно быть два
     * метода:
     * ■ void SortAsc() — сортировка по возрастанию;
     * ■ void SortDesc() — сортировка по убыванию.
     * Класс Array, созданный ранее, должен имплементировать интерфейс ISort.
     * Метод SortAsc — сортирует массив по возрастанию.
     * Метод SortDesc — сортирует массив по убыванию.
     * Напишите код для тестирования полученной функциональности
     *
     * Создайте класс ArrayInt.
     * У класса Array должно быть 1 поле: private ArrayList<Integer> array;
     * Добавьте конструктор (с параметром opacity для коллекции), сеттер, геттер.
     * Добавьте функцию в класс ArrayInt для добавления и измения элементов в коллекции.
     *
     * Этот класс ArrayInt используйте в задании 6 и 7 вместо класса Array.
     */
}
