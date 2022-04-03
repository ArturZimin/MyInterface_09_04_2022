package by.zimin.general;

import by.zimin.task7.Array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayInt {
    private ArrayList<Integer> array;
    private int capasity;

    public ArrayInt(ArrayList<Integer> array, int capasity) {
        this.array = array;
        this.capasity = capasity;
        this.array = new ArrayList<>(capasity);

    }

    public int getSize() {
        return this.capasity;
    }


    public ArrayList<Integer> getArray() {
        return array;
    }

    public int getElementByIndex(int index) {
        return this.array.get(index);

    }

    public void addElement(int element) {
        this.array.add(element);

    }

    public void deleteElement(int element) {
        Iterator<Integer> iterator = this.array.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(element)) {
                iterator.remove();
            }
        }

    }

    public void changeElementByIndex(int index, int element) {
        this.array.set(index, element);

    }
}
