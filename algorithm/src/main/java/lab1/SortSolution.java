package lab1;

import java.util.Arrays;

public class SortSolution {

    public static int[] sort(int[] a) {
        int zerosIndex = 0;
        int twosIndex = a.length - 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == 0) {
                /*
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                */
                int temp = a[zerosIndex];
                a[zerosIndex] = a[i];
                a[i] = temp;
                zerosIndex++;
            }

            if (a[i] == 2) {
                int temp = a[twosIndex];
                a[twosIndex] = a[i];
                a[i] = temp;
                twosIndex--;
            }
/*
            if (a[i + 1] == 0 && a[i] == 1) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
*/
        }
        return a;
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;

    }

    public static void main(String... args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{1, 0, 1, 2, 2, 0, 1, 1})));
    }
}
