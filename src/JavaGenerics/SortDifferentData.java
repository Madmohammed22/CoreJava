package JavaGenerics;
import java.util.*;

public class SortDifferentData {
    public <T extends Comparable <T>> List<T> sortDifferentData(T[] arr) {
        List<T> result = new ArrayList<>();
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        }
//        for (T element : arr) {
//            result.add(element);
//        }
        Collections.addAll(result, arr);
        return result;
    }
}