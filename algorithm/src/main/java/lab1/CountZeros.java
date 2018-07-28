package lab1;

public class CountZeros {

    public static void countZerosAndOnes(int[] sorted) {
        int numberOfZeros = countOfZeros(sorted);
        int numberOfOnes = sorted.length - numberOfZeros;
        System.out.println("Number of Zeros: " + numberOfZeros + " Number of Ones: " + numberOfOnes);
    }

    public static int countOfZeros(int[] sorted) {
        int low = 0;
        int high = sorted.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (sorted[mid] == 0) {
                result = mid;
                low = mid + 1;
            } else if (0 < sorted[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result + 1;
    }

    public static void main(String... args){
        countZerosAndOnes(new int[]{0,0,0,0,1,1,1,1,1});
    }
}
