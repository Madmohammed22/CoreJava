package main;

import JavaInheritance.*;
import JavaGenerics.*;
/* 
 * import are not present in the compile code,
 *  an import statement has no effect at runtime efficiency of the class
 * It is a simple convenience to avoid prefixing
 * class name with package name throughout your source code.
 */

public class Main {
    
    public static void main(String[] args) {
        Character[] str_chars = {'t', 'e', 'd', 'c', 'a', 'b'};
        Integer[] int_arr = {1, 2, 3, -14, 5, 6, -77, -8, 9};
        
        SortDifferentData sorted = new SortDifferentData();
        InnerSortDifferentDataDisplay result = new InnerSortDifferentDataDisplay();    
        sorted.sortDifferentData(str_chars);
        result.innerSortDifferentDataDisplay(str_chars );
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
