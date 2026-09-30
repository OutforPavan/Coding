package practice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class SampleEmployees {
    private SampleEmployees() { }

    /** Fresh list per call, deliberately NOT sorted by salary, name, age, or department. */
    public static List<Employee> all() {
        return new ArrayList<Employee>(Arrays.asList(
                new Employee(1, "Alice", "IT", 100000, 30, "Female", "Pune", 2018),
                new Employee(2, "Bob", "IT", 120000, 35, "Male", "Bangalore", 2015),
                new Employee(3, "Charlie", "IT", 120000, 28, "Male", "Pune", 2020),
                new Employee(4, "Diana", "HR", 80000, 32, "Female", "Delhi", 2017),
                new Employee(5, "Evan", "HR", 60000, 26, "Male", "Pune", 2021),
                new Employee(6, "Anna", "HR", 80000, 24, "Female", "Bangalore", 2022),
                new Employee(7, "Frank", "Finance", 150000, 45, "Male", "Mumbai", 2005),
                new Employee(8, "Grace", "Finance", 90000, 29, "Female", "Pune", 2019),
                new Employee(9, "Bob", "Finance", 90000, 31, "Male", "Bangalore", 2016),
                new Employee(10, "Hannah", "Sales", 50000, 22, "Female", "Delhi", 2023),
                new Employee(11, "Ivan", "Sales", 70000, 40, "Male", "Pune", 2010),
                new Employee(12, "Eve", "Sales", 50000, 17, "Female", "Bangalore", 2024),
                new Employee(13, "Otto", "IT", 40000, 21, "Male", "Delhi", 2024),
                new Employee(14, "Ava", "Legal", 110000, 38, "Female", "Pune", 2012),
                new Employee(15, "Nitin", "Legal", 110000, 38, "Male", "Bangalore", 2012),
                new Employee(16, "Liam", "Legal", 95000, 27, "Male", "Delhi", 2020)
        ));
    }

    /** Separate fixture so ordinary ID-map exercises receive unique IDs. */
    public static List<Employee> withDuplicateIds() {
        List<Employee> employees = all();
        employees.add(new Employee(2, "Robert", "IT", 125000, 36, "Male", "Pune", 2014));
        employees.add(new Employee(7, "Francis", "Finance", 155000, 46, "Male", "Mumbai", 2004));
        return employees;
    }
}
