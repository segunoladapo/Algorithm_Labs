package lab1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Duplicate {

    public static List<Integer> removeDups(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for (int item : a) {
            if (!map.containsKey(item)) {
                result.add(item);
                map.put(item, 0);
            }
        }
        return result;
    }

    public static void main(String... args) {
        System.out.println(removeDups(new int[]{1, 1, 3, 4, 1, 5}));
    }
}
