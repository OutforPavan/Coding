package practice.streams;

import java.util.Objects;

/** Immutable practice model. Duplicate names and salaries are intentional in sample data. */
public final class Employee {
    private final int id;
    private final String name;
    private final String department;
    private final double salary;
    private final int age;
    private final String gender;
    private final String city;
    private final int yearOfJoining;

    public Employee(int id, String name, String department, double salary,
                    int age, String gender, String city, int yearOfJoining) {
        this.id = id;
        this.name = Objects.requireNonNull(name, "name");
        this.department = Objects.requireNonNull(department, "department");
        this.salary = salary;
        this.age = age;
        this.gender = Objects.requireNonNull(gender, "gender");
        this.city = Objects.requireNonNull(city, "city");
        this.yearOfJoining = yearOfJoining;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getCity() { return city; }
    public int getYearOfJoining() { return yearOfJoining; }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Employee)) return false;
        Employee that = (Employee) other;
        return id == that.id && Double.compare(salary, that.salary) == 0
                && age == that.age && yearOfJoining == that.yearOfJoining
                && name.equals(that.name) && department.equals(that.department)
                && gender.equals(that.gender) && city.equals(that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department, salary, age, gender, city, yearOfJoining);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department
                + "', salary=" + salary + ", age=" + age + ", gender='" + gender
                + "', city='" + city + "', yearOfJoining=" + yearOfJoining + "}";
    }
}
