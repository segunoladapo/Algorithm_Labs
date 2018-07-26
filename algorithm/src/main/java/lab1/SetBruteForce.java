package lab1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetBruteForce {

    public static List<Set<Integer>> powerSet(List<Integer> list) {
        List<Set<Integer>> p = new ArrayList<Set<Integer>>();
        Set<Integer> empty = new HashSet<Integer>();
        p.add(empty);

        while (!list.isEmpty()) {
            Integer element = list.remove(0);
            List<Set<Integer>> temp = new ArrayList<Set<Integer>>();
            for (Set<Integer> set : p) temp.add(set);
            for (Set<Integer> set : temp) {
                Set<Integer> newSet = new HashSet<Integer>();
                for (Integer s : set) {
                    newSet.add(s);
                    newSet.add(element);
                }
                newSet.add(element);
                p.add(newSet);
            }
        }
        return p;
    }


    public static Object subsetSum(List<Integer> list, int k){
        List<Set<Integer>> powerSet = powerSet(list);
        for(Set<Integer> set : powerSet){
            int sumOfSet = 0;
            for(Integer element : set){
                sumOfSet += element;
            }
            if(sumOfSet == k){
                return set;
            }
        }
        return null;
    }


    public static void main(String... args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(powerSet(list));
    }
}
