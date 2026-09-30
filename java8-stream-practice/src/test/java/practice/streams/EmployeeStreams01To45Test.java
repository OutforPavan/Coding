package practice.streams;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/** Expected answers only: implementations belong in EmployeeStreamExercises. */
class EmployeeStreams01To45Test {
    private final EmployeeStreamExercises exercises = new EmployeeStreamExercises();
    // An unmodifiable input also catches attempts to sort or edit the source list in place.
    private final List<Employee> employees = Collections.unmodifiableList(SampleEmployees.all());
    private final List<Employee> empty = Collections.emptyList();

    @Test
    void problem01() {
        assertEquals(map("IT", Optional.of(sample(2)), "HR", Optional.of(sample(4)),
                "Finance", Optional.of(sample(7)), "Sales", Optional.of(sample(11)),
                "Legal", Optional.of(sample(14))),
                exercises.p01HighestPaidByDepartment(employees));
        Employee largerId = employee(9, "Zed", "IT", 100, 30);
        Employee smallerId = employee(1, "Amy", "IT", 100, 30);
        assertEquals(map("IT", Optional.of(smallerId)),
                exercises.p01HighestPaidByDepartment(Arrays.asList(largerId, smallerId)));
        assertEquals(Collections.emptyMap(), exercises.p01HighestPaidByDepartment(empty));
    }

    @Test
    void problem02() {
        assertEquals(map("IT", sample(13), "HR", sample(5), "Finance", sample(8),
                "Sales", sample(10), "Legal", sample(16)),
                exercises.p02LowestPaidByDepartment(employees));
        Employee largerId = employee(9, "Zed", "IT", 100, 30);
        Employee smallerId = employee(1, "Amy", "IT", 100, 30);
        assertEquals(map("IT", smallerId),
                exercises.p02LowestPaidByDepartment(Arrays.asList(largerId, smallerId)));
        assertEquals(Collections.emptyMap(), exercises.p02LowestPaidByDepartment(empty));
    }

    @Test
    void problem03() {
        assertDoubleMap(map("IT", 120000.0, "HR", 80000.0, "Finance", 150000.0,
                "Sales", 70000.0, "Legal", 110000.0),
                exercises.p03HighestSalaryByDepartment(employees));
        assertEquals(Collections.emptyMap(), exercises.p03HighestSalaryByDepartment(empty));
    }

    @Test
    void problem04() {
        assertDoubleMap(map("IT", 95000.0, "HR", 73333.33333333333, "Finance", 110000.0,
                "Sales", 56666.666666666664, "Legal", 105000.0),
                exercises.p04AverageSalaryByDepartment(employees));
        assertEquals(Collections.emptyMap(), exercises.p04AverageSalaryByDepartment(empty));
    }

    @Test
    void problem05() {
        assertDoubleMap(map("IT", 380000.0, "HR", 220000.0, "Finance", 330000.0,
                "Sales", 170000.0, "Legal", 315000.0),
                exercises.p05TotalSalaryByDepartment(employees));
        assertEquals(Collections.emptyMap(), exercises.p05TotalSalaryByDepartment(empty));
    }

    @Test
    void problem06() {
        assertEquals(map("IT", 4L, "HR", 3L, "Finance", 3L, "Sales", 3L, "Legal", 3L),
                exercises.p06EmployeeCountByDepartment(employees));
        assertEquals(Collections.emptyMap(), exercises.p06EmployeeCountByDepartment(empty));
    }

    @Test
    void problem07() {
        assertEquals(map("IT", samples(1, 2, 3, 13), "HR", samples(4, 5, 6),
                "Finance", samples(7, 8, 9), "Sales", samples(10, 11, 12),
                "Legal", samples(14, 15, 16)), exercises.p07GroupByDepartment(employees));
        assertEquals(map("IT", samples(3, 1, 2)),
                exercises.p07GroupByDepartment(samples(3, 1, 2)));
        assertEquals(Collections.emptyMap(), exercises.p07GroupByDepartment(empty));
    }

    @Test
    void problem08() {
        assertEquals(map("Female", samples(1, 4, 6, 8, 10, 12, 14),
                "Male", samples(2, 3, 5, 7, 9, 11, 13, 15, 16)),
                exercises.p08GroupByGender(employees));
        assertEquals(map("Male", samples(9, 3, 2)),
                exercises.p08GroupByGender(samples(9, 3, 2)));
        assertEquals(Collections.emptyMap(), exercises.p08GroupByGender(empty));
    }

    @Test
    void problem09() {
        assertEquals(map("Female", 7L, "Male", 9L), exercises.p09CountByGender(employees));
        assertEquals(Collections.emptyMap(), exercises.p09CountByGender(empty));
    }

    @Test
    void problem10() {
        assertDoubleMap(map("Female", 27.428571428571427, "Male", 32.333333333333336),
                exercises.p10AverageAgeByGender(employees));
        assertEquals(Collections.emptyMap(), exercises.p10AverageAgeByGender(empty));
    }

    @Test
    void problem11() {
        assertDoubleMap(map("Female", 110000.0, "Male", 150000.0),
                exercises.p11HighestSalaryByGender(employees));
        assertEquals(Collections.emptyMap(), exercises.p11HighestSalaryByGender(empty));
    }

    @Test
    void problem12() {
        assertEquals(set("IT"), exercises.p12DepartmentsWithMoreThan(employees, 3));
        assertEquals(set("IT", "HR", "Finance", "Sales", "Legal"),
                exercises.p12DepartmentsWithMoreThan(employees, 2));
        assertEquals(Collections.emptySet(), exercises.p12DepartmentsWithMoreThan(employees, 4));
        assertEquals(Collections.emptySet(), exercises.p12DepartmentsWithMoreThan(empty, 0));
    }

    @Test
    void problem13() {
        assertEquals(set("Finance", "Legal"),
                exercises.p13DepartmentsAboveAverageSalary(employees, 95000));
        assertEquals(set("Finance"),
                exercises.p13DepartmentsAboveAverageSalary(employees, 105000));
        assertEquals(Collections.emptySet(),
                exercises.p13DepartmentsAboveAverageSalary(employees, 110000));
        assertEquals(Collections.emptySet(), exercises.p13DepartmentsAboveAverageSalary(empty, 0));
    }

    @Test
    void problem14() {
        assertEquals(Optional.of("IT"), exercises.p14DepartmentWithHighestTotalSalary(employees));
        List<Employee> tiedTotals = Arrays.asList(
                employee(1, "Ben", "B", 200, 30),
                employee(2, "Amy", "A", 100, 30),
                employee(3, "Ann", "A", 100, 30));
        assertEquals(Optional.of("A"), exercises.p14DepartmentWithHighestTotalSalary(tiedTotals));
        assertEquals(Optional.empty(), exercises.p14DepartmentWithHighestTotalSalary(empty));
    }

    @Test
    void problem15() {
        assertEquals(Optional.of("IT"), exercises.p15DepartmentWithMostEmployees(employees));
        List<Employee> tiedCounts = Arrays.asList(
                employee(1, "Ben", "B", 200, 30),
                employee(2, "Amy", "A", 100, 30));
        assertEquals(Optional.of("A"), exercises.p15DepartmentWithMostEmployees(tiedCounts));
        assertEquals(Optional.empty(), exercises.p15DepartmentWithMostEmployees(empty));
    }

    @Test
    void problem16() {
        assertEquals(Optional.of("Finance"), exercises.p16DepartmentWithHighestAverageSalary(employees));
        List<Employee> tiedAverages = Arrays.asList(
                employee(1, "Ben", "B", 200, 30),
                employee(2, "Amy", "A", 100, 30),
                employee(3, "Ann", "A", 300, 30));
        assertEquals(Optional.of("A"), exercises.p16DepartmentWithHighestAverageSalary(tiedAverages));
        assertEquals(Optional.empty(), exercises.p16DepartmentWithHighestAverageSalary(empty));
    }

    @Test
    void problem17() {
        assertEquals(samples(1, 2, 3, 4, 6, 7, 11, 14, 15),
                exercises.p17EmployeesAboveDepartmentAverage(employees));
        assertEquals(Collections.emptyList(),
                exercises.p17EmployeesAboveDepartmentAverage(samples(2, 3)));
        assertEquals(Collections.emptyList(), exercises.p17EmployeesAboveDepartmentAverage(empty));
    }

    @Test
    void problem18() {
        assertEquals(map("IT", Optional.of(100000.0), "HR", Optional.of(60000.0),
                "Finance", Optional.of(90000.0), "Sales", Optional.of(50000.0),
                "Legal", Optional.of(95000.0)),
                exercises.p18SecondHighestSalaryByDepartment(employees));
        assertEquals(map("IT", Optional.empty(), "Finance", Optional.empty()),
                exercises.p18SecondHighestSalaryByDepartment(samples(2, 3, 7)));
        assertEquals(Collections.emptyMap(), exercises.p18SecondHighestSalaryByDepartment(empty));
    }

    @Test
    void problem19() {
        assertEquals(map("IT", samples(2, 3, 1), "HR", samples(4, 6, 5),
                "Finance", samples(7, 8, 9), "Sales", samples(11, 10, 12),
                "Legal", samples(14, 15, 16)), exercises.p19TopThreePaidByDepartment(employees));
        Employee first = employee(1, "Amy", "IT", 100, 30);
        Employee second = employee(2, "Ben", "IT", 100, 30);
        Employee third = employee(3, "Cal", "IT", 100, 30);
        Employee fourth = employee(4, "Dan", "IT", 100, 30);
        assertEquals(map("IT", Arrays.asList(first, second, third)),
                exercises.p19TopThreePaidByDepartment(Arrays.asList(fourth, third, second, first)));
        assertEquals(map("HR", samples(4), "IT", samples(2, 3)),
                exercises.p19TopThreePaidByDepartment(samples(4, 3, 2)));
        assertEquals(Collections.emptyMap(), exercises.p19TopThreePaidByDepartment(empty));
    }

    @Test
    void problem20() {
        assertEquals(map("IT", samples(2, 3), "HR", samples(4, 6),
                "Finance", samples(7), "Sales", samples(11), "Legal", samples(14, 15)),
                exercises.p20AllHighestPaidByDepartment(employees));
        assertEquals(map("IT", samples(3, 2)),
                exercises.p20AllHighestPaidByDepartment(samples(3, 1, 2)));
        assertEquals(Collections.emptyMap(), exercises.p20AllHighestPaidByDepartment(empty));
    }

    @Test
    void problem21() {
        assertEquals(samples(13, 10, 12, 5, 11, 4, 6, 8, 9, 16, 1, 14, 15, 2, 3, 7),
                exercises.p21SortSalaryAscending(employees));
        assertEquals(samples(1, 2, 3), exercises.p21SortSalaryAscending(samples(3, 2, 1)));
        assertEquals(Collections.emptyList(), exercises.p21SortSalaryAscending(empty));
    }

    @Test
    void problem22() {
        assertEquals(samples(7, 2, 3, 14, 15, 1, 16, 8, 9, 4, 6, 11, 5, 10, 12, 13),
                exercises.p22SortSalaryDescending(employees));
        assertEquals(samples(2, 3, 1), exercises.p22SortSalaryDescending(samples(3, 1, 2)));
        assertEquals(Collections.emptyList(), exercises.p22SortSalaryDescending(empty));
    }

    @Test
    void problem23() {
        assertEquals(samples(7, 8, 9, 4, 6, 5, 2, 3, 1, 13, 14, 15, 16, 11, 10, 12),
                exercises.p23SortDepartmentThenSalary(employees));
        assertEquals(samples(4, 6, 2, 3),
                exercises.p23SortDepartmentThenSalary(samples(3, 6, 2, 4)));
        assertEquals(Collections.emptyList(), exercises.p23SortDepartmentThenSalary(empty));
    }

    @Test
    void problem24() {
        assertEquals(samples(1, 6, 14, 2, 9, 3, 4, 5, 12, 7, 8, 10, 11, 16, 15, 13),
                exercises.p24SortByName(employees));
        assertEquals(samples(2, 9), exercises.p24SortByName(samples(9, 2)));
        Employee lowercase = employee(1, "alice", "IT", 100, 30);
        Employee uppercase = employee(2, "Zoe", "IT", 100, 30);
        assertEquals(Arrays.asList(uppercase, lowercase),
                exercises.p24SortByName(Arrays.asList(lowercase, uppercase)));
        assertEquals(Collections.emptyList(), exercises.p24SortByName(empty));
    }

    @Test
    void problem25() {
        assertEquals(samples(7, 2, 3, 14, 15), exercises.p25TopFivePaid(employees));
        assertEquals(samples(2, 3, 1), exercises.p25TopFivePaid(samples(3, 1, 2)));
        assertEquals(Collections.emptyList(), exercises.p25TopFivePaid(empty));
    }

    @Test
    void problem26() {
        assertEquals(samples(13, 10, 12), exercises.p26BottomThreePaid(employees));
        assertEquals(samples(2, 3), exercises.p26BottomThreePaid(samples(3, 2)));
        assertEquals(Collections.emptyList(), exercises.p26BottomThreePaid(empty));
    }

    @Test
    void problem27() {
        assertEquals(samples(2, 3, 7, 14, 15), exercises.p27SalaryAbove(employees, 100000));
        assertEquals(samples(3, 2), exercises.p27SalaryAbove(samples(3, 1, 2), 100000));
        assertEquals(Collections.emptyList(), exercises.p27SalaryAbove(employees, 150000));
        assertEquals(Collections.emptyList(), exercises.p27SalaryAbove(empty, 0));
    }

    @Test
    void problem28() {
        assertEquals(samples(1, 4, 6, 8, 9, 16),
                exercises.p28SalaryBetween(employees, 80000, 100000));
        assertEquals(samples(2, 3), exercises.p28SalaryBetween(employees, 120000, 120000));
        assertEquals(Collections.emptyList(), exercises.p28SalaryBetween(employees, 1, 2));
        assertEquals(Collections.emptyList(), exercises.p28SalaryBetween(empty, 0, 100000));
    }

    @Test
    void problem29() {
        assertEquals(samples(2, 4, 7, 9, 11, 14, 15), exercises.p29OlderThan(employees, 30));
        assertEquals(Collections.emptyList(), exercises.p29OlderThan(employees, 45));
        assertEquals(Collections.emptyList(), exercises.p29OlderThan(empty, 0));
    }

    @Test
    void problem30() {
        assertEquals(samples(5, 6, 10, 12, 13), exercises.p30JoinedAfter(employees, 2020));
        assertEquals(Collections.emptyList(), exercises.p30JoinedAfter(employees, 2024));
        assertEquals(Collections.emptyList(), exercises.p30JoinedAfter(empty, 2000));
    }

    @Test
    void problem31() {
        assertEquals(samples(3, 16), exercises.p31JoinedIn(employees, 2020));
        assertEquals(samples(12, 13), exercises.p31JoinedIn(employees, 2024));
        assertEquals(Collections.emptyList(), exercises.p31JoinedIn(employees, 1999));
        assertEquals(Collections.emptyList(), exercises.p31JoinedIn(empty, 2020));
    }

    @Test
    void problem32() {
        assertEquals(samples(1, 3), exercises.p32InDepartmentAndCity(employees, "IT", "Pune"));
        assertEquals(Collections.emptyList(), exercises.p32InDepartmentAndCity(employees, "IT", "Mumbai"));
        assertEquals(Collections.emptyList(), exercises.p32InDepartmentAndCity(employees, "it", "Pune"));
        assertEquals(Collections.emptyList(), exercises.p32InDepartmentAndCity(employees, "IT", "pune"));
        assertEquals(Collections.emptyList(), exercises.p32InDepartmentAndCity(empty, "IT", "Pune"));
    }

    @Test
    void problem33() {
        assertEquals(Optional.of(sample(12)), exercises.p33YoungestEmployee(employees));
        Employee olderId = employee(9, "Zed", "IT", 100, 20);
        Employee smallerId = employee(1, "Amy", "HR", 200, 20);
        assertEquals(Optional.of(smallerId),
                exercises.p33YoungestEmployee(Arrays.asList(olderId, smallerId)));
        assertEquals(Optional.empty(), exercises.p33YoungestEmployee(empty));
    }

    @Test
    void problem34() {
        assertEquals(Optional.of(sample(7)), exercises.p34OldestEmployee(employees));
        Employee largerId = employee(9, "Zed", "IT", 100, 60);
        Employee smallerId = employee(1, "Amy", "HR", 200, 60);
        assertEquals(Optional.of(smallerId),
                exercises.p34OldestEmployee(Arrays.asList(largerId, smallerId)));
        assertEquals(Optional.empty(), exercises.p34OldestEmployee(empty));
    }

    @Test
    void problem35() {
        assertEquals(Optional.of(sample(13)), exercises.p35SecondYoungestEmployee(employees));
        Employee youngestOne = employee(9, "Amy", "IT", 100, 20);
        Employee youngestTwo = employee(8, "Ben", "IT", 100, 20);
        Employee secondLargerId = employee(7, "Cal", "IT", 100, 21);
        Employee secondSmallerId = employee(1, "Dan", "IT", 100, 21);
        assertEquals(Optional.of(secondSmallerId), exercises.p35SecondYoungestEmployee(
                Arrays.asList(youngestOne, youngestTwo, secondLargerId, secondSmallerId)));
        assertEquals(Optional.empty(),
                exercises.p35SecondYoungestEmployee(Arrays.asList(youngestOne, youngestTwo)));
        assertEquals(Optional.empty(), exercises.p35SecondYoungestEmployee(samples(1)));
        assertEquals(Optional.empty(), exercises.p35SecondYoungestEmployee(empty));
    }

    @Test
    void problem36() {
        assertEquals(Optional.of(sample(3)), exercises.p36EmployeeWithLongestName(employees));
        Employee largerId = employee(9, "Zelda", "IT", 100, 30);
        Employee smallerId = employee(1, "Alice", "HR", 200, 30);
        assertEquals(Optional.of(smallerId),
                exercises.p36EmployeeWithLongestName(Arrays.asList(largerId, smallerId)));
        assertEquals(Optional.empty(), exercises.p36EmployeeWithLongestName(empty));
    }

    @Test
    void problem37() {
        assertEquals(samples(1, 6, 14), exercises.p37NameStartsWith(employees, "A"));
        assertEquals(samples(6), exercises.p37NameStartsWith(employees, "An"));
        assertEquals(Collections.emptyList(), exercises.p37NameStartsWith(employees, "a"));
        assertEquals(employees, exercises.p37NameStartsWith(employees, ""));
        assertEquals(Collections.emptyList(), exercises.p37NameStartsWith(empty, "A"));
    }

    @Test
    void problem38() {
        assertEquals(samples(4, 5, 7, 10, 11), exercises.p38NameContains(employees, "an"));
        assertEquals(samples(6), exercises.p38NameContains(employees, "An"));
        assertEquals(Collections.emptyList(), exercises.p38NameContains(employees, "xyz"));
        assertEquals(employees, exercises.p38NameContains(employees, ""));
        assertEquals(Collections.emptyList(), exercises.p38NameContains(empty, "an"));
    }

    @Test
    void problem39() {
        assertEquals(set("IT", "HR", "Finance", "Sales", "Legal"),
                exercises.p39DistinctDepartments(employees));
        assertEquals(Collections.emptySet(), exercises.p39DistinctDepartments(empty));
    }

    @Test
    void problem40() {
        assertEquals(set("Pune", "Bangalore", "Delhi", "Mumbai"),
                exercises.p40DistinctCities(employees));
        assertEquals(Collections.emptySet(), exercises.p40DistinctCities(empty));
    }

    @Test
    void problem41() {
        assertEquals(set("Alice", "Bob", "Charlie", "Diana", "Evan", "Anna", "Frank", "Grace",
                "Hannah", "Ivan", "Eve", "Otto", "Ava", "Nitin", "Liam"),
                exercises.p41DistinctNames(employees));
        assertEquals(Collections.emptySet(), exercises.p41DistinctNames(empty));
    }

    @Test
    void problem42() {
        assertEquals(5L, exercises.p42CountDistinctDepartments(employees));
        assertEquals(1L, exercises.p42CountDistinctDepartments(samples(1, 2, 3, 13)));
        assertEquals(0L, exercises.p42CountDistinctDepartments(empty));
    }

    @Test
    void problem43() {
        assertEquals(map(1, sample(1), 2, sample(2), 3, sample(3), 4, sample(4),
                5, sample(5), 6, sample(6), 7, sample(7), 8, sample(8),
                9, sample(9), 10, sample(10), 11, sample(11), 12, sample(12),
                13, sample(13), 14, sample(14), 15, sample(15), 16, sample(16)),
                exercises.p43EmployeeById(employees));
        assertThrows(IllegalStateException.class,
                () -> exercises.p43EmployeeById(SampleEmployees.withDuplicateIds()));
        assertThrows(IllegalStateException.class,
                () -> exercises.p43EmployeeById(samples(1, 1)));
        assertEquals(Collections.emptyMap(), exercises.p43EmployeeById(empty));
    }

    @Test
    void problem44() {
        assertDoubleMap(map("Alice", 100000.0, "Bob", 120000.0, "Charlie", 120000.0,
                "Diana", 80000.0, "Evan", 60000.0, "Anna", 80000.0,
                "Frank", 150000.0, "Grace", 90000.0, "Hannah", 50000.0,
                "Ivan", 70000.0, "Eve", 50000.0, "Otto", 40000.0,
                "Ava", 110000.0, "Nitin", 110000.0, "Liam", 95000.0),
                exercises.p44SalaryByName(employees));
        assertDoubleMap(map("Bob", 90000.0), exercises.p44SalaryByName(samples(9, 2)));
        assertEquals(Collections.emptyMap(), exercises.p44SalaryByName(empty));
    }

    @Test
    void problem45() {
        assertEquals(map("IT", 4L, "HR", 3L, "Finance", 3L, "Sales", 3L, "Legal", 3L),
                exercises.p45DepartmentCountMap(employees));
        assertEquals(Collections.emptyMap(), exercises.p45DepartmentCountMap(empty));
    }

    private Employee sample(int id) {
        return employees.get(id - 1);
    }

    private List<Employee> samples(int... ids) {
        List<Employee> result = new ArrayList<Employee>();
        for (int id : ids) {
            result.add(sample(id));
        }
        return Collections.unmodifiableList(result);
    }

    private static Employee employee(int id, String name, String department, double salary, int age) {
        return new Employee(id, name, department, salary, age, "Male", "Pune", 2020);
    }

    @SafeVarargs
    private static <T> Set<T> set(T... items) {
        return new HashSet<T>(Arrays.asList(items));
    }

    @SuppressWarnings("unchecked")
    private static <K, V> Map<K, V> map(Object... entries) {
        Map<K, V> result = new HashMap<K, V>();
        for (int i = 0; i < entries.length; i += 2) {
            result.put((K) entries[i], (V) entries[i + 1]);
        }
        return result;
    }

    private static void assertDoubleMap(Map<String, Double> expected, Map<String, Double> actual) {
        assertEquals(expected.keySet(), actual.keySet());
        for (Map.Entry<String, Double> entry : expected.entrySet()) {
            assertEquals(entry.getValue(), actual.get(entry.getKey()), 0.000001,
                    "Unexpected value for " + entry.getKey());
        }
    }
}
