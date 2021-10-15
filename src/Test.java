import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee[] employees = employeeFactory.generateEmployees(2);
        EmployeeService service = new EmployeeService(employees);
        System.out.println("=====employeePrint=====");
        service.printEmployees();
        System.out.println();
        System.out.println("=====calculateSalaryAndBonus=====");
        int calculateSalaryAndBonus = service.calculateSalaryAndBonus();
        System.out.println(calculateSalaryAndBonus);
        System.out.println();
        System.out.println("=====getById=====");
        Employee employeeById = service.getById(1);
        System.out.println(employeeById);
        System.out.println();
        System.out.println("=====getByName=====");
        Employee[] employeeByName = service.getByName("Artem");
        System.out.println(Arrays.toString(employeeByName));
        System.out.println();
        System.out.println("=====sortByName=====");
        Employee[] sortByName = service.sortByName();
        System.out.println(Arrays.toString(sortByName));
        System.out.println();
        System.out.println("=====sortByNameAndSalary=====");
        Employee[] sortByNameAndSalary = service.sortByNameAndSalary();
        System.out.println(Arrays.toString(sortByNameAndSalary));
        System.out.println();
        System.out.println("=====edit=====");
        Employee employeeNew = new Employee(1, "Artem", 19, 1400, 'm', 8, 75);
        Employee employeeEdit = service.edit(employeeNew);
        service.printEmployees();
        System.out.println();
        System.out.println("=====remove=====");
        Employee remove = service.remove(1);
        service.printEmployees();
        System.out.println();
    }
}
