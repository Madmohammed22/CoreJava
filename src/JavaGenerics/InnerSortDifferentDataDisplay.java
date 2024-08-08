package JavaGenerics;
import java.util.*;

public class InnerSortDifferentDataDisplay extends SortDifferentData {

    public <T extends Comparable<T>> void innerSortDifferentDataDisplay(T[] arr) {
        List<T> result = new ArrayList<>();
        for (T element : arr) {
            result.add(element);
        }
        if (result.isEmpty() == false){
            result.forEach(n -> System.out.println(n));
        }
        else
            System.out.println("Data is empty");
    }
}
