package sorting;

import utilities.Utils;

public class Insertion {

    public static <T extends Comparable<T>> void sort(T[] arr) {
        int j = 0;
        
        for (int i = 1; i < arr.length; ++i) {
            T hand = arr[i];
            j = i;
            while (j > 0 && Utils.lessThan(arr[j], arr[j-1])) {
                arr[j - 1] = arr[j];
                --j;
            }
            arr[i] = hand;
        }
    }
    
}