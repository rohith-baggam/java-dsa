package starters.HashSetPrograms;

import java.util.HashSet;

import starters.ArrayPrograms.OneDArrays.Utils;

public class Programs extends Utils {
    public static boolean isDuplicatesExists(int[] array) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (hashSet.contains(array[i])) {
                return false;
            }
            hashSet.add(array[i]);
        }
        return true;
    }

    public static HashSet<Integer> uniqueElements(
            int[] array) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < array.length; i++) {

            hashSet.add(array[i]);
        }
        return hashSet;
    }

    public static void main(String[] args) {
        int[] array = scanArray();
        System.out.println(uniqueElements(array));

    }
}
