package by.zimin.task6;

import by.zimin.general.ArrayInt;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Array implements IMath {


    public static void main(String[] args) {
        ArrayInt list = new ArrayInt(new ArrayList<>(), 100);
        Array ar = new Array();
        Random random = new Random();

        for (int i = 0; i < list.getSize() - 1; i++) {
            list.addElement(random.nextInt(1, 99));
        }
        int[] array = new int[list.getSize()];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = list.getElementByIndex(i);
        }

        System.out.println((list.getArray()));
        System.out.println(ar.max(array));
        System.out.println(ar.min(array));
        System.out.println(ar.avg(array));

    }

    @Override
    public int max(int[] arr) {
        int maxElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxElement < arr[i]) {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

    @Override
    public int min(int[] arr) {
        int minElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minElement > arr[i]) {
                minElement = arr[i];
            }
        }
        return minElement;
    }

    @Override
    public float avg(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        float average = (float) count / arr.length;
        return average;
    }
}
