package JavaInheritance;

public class Manager extends Employee{

    public Manager(String Name, int Age, long Number, String Address, String JobTitle) {
        super(Name, Age, Number, Address, JobTitle);
    }

    public void DisplayDataManager(){
        System.out.println("Display data for a Manager");
        System.out.println(this.Name + " " + this.Age + " " + this.Number + " " + this.Address
                + " " + this.JobTitle);
    }
}