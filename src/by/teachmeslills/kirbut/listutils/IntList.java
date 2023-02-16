package by.teachmeslills.kirbut.listutils;

import java.util.Arrays;

public class IntList {

    private int[] arrayOfNumbers;

    public IntList() {
        arrayOfNumbers = new int[]{};
    }

    public IntList(int[] arrayOfNumbers) {
        this.arrayOfNumbers = arrayOfNumbers;
    }

    public String toString() {
        return Arrays.toString(this.arrayOfNumbers);
    }

    public int get(int index) {
        if (index < 0 || index >= arrayOfNumbers.length)
            throw new IllegalArgumentException("This index doesn't exist.");

        return arrayOfNumbers[index];
    }

    /*
    * return previous element
    */
    public int set(int index, int element) {
        if (index < 0 || index >= arrayOfNumbers.length)
            throw new IllegalArgumentException("This index doesn't exist.");

        int previousElement = arrayOfNumbers[index];
        arrayOfNumbers[index] = element;

        return previousElement;
    }

    /*
    * return length of list (array)
    */
    public int size() {
        return this.arrayOfNumbers.length;
    }

    public void add(int element) {
        int[] array = arrayOfNumbers.clone();
        arrayOfNumbers = new int[array.length + 1];

        for (int i = 0; i < array.length; i++)
            arrayOfNumbers[i] = array[i];

        arrayOfNumbers[arrayOfNumbers.length - 1] = element;
    }

    /*
    * return element, which will be to remove
    */
    public int remove(int index) {
        if (index < 0 || index >= arrayOfNumbers.length)
            throw new IllegalArgumentException("This index doesn't exist.");

        int[] array = arrayOfNumbers.clone();
        arrayOfNumbers = new int[array.length - 1];
        int count = 0;
        int necessaryElement = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index) necessaryElement = array[i];
            else arrayOfNumbers[count++] = array[i];
        }

        return necessaryElement;
    }

    public IntList subList(int startIndexInclusive, int endIndexExclusive) {
        int difference = endIndexExclusive - startIndexInclusive;

        if (difference < 0 || difference > arrayOfNumbers.length)
            return new IntList();

        int[] newArr = new int[difference];
        int count = 0;

        for (int i = startIndexInclusive; i < endIndexExclusive; i++)
            newArr[count++] = arrayOfNumbers[i];

        return new IntList(newArr);
    }

    public static void main(String[] args) {
        IntList list = new IntList(new int[] {5,4,3,4,56,7,8,6});
        System.out.println(list.toString());

        IntList list1 = list.subList(3,100);
        System.out.println(list1.toString());

        System.out.println(list.toString());
    }
}
