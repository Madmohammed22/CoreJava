package JavaInheritance;

public class Engineer extends Employee{

    public Engineer(String Name, int Age, int Number, String Address, String JobTitle) {
        super(Name, Age, Number, Address, JobTitle);
    }

    public void DisplayDataEngineer(){
        System.out.println("Display data for an Engineer");
        System.out.println(this.Name + " " + this.Age + " " + this.Number + " " + this.Address
                + " " + this.JobTitle);
    }
}