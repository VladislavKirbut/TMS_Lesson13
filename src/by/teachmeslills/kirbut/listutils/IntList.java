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
}
