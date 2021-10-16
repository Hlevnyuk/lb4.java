import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        EmployeeService employeeService = new EmployeeService(employeeFactory.generateEmployees(6));
        System.out.println("=====employeePrint=====");
        employeeService.printEmployees();
        System.out.println();
        System.out.println("=====calculateSalaryAndBonus=====");
        System.out.println(employeeService.calculateSalaryAndBonus());
        System.out.println();
        System.out.println("=====getById=====");
        System.out.println(employeeService.getById(3).toString());
        System.out.println();
        System.out.println("=====getByName=====");
        System.out.println(Arrays.toString(employeeService.getByName(employeeService.employees[3].getName())));
        System.out.println();
        System.out.println("=====sortByName=====");
        Employee[] sortByName = employeeService.sortByName();
        System.out.println(Arrays.toString(sortByName));
        System.out.println();
        System.out.println("=====sortByNameAndSalary=====");
        Employee[] sortByNameAndSalary = employeeService.sortByNameAndSalary();
        System.out.println(Arrays.toString(sortByNameAndSalary));
        System.out.println();
        System.out.println("=====edit=====");
        Employee employeeEdit = new Employee(1, "Artem", 19, 1400, 'm');
        System.out.println(employeeService.edit(employeeEdit));
        System.out.println();
        System.out.println("=====remove=====");
        System.out.println(employeeService.remove(1));
        System.out.println("=================Add new Employee=================");
        System.out.println();
        Developer developer = new Developer(7, "Tolik", 25, 5000, 'm', 150);
        employeeService.add(developer);
        employeeService.printEmployees();
        System.out.println();
    }
}
