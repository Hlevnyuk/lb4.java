import java.util.Arrays;
import java.util.Comparator;
public class EmployeeService {
    Employee[] employees;
    public EmployeeService(Employee[] employee) {
        this.employees = employee;
    }
    void printEmployees(){
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
    int calculateSalaryAndBonus(){
        int moneyForSalaryAndBonus = 0;
        for (Employee employee: employees) {
            moneyForSalaryAndBonus += employee.salary;
        }
        return moneyForSalaryAndBonus;
    }
    Employee getById(long id){
        for (Employee employee : this.employees){
            if(employee.getId() == id){
                return employee;
            }
        }
        return null;
    }
    Employee[] getByName(String name){
        Employee[] employeesArrayByName  = new Employee[employees.length];
        int countEmployeesByName = 0;
        for (Employee employee: employees) {
            if (employee.name.equals(name)) {
                employeesArrayByName[countEmployeesByName++] = employee;
            }
        }
        Employee[] employeesArrayByNameResult  = new Employee[countEmployeesByName];
        for (int i = 0; i < countEmployeesByName; i++) {
            employeesArrayByNameResult[i] = employeesArrayByName[i];
        }
        return employeesArrayByNameResult;
    }
    Employee[] sortByName(){
        Arrays.sort(this.employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp, Employee emp1) {
                return emp.getName().compareTo(emp1.getName());
            }
        });
        return this.employees;
    }

    Employee[] sortByNameAndSalary() {
        Employee[] employee = employees.clone();
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees.length; j++) {
                Employee template = employees[i];
                if (template.name.equals(employees[j].name)){
                    if (template.salary > employees[j].salary){
                        employees[i] = employees[j];
                        employees[j] = template;
                        break;
                    }
                }
                if (template.name.compareTo(employees[j].name) < 0){
                    employees[i] = employees[j];
                    employees[j] = template;
                }
            }
        }
        return employees;
    }
    Employee edit(Employee employeeNew) {
        if (employeeNew.id > employees.length) {
            return null;
        }
        Employee employeeCurrent = getById(employeeNew.id);
        Employee employeeUpdated = new Employee(employeeNew.id, employeeNew.name, employeeNew.age, employeeNew.salary, employeeNew.gender);
        employees[(int) employeeNew.id - 1] = employeeUpdated;
        return employeeCurrent;
    }
    Employee remove(long id){
        Employee oldWorker = getById(id);
        for (Employee worker : this.employees){
            if(worker.getId() == id){
                worker = null;
            }
        }
        return oldWorker;
    }
    void add(Employee employee){
        Employee[] newEmployees = new Employee[this.employees.length + 1];
        for (int i = 0; i < newEmployees.length - 1; i++) {
            newEmployees[i] = employees[i];
        }
        newEmployees[newEmployees.length - 1] = employee;
        this.employees = newEmployees;
    }
}