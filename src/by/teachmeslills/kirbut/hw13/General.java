package by.teachmeslills.kirbut.hw13;

import by.teachmeslills.kirbut.listutils.IntList;
import java.util.Scanner;

public class General {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        IntList list = new IntList(new int[] {5,3,7,6,5,9,0,10,43,6,5,3,4});
        while (true) {
        System.out.println();
        System.out.println("""
                1. Method toString()
                2. Method get()
                3. Method set()
                4. Method size()
                5. Method add()
                6. Method remove()
                7. Method subList(start, end)
                8. Method subList(start)
                9. Method lastIndexOf()
                10. Method sort()
                0. Exit the program
                """);
        System.out.print("Enter task number: ");

        int number = scanner.nextInt();

            switch (number) {
                case 1 -> System.out.println("Array of numbers: " + list);
                case 2 -> {
                    System.out.println("Enter index of number: ");
                    int index = scanner.nextInt();
                    System.out.println("Number: " + list.get(index) + " has index " + index);
                }
                case 3 -> {
                    System.out.println("Enter index, which we want to set: ");
                    int index = scanner.nextInt();
                    System.out.println("Enter an element, which we want to set: ");
                    int element = scanner.nextInt();

                    int deletedElement = list.set(index, element);
                    System.out.println("Current list: " + list + "\nDeleted element: " + deletedElement);
                }
                case 4 -> System.out.println("List size: " + list.size());
                case 5 -> {
                    System.out.print("Enter the element you want to add to the list: ");
                    int element = scanner.nextInt();
                    list.add(element);
                    System.out.println("Current list: " + list);
                }
                case 6 -> {
                    System.out.print("Enter index of element you want to remove: ");
                    int index = scanner.nextInt();
                    int deletedElement = list.remove(index);
                    System.out.println("Current list: " + list + "\nDeleted element: " + deletedElement);
                }
                case 7 -> {
                    System.out.print("Enter begin index (inclusive): ");
                    int beginIndex = scanner.nextInt();
                    System.out.println("Enter end index (exclusive): ");
                    int endIndex = scanner.nextInt();
                    IntList newList = list.subList(beginIndex, endIndex);

                    System.out.println("New list: " + newList);
                }
                case 8 -> {
                    System.out.println("Enter start index: ");
                    int startIndex = scanner.nextInt();
                    IntList list1 = list.subList(startIndex);
                    System.out.println("New list: " + list1);
                }
                case 9 -> {
                    System.out.println("Enter an element, which index you looking for: ");
                    int element = scanner.nextInt();

                    int index = list.lastIndexOf(element);
                    System.out.println(index);
                }
                case 10 -> {
                    list.sort();
                    System.out.println(list);
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Enter a correct task number!!!");
            }
        }
    }
}
