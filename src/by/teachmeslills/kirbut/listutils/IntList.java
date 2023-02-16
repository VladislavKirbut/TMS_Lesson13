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
}
