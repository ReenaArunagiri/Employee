package emp;
import java.util.ArrayList;
public class Main 
{
    private static Employee[] employees = {
            new Employee("Emp1", 31, "656-659-95", "London", 3800, "Java developer"),
            new Employee("Emp2", 22, "648-648-95", "Berlin", 4000, "Test Engineer"),
            new Employee("Emp3", 45, "656-159-95", "Tokyo", 1000, "Manager"),
};
    private static Manager[] managers = {
            new Manager("Man1", 31, "656-659-95", "London", 3800, "Java developer"),
            new Manager("Man2", 26, "648-648-95", "Berlin", 4000, "Test Engineer"),
            new Manager("Man3", 40, "656-159-95", "Tokyo", 1000, "Manager"),
};

    private static ArrayList<Employee> searchBySpecialization(final Employee[] empl, final String specialization) 
    {
        ArrayList<Employee> res = new ArrayList<>();
        for (Employee employee : empl) 
        {
            if (employee.getSpecialization().equals(specialization))
                res.add(employee);
        }
        return res;
    }

    private static ArrayList<Member> searchBySalary(final Member[] members, final int minSalary, final int maxSalary) 
    {
        ArrayList<Member> res = new ArrayList<>();
        for (Member member : members) 
        {
            if (member.salary >= minSalary && member.salary <= maxSalary&& member.age < 50)
                res.add(member);
        }
        return res;
    }

    public static void main(String[] args) 
    {
        System.out.println("EMPLOYEES");
        for (Employee employee : employees) 
        {
            System.out.println(employee);
        }
        System.out.println("MANAGERS");
        for (Employee employee : employees) 
        {
            System.out.println(employee);
        }
        System.out.println("All employees with specialization 'Test Engineer'");
        ArrayList<Employee> list = searchBySpecialization(employees, "Test Engineer");
        for (Employee empl : list) 
        {
            System.out.println(empl);
        }
        System.out.println("All employers salary [4000; 5000]");
        ArrayList<Member> listSalary = searchBySalary(employees, 4000, 5000);
        for (Member empl : listSalary) 
        {
            System.out.println(empl);
        }
        System.out.println("All managers salary [1000; 5000]");
        ArrayList<Member> listSalary2 = searchBySalary(managers, 1000, 5000);
        for (Member empl : listSalary2) 
        {
            System.out.println(empl);
        }

    }

}