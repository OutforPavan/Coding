package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.util.List;
import java.util.Map;

/**
 * J12 / P0 — Grouping and duplicate-key merge policies.
 * Illustrative lab. countByDepartment groups employees by department. maximumSalaryByName
 * builds a map keyed by employee name and keeps the maximum salary for duplicate names.
 * Both returned maps must iterate in ascending key order for deterministic output.
 * Complete a collector-based implementation without shared mutation; discuss an equivalent
 * loop and why writing into an ordinary shared map from parallel forEach is unsafe.
 * Inputs contain no nulls; salary values are nonnegative integer units.
 */
public final class J12CollectorsLab {
    public static final class Employee {
        public final String name;
        public final String department;
        public final int salary;
        public Employee(String name, String department, int salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
    }

    public static Map<String, Long> countByDepartment(List<Employee> employees) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static Map<String, Integer> maximumSalaryByName(List<Employee> employees) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee("Ada", "Platform", 100),
                new Employee("Grace", "Security", 140), new Employee("Ada", "Platform", 130),
                new Employee("Linus", "Platform", 120));
        ExampleRunner.run("J12 grouping", "Ada/Platform/100, Grace/Security/140, Ada/Platform/130, Linus/Platform/120",
                "{Platform=3, Security=1}", () -> countByDepartment(employees));
        ExampleRunner.run("J12 duplicate map keys", "Ada salaries 100 and 130; Grace 140; Linus 120",
                "{Ada=130, Grace=140, Linus=120}", () -> maximumSalaryByName(employees));
    }
}
