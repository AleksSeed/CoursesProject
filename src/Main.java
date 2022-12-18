import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        list();
    }

    public static void list() {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иванов", "Иван", "Иванович", 1, 27500);
        employee[1] = new Employee("Петров", "Петр", "Петрович", 3, 45200);
        employee[2] = new Employee("Сидоров", "Сидор", "Сидорович", 2, 31750);
        employee[3] = new Employee("Семёнов", "Семён", "Семёнович", 3, 35000);
        employee[4] = new Employee("Сергеев", "Сергей", "Сергеевич", 5, 35500);
        employee[5] = new Employee("Алексеев", "Алексей", "Алексеевич", 3, 37500);
        employee[6] = new Employee("Александров", "Александр", "Александрович", 4, 31750);
        employee[7] = new Employee("Васильев", "Василий", "Васильевич", 1, 35000);
        employee[8] = new Employee("Михайлов", "Михаил", "Михайлович", 4, 26600);
        employee[9] = new Employee("Антонов", "Антон", "Антонович", 5, 45000);

        for (Employee emp : employee) {
            System.out.println(emp);
        }

        final var result = Arrays.stream(employee).collect(Collectors.summarizingInt(Employee::getSalary));
        System.out.println("\nСумма затрат на зарплаты в месяц: " + result.getSum());
        System.out.println("Минимальная зарплата: " + result.getMin());
        System.out.println("Максимальная зарплата: " + result.getMax());
        System.out.println("Средняя зарплата: " + result.getAverage());
        System.out.println();

        System.out.println("Список сотрудников:");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getSurname() + " " + employee[i].getName() + " " + employee[i].getMiddlename());

        }
    }

}