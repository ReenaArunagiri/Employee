package emp;
public class Member {
    public String name;
    public int age;
    public String phoneNumber;
    public String city;
    public int salary;



    public Member(String name, int age, String phoneNumber, String city, int salary) 
    {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.salary = salary;
    }

        @Override
    public String toString() 
    {
        return "Member: \n" +" name = " + name + '\n'  +
                ", age = " + age +", phoneNumber = " + phoneNumber + '\n' +
                ", city = " + city + '\n' +", salary = " + salary +"\n";
    }
}

