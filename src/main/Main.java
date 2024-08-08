package main;

import JavaInheritance.*;
import JavaGenerics.*;

public class Main {
    
    public static void main(String[] args) {
        Character[] str_chars = {'t', 'e', 'd', 'c', 'a', 'b'};
        Integer[] int_arr = {1, 2, 3, -14, 5, 6, -77, -8, 9};
        
        SortDifferentData sorted = new SortDifferentData();
        InnerSortDifferentDataDisplay result = new InnerSortDifferentDataDisplay();    
        sorted.sortDifferentData(str_chars);
        result.innerSortDifferentDataDisplay(str_chars);
    }
}


/*
 *         public static void mainf(String[] args) {
        Manager managerOBJ = new Manager("Mohammed", 23, 649563163, "Casablanca", "student");
        managerOBJ.DisplayDataManager();
        Engineer managerOBJ1 = new Engineer("Imad", 23, 649563163, "Casablanca", "student");
        managerOBJ1.DisplayDataEngineer();
    }
 */
