package ua.org.crazy.homework02;

public class ArrayUtils {
    static int[] getArray(){
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 100));
        }
        return arr;
    }
}
