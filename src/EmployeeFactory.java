import java.util.Random;
public class EmployeeFactory {
    static String[] namesWomen = {"Anna", "Marina", "Nastya", "Vladislava"};
    static String[] namesMan = {"Artem", "Stanislav", "Misha", "Andrey"};
    static int random(int min, int max) {
        int delta = max - min;
        double random = Math.random();
        return (int) (random * delta + min);
    }
    static String generateName(char gender){
        int random = random(0, 4);
        System.out.println(random);
        if (gender =='m') {
            return namesMan[random];
        }
        else {
            return namesWomen[random];
        }
    }
    static char generateGender(){
        int random = random(0, 2);
        System.out.println(random);
        if (random == 0) {
            return 'm';
        }
        else {
            return 'w';
        }
    }
    static int generateSalary(){
        int random = random(1000, 5000);
        return random;
    }
    static int generateFixedBugs(){
        int random = random(0, 10);
        return random;
    }
    static int generateDefaultBugRate(){
        int random = random(100, 400);
        return random;
    }
    static int generateAge(){
        int random = random(20, 50);
        return random;
    }
    long generateId(){
        return new Random().nextInt(size) + 1;
    }
    int generateWorkedDays(){
        return new Random().nextInt(29) + 1;
    }
    int size;
    Employee[] generateEmployees(int size){
        this.size = size;
        Employee[] employees = new Employee[size];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        return employees;
    }
    Employee generateEmployee(){
        int random = (new Random()).nextInt(3);
        switch (random){
            case 0:
                return new Developer(generateId(), generateName('m'), generateAge(), generateSalary(), generateGender(), generateFixedBugs());
            case 1:
                return new Manager(generateId(), generateName('w'), generateAge(), generateSalary(), generateGender());
            case 2:
                return new Designer(generateId(), generateName('m'), generateAge(), generateSalary(), generateGender(), generateDefaultBugRate(), generateWorkedDays());
        }
        return null;
    }
}
