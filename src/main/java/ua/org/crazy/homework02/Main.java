package ua.org.crazy.homework02;

import static ua.org.crazy.homework02.SortingUtils.*;

public class Main {

    private static final int[] arr = getArray();

    public static void main(String[] args) {
        System.out.println("insertionSorted: ");
        insertionSort(arr);

        System.out.println("choiceSorted: ");
        choiceSort(arr);

        System.out.println("bubbleSorted: ");
        bubbleSort(arr);

        System.out.println("quickSorted: ");
        quickSort(arr, 0, arr.length - 1);

        System.out.println("mergeSorted: ");
        mergeSort(arr);
    }
}
