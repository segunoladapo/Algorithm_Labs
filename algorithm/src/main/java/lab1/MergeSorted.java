package lab1;

public class MergeSorted {

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int Narr1 = arr1.length;
        int Narr2 = arr2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        for (; i < Narr1 && j < Narr2; k++) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i++];
            } else {
                result[k] = arr2[j++];
            }
        }
        while (i < Narr1) {
            result[k++] = arr1[i++];
        }
        while (j < Narr2) {
            result[k++] = arr2[j++];
        }
        return result;
    }

    public static void main(String... args) {
        int[] merged = merge(new int[]{1, 2, 3, 4, 5, 20}, new int[]{5, 6, 7, 8, 9, 10, 11, 12});
        for (int element : merged) {
            System.out.println(element);
        }
    }
}
