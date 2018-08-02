package lab1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RadixSort {

    public static int perfectSqrNextToN(int n) {
        int i = 0;
        for (int j = 2; i < n / 2; j++) {
            if (j * j > n) {
                i = j;
                break;
            }
        }
        return i;
    }

    public static LinkedList<Integer>[] radixSort(int[] arr) {
        LinkedList<Integer>[] list = new LinkedList[arr.length];// new ArrayList<LinkedList<Integer>>();
        int maxItem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxItem) {
                maxItem = arr[i];
            }
        }
        System.out.println("Max element is: " + maxItem);
        int radix = perfectSqrNextToN(maxItem);
        for (int i = 0; i < arr.length; i++) {
            LinkedList<Integer> linkedLists = list[arr[i] % radix];
            if (linkedLists == null) {
                linkedLists = new LinkedList<Integer>();
                list[arr[i] % radix] = linkedLists;
            }
            linkedLists.addLast(arr[i]);
        }
        LinkedList<Integer>[] quotientArray = new LinkedList[arr.length];
        for (int i = 0; i < arr.length; i++) {
            LinkedList<Integer> linkedLists = quotientArray[arr[i] / radix];
            if (linkedLists == null) {
                linkedLists = new LinkedList<Integer>();
                quotientArray[arr[i] / radix] = linkedLists;
            }
            linkedLists.addLast(arr[i]);
        }

        return quotientArray;
    }

    public static void main(String... args) {
        //  System.out.println(perfectSqrNextToN(7));
        LinkedList<Integer>[] list = radixSort(new int[]{48, 1, 6, 23, 37, 19, 21});
        for (LinkedList<Integer> anotherList : list) {
            if (anotherList != null) {
                for (Integer item : anotherList) {
                    System.out.println(item);
                }
            }
        }
    }
}
