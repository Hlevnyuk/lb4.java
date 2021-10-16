public class Employee {
    long id;
    String name;
    int age;
    int salary;
    char gender;
    public Employee(long id, String name, int age, int salary, char gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void print(){
        System.out.println("Employee:");
        System.out.print("id: " + this.id + ", ");
        System.out.print("name: " + this.name + ", ");
        System.out.print("age: " + this.age + ", ");
        System.out.print("salary: " + this.salary + ", ");
        System.out.print("gender: " + this.gender + ", ");
    }
    public long getId(){
        return id;
    }
    public long setId(){
        return this.id;
    }
}
