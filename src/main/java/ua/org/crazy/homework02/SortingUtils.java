package ua.org.crazy.homework02;

import java.util.Arrays;

class SortingUtils {
    //алгоритм сортировки вставками
    static int[] insertionSort(int[] arr){
        long start = getCurrentTime();
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
        long finish = getCurrentTime();
        System.out.println("the work is over for " + (finish - start) + "ms");
        return arr;
    }

    //алгоритм сортировки выбором
    static int[] choiceSort(int[] arr){
        long start = getCurrentTime();
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
                int temp = arr[i];
                arr[i] = arr[minI];
                arr[minI] = temp;
            }
        }
        long finish = getCurrentTime();
        System.out.println("the work is over for " + (finish - start) + "ms");
        return arr;
    }

    //алгоритм сортировки пузырьком
    static int[] bubbleSort(int[] arr){
        long start = getCurrentTime();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        long finish = getCurrentTime();
        System.out.println("the work is over for " + (finish - start) + "ms");
        return arr;
    }

    //алгоритм быстрой сортировки
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

    //алгоритм сортировки слиянием
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

    static int[] getArray(){
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 100));
        }
        return arr;
    }

    static long getCurrentTime(){
        return System.currentTimeMillis();
    }
}
