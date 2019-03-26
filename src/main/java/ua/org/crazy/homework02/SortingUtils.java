package ua.org.crazy.homework02;

import java.util.Arrays;

public class SortingUtils {

    public static int[] insertionSort(int[] arr){
        int key;
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    static int[] choiceSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minArr = arr[i];
            int minI = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minArr){
                    minArr = arr[j];
                    minI = j;
                }
            }
            if (i != minI){
                swap(arr, i, minI);
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int minI) {
        int temp = arr[i];
        arr[i] = arr[minI];
        arr[minI] = temp;
    }

    static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    static int[] quickSort(int[] arr, int low, int high){
        int index = partition (arr, low, high);
        if (low < index - 1){
            quickSort(arr, low, index - 1);
        }
        if (index < high){
            quickSort(arr, index, high);
        }
        return arr;
    }

    private static int partition(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int temp;
        int middle = arr[(low + high) / 2];
        while (i <= j){
            while (arr[i] < middle){
                i++;
            }
            while (arr[j] > middle){
                j--;
            }
            if (i <= j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }

    static int[] mergeSort(int[] arr){
        if (arr.length < 2){
            return arr;
        }
        int middle = arr.length / 2;
        int[] arr1 = Arrays.copyOfRange(arr, 0 , middle);
        int[] arr2 = Arrays.copyOfRange(arr, middle , arr.length);
        int[] newArr = merge(mergeSort(arr1), mergeSort(arr2));
        return newArr;
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int generalLength = arr1.length + arr2.length;
        int[] arr = new int[generalLength];
        int x1 = 0;
        int x2 = 0;
        for (int i = 0; i < generalLength; i++) {
            if (x1 == arr1.length){
                arr[i] = arr2[x2++];
            } else {
                if (x2 == arr2.length){
                    arr[i] = arr1[x1++];
                } else {
                    if (arr1[x1] < arr2[x2]){
                        arr[i] = arr1[x1++];
                    } else {
                        arr[i] = arr2[x2++];
                    }
                }
            }
            
        }
        return arr;
    }

    static void printArr(int[] arr){
        for (int element:arr) {
            System.out.println(element);
        }
    }

    static long getCurrentTime(){
        return System.currentTimeMillis();
    }
}
