import java.util.ArrayList;
import java.util.List;

// Класс Employee (Сотрудник)
class Employee {
    String name;
    String job;

    public Employee(String name, String job) {
        this.name = name;
        this.job = job;
    }

    // Метод для вывода информации о сотруднике
    public void printEmp() {
        System.out.println(name + " - " + job);
    }
}

// Класс Department (Отдел)
class Department {
    String name;
    List<Employee> employees;

    // Конструктор
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Метод для добавления сотрудника в список
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Метод для вывода списка сотрудников
    public void listEmployees() {
        System.out.println("Сотрудники отдела " + name + ":");
        for (Employee employee : employees) {
            employee.printEmp();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        //Сотрудники
        Employee employee1 = new Employee("Нуртай Туратбеков", "Разработчик Backend");
        Employee employee2 = new Employee("Бекзат Сагынбеков", "Разработчик Fullstack");
        Employee employee3 = new Employee("Ильгиз Исаков", "Разработчик Frontend");

        // Отдел
        Department department = new Department("IT Отдел");

        // Добавляем сотрудников в отдел
        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);

        // Выводим список сотрудников
        department.listEmployees();
    }
}
