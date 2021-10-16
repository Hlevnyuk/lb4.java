public class Designer extends Employee{
    int rate;
    int workedDays;
    @Override
    public String toString() {
        return "Designer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                ", rate=" + rate +
                ", workedDays=" + workedDays +
                '}';
    }
    public Designer(long id, String name, int age, int salary, char gender, int rate, int workedDays){
        super(id, name, age, salary, gender);
    }
    public int getSalary(){
        return this.salary + this.rate * this.workedDays;
    }
}
