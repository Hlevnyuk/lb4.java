public class Manager extends Employee{
    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
    public Manager(long id, String name, int age, int salary, char gender) {
        super(id, name, age, salary, gender);
    }
}
