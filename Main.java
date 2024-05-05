import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Wiktor", 2000, 1, "2022-01-01", "QA Engineer");
        Worker worker2 = new Worker("Oliwia", 1800, 2, "2021-12-15", "Project Manager");
        Worker worker3 = new Worker("Jerzy", 2200, 3, "2022-02-10", "Senior IT Specialist");
        Worker worker4 = new Worker("Filip", 1900, 4, "2022-03-05", "Junior IT Specialist");

        Manager manager = new Manager("Krzysztof", 3500, 5, "2021-11-20", "Team Leader");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() +
                    ", Pozycja: " + employee.getPosition() +
                    ", Data zatrudnienia: " + employee.getHireDate() +
                    ", Wynagrodzenie " + employee.getSalary() + ")");
            employee.work();
        }
    }
}
