package by.teachmeslills.kirbut.listutils;

import java.util.Arrays;

public class IntList

    private int[] arrayOfNumbers;

    public IntList() {
        arrayOfNumbers = new int[]{};
    }

    public IntList(int[] arrayOfNumbers) {
        this.arrayOfNumbers = Arrays.copyOf(arrayOfNumbers, arrayOfNumbers.length);
    }
    @Override
    public String toString() {
        return Arrays.toString(arrayOfNumbers);
    }

    public int get(int index) {
        if (index < 0 || index >= arrayOfNumbers.length)
            throw new IllegalArgumentException("This index doesn't exist.");

        return arrayOfNumbers[index];
    }

    public int set(int index, int element) {
        if (index < 0 || index >= arrayOfNumbers.length)
            throw new IllegalArgumentException("This index doesn't exist.");

        int previousElement = arrayOfNumbers[index];
        arrayOfNumbers[index] = element;

        return previousElement;
    }

    public int size() {
        return arrayOfNumbers.length;
    }

    public void add(int element) {
        arrayOfNumbers = Arrays.copyOf(arrayOfNumbers, arrayOfNumbers.length + 1);

        arrayOfNumbers[arrayOfNumbers.length - 1] = element;
    }

    public int remove(int index) {
        if (index < 0 || index >= arrayOfNumbers.length)
            throw new IllegalArgumentException("This index doesn't exist.");

        int deletedElement = arrayOfNumbers[index];
        int[] newArrayList = new int[arrayOfNumbers.length - 1];

        System.arraycopy(arrayOfNumbers, 0, newArrayList, 0, index);
        System.arraycopy(arrayOfNumbers, index + 1, newArrayList, index, newArrayList.length - index);
        arrayOfNumbers = newArrayList;

        return deletedElement;
    }

    public IntList subList(int startIndexInclusive, int endIndexExclusive) {
        int difference = endIndexExclusive - startIndexInclusive;

        if (difference < 0 || difference > arrayOfNumbers.length)
            throw new IllegalArgumentException("Enter correct start or end index.");

        int[] newArr = Arrays.copyOfRange(arrayOfNumbers, startIndexInclusive, endIndexExclusive);

        return new IntList(newArr);
    }

    public IntList subList(int startIndexInclusive) {
        return subList(startIndexInclusive, arrayOfNumbers.length);
    }

    public int lastIndexOf(int element) {
        for (int i = arrayOfNumbers.length - 1; i >= 0; i--)
            if (arrayOfNumbers[i] == element)
                return i;

        return -1;
    }

    public void sort() {
        for (int i = 0; i < arrayOfNumbers.length - 1; i++) {
            for (int j = 0; j < arrayOfNumbers.length - i - 1; j++) {
                if (arrayOfNumbers[j] > arrayOfNumbers[j + 1]) {
                    int t = arrayOfNumbers[j];
                    arrayOfNumbers[j] = arrayOfNumbers[j + 1];
                    arrayOfNumbers[j + 1] = t;
                }
            }
        }
    }
}
