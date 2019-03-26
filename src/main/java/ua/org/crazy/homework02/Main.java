package ua.org.crazy.homework02;

import static ua.org.crazy.homework02.ArrayUtils.getArray;
import static ua.org.crazy.homework02.SortingUtils.bubbleSort;
import static ua.org.crazy.homework02.SortingUtils.choiceSort;
import static ua.org.crazy.homework02.SortingUtils.getCurrentTime;
import static ua.org.crazy.homework02.SortingUtils.insertionSort;
import static ua.org.crazy.homework02.SortingUtils.mergeSort;
import static ua.org.crazy.homework02.SortingUtils.quickSort;

public class Main {
    private static final int[] arr = getArray();

    public static void main(String[] args) {

        long start1 = getCurrentTime();
        System.out.println("insertionSorted: ");
        insertionSort(arr);
        long finish1 = getCurrentTime();
        System.out.println("the work is over for " + (finish1 - start1) + "ms");

        long start2 = getCurrentTime();
        System.out.println("choiceSorted: ");
        choiceSort(arr);
        long finish2 = getCurrentTime();
        System.out.println("the work is over for " + (finish2 - start2) + "ms");

        long start3 = getCurrentTime();
        System.out.println("bubbleSorted: ");
        bubbleSort(arr);
        long finish3 = getCurrentTime();
        System.out.println("the work is over for " + (finish3 - start3) + "ms");

        long start4 = getCurrentTime();
        System.out.println("quickSorted: ");
        quickSort(arr, 0, arr.length - 1);
        long finish4 = getCurrentTime();
        System.out.println("the work is over for " + (finish4 - start4) + "ms");

        long start5 = getCurrentTime();
        System.out.println("mergeSorted: ");
        mergeSort(arr);
        long finish5 = getCurrentTime();
        System.out.println("the work is over for " + (finish5 - start5) + "ms");

        System.out.println("Factorial from 18: " + BigFactorial.calculateBigFactorial(18));
    }


}
