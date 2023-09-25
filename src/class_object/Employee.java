package class_object;

class Details
{
    int id;
    String Name;
    String Designation;
    Float Salary;

    void PrintDetails()
    {
        System.out.println(id+" "+Name+" "+Designation+" "+Salary);
    }
    void record(int i, String name, String des, Float sal)
    {
        id=i;
        Name=name;
        Designation = des;
        Salary = sal;
        System.out.println(id+" "+Name+" "+Designation+" "+Salary);
    }
    void record2(int id, String Name, String Designation, Float Salary)
    {
        this.id=id;
        this.Name=Name;
        this.Designation=Designation;
        this.Salary = Salary;
        System.out.println(id+" "+Name+" "+Designation+" "+Salary);
    }
    
}

public class Employee {
    public static void main(String[] args) {
        Details d = new Details();
        d.id=123;
        d.Name="Naveen";
        d.Designation="PHd";
        d.Salary=(float) 12500.00;
        d.PrintDetails();
        d.record(32,"Hari","Btech",23000f);
        d.record2(32,"Teja","Degree",25000f);
    }
}
