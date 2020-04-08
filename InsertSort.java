package InserSort;

import java.util.Arrays;

public class InsertSort {
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            for (; j >= 0 && array[j] > temp; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 8, 1, 9};
        insertSort(arr);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
