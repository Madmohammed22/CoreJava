package main;

import JavaInheritance.*;

public class Main{
    public static void main(String[] args) {
        Manager managerOBJ = new Manager("Mohammed", 23, 649563163, "Casablanca", "student");
        managerOBJ.DisplayDataManager();
        Engineer managerOBJ1 = new Engineer("Imad", 23, 649563163, "Casablanca", "student");
        managerOBJ1.DisplayDataEngineer();
    }
}
