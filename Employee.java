package emp;
public class Employee extends Member 
{
    private String specialization;

    public Employee(String name, int age, String phoneNumber, String city, int salary, String specialization) 
    {
        super(name, age, phoneNumber, city, salary);
        this.specialization = specialization;
    }

    
    public String toString() 
    {
        return "Employee \n name : " + this.name + '\n'  +" age : " + this.age +'\n' +" phoneNumber : " + this.phoneNumber + '\n' +" city : " + this.city + '\n' +" salary : " + this.salary+ "\n"+" specialization : " + specialization +"\n";
    }

    public String getSpecialization() 
    {
        return specialization;
    }

    public void setSpecialization(String specialization) 
    {
        this.specialization = specialization;
    }
}


