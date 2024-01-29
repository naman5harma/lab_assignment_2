import java.util.*;

class Employee {
    String id;
    String name;
    int age;
    int salary;

    Employee(String id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

class EmployeeTable {
    List<Employee> employees = new ArrayList<>();

    void addEmployee(Employee employee) {
        employees.add(employee);
    }

    void sortEmployees(int parameter) {
        switch (parameter) {
            case 1: // Sort by age
                Collections.sort(employees, Comparator.comparingInt(emp -> emp.age));
                break;
            case 2: // Sort by name
                Collections.sort(employees, Comparator.comparing(emp -> emp.name));
                break;
            case 3: // Sort by salary
                Collections.sort(employees, Comparator.comparingInt(emp -> emp.salary));
                break;
            default:
                System.out.println("Invalid parameter. Please choose 1 for 'age', 2 for 'name', or 3 for 'salary'.");
        }
    }

    void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.id + " " + employee.name + " " + employee.age + " " + employee.salary);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        EmployeeTable employeeTable = new EmployeeTable();
        employeeTable.addEmployee(new Employee("161E90", "Ramu", 35, 59000));
        employeeTable.addEmployee(new Employee("171E22", "Tejas", 30, 82100));
        employeeTable.addEmployee(new Employee("171G55", "Abhi", 25, 100000));
        employeeTable.addEmployee(new Employee("152K46", "Jaya", 32, 85000));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a sorting parameter: 1 for 'age', 2 for 'name', or 3 for 'salary': ");
        int parameter = scanner.nextInt();

        employeeTable.sortEmployees(parameter);
        employeeTable.printEmployees();
    }
}