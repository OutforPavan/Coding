package practice.streams;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/** See README.md for the command to run problem46 individually. */
class EmployeeStreams46To90Test {
    private final EmployeeStreamExercises exercises = new EmployeeStreamExercises();
    private final List<Employee> sample = Collections.unmodifiableList(SampleEmployees.all());
    private final List<Employee> empty = Collections.emptyList();

    @Test
    void problem46() {
        assertDoubleMap(map("IT", 95000.0, "HR", 220000.0 / 3,
                "Finance", 110000.0, "Sales", 170000.0 / 3, "Legal", 105000.0),
                exercises.p46DepartmentAverageMap(sample));
        assertEquals(Collections.emptyMap(), exercises.p46DepartmentAverageMap(empty));
    }

    @Test
    void problem47() {
        assertEquals(map("IT", employee(2), "HR", employee(4), "Finance", employee(7),
                "Sales", employee(11), "Legal", employee(14)),
                exercises.p47DepartmentHighestPaidMap(sample));
        assertEquals(map("IT", employee(2)),
                exercises.p47DepartmentHighestPaidMap(employees(3, 2)));
        assertEquals(Collections.emptyMap(), exercises.p47DepartmentHighestPaidMap(empty));
    }

    @Test
    void problem48() {
        assertEquals(map("Alice", employee(1), "Bob", employee(2), "Charlie", employee(3),
                "Diana", employee(4), "Evan", employee(5), "Anna", employee(6),
                "Frank", employee(7), "Grace", employee(8), "Hannah", employee(10),
                "Ivan", employee(11), "Eve", employee(12), "Otto", employee(13),
                "Ava", employee(14), "Nitin", employee(15), "Liam", employee(16)),
                exercises.p48MergeDuplicateNames(sample));
        Employee lowId = fixture(20, "Same", "IT", 120000, 25, "Male", "Pune", 2020);
        Employee highId = fixture(21, "Same", "IT", 120000, 25, "Male", "Pune", 2020);
        Employee lowerSalary = fixture(19, "Same", "IT", 110000, 25, "Male", "Pune", 2020);
        assertEquals(map("Same", lowId), exercises.p48MergeDuplicateNames(
                fixed(highId, lowerSalary, lowId)));
        assertEquals(Collections.emptyMap(), exercises.p48MergeDuplicateNames(empty));
    }

    @Test
    void problem49() {
        assertEquals(map("IT", employees(1, 2, 3, 13), "HR", employees(4, 5, 6),
                "Finance", employees(7, 8, 9), "Sales", employees(10, 11, 12),
                "Legal", employees(14, 15, 16)), exercises.p49DepartmentEmployeeLists(sample));
        assertEquals(map("IT", employees(13, 3, 1)),
                exercises.p49DepartmentEmployeeLists(employees(13, 3, 1)));
        assertEquals(Collections.emptyMap(), exercises.p49DepartmentEmployeeLists(empty));
    }

    @Test
    void problem50() {
        assertEquals(map("IT", set("Alice", "Bob", "Charlie", "Otto"),
                "HR", set("Diana", "Evan", "Anna"), "Finance", set("Frank", "Grace", "Bob"),
                "Sales", set("Hannah", "Ivan", "Eve"), "Legal", set("Ava", "Nitin", "Liam")),
                exercises.p50DepartmentNameSets(sample));
        assertEquals(map("IT", set("Alice")),
                exercises.p50DepartmentNameSets(employees(1, 1)));
        assertEquals(Collections.emptyMap(), exercises.p50DepartmentNameSets(empty));
    }

    @Test
    void problem51() {
        assertEquals(map(true, employees(1, 2, 3, 7, 14, 15, 16),
                false, employees(4, 5, 6, 8, 9, 10, 11, 12, 13)),
                exercises.p51PartitionBySalary(sample, 90000));
        assertEquals(map(true, empty, false, sample),
                exercises.p51PartitionBySalary(sample, 150000));
        assertEquals(map(true, empty, false, empty), exercises.p51PartitionBySalary(empty, 0));
    }

    @Test
    void problem52() {
        assertEquals(map(true, employees(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16),
                false, employees(12)), exercises.p52PartitionAdults(sample));
        Employee adult = fixture(20, "Adult", "IT", 100, 18, "Male", "Pune", 2024);
        assertEquals(map(true, fixed(adult), false, empty),
                exercises.p52PartitionAdults(fixed(adult)));
        assertEquals(map(true, empty, false, empty), exercises.p52PartitionAdults(empty));
    }

    @Test
    void problem53() {
        assertEquals(map(true, employees(1, 2, 4, 7, 9, 11, 14, 15),
                false, employees(3, 5, 6, 8, 10, 12, 13, 16)),
                exercises.p53PartitionByExperience(sample, 2026, 8));
        assertEquals(map(true, sample, false, empty),
                exercises.p53PartitionByExperience(sample, 2024, 0));
        assertEquals(map(true, empty, false, empty),
                exercises.p53PartitionByExperience(empty, 2026, 8));
    }

    @Test
    void problem54() {
        assertEquals(map(true, employees(1, 2, 3, 13),
                false, employees(4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16)),
                exercises.p54PartitionIT(sample));
        Employee lowercase = fixture(20, "Lower", "it", 100, 25, "Male", "Pune", 2020);
        assertEquals(map(true, empty, false, fixed(lowercase)),
                exercises.p54PartitionIT(fixed(lowercase)));
        assertEquals(map(true, empty, false, empty), exercises.p54PartitionIT(empty));
    }

    @Test
    void problem55() {
        assertEquals(map(true, 7L, false, 9L), exercises.p55CountSalaryPartitions(sample, 90000));
        assertEquals(map(true, 0L, false, 16L), exercises.p55CountSalaryPartitions(sample, 150000));
        assertEquals(map(true, 0L, false, 0L), exercises.p55CountSalaryPartitions(empty, 0));
    }

    @Test
    void problem56() {
        assertEquals(set("Bob"), exercises.p56DuplicateNames(sample));
        assertEquals(Collections.emptySet(), exercises.p56DuplicateNames(employees(1, 3, 4)));
        assertEquals(Collections.emptySet(), exercises.p56DuplicateNames(empty));
    }

    @Test
    void problem57() {
        assertEquals(set("Alice", "Charlie", "Diana", "Evan", "Anna", "Frank", "Grace",
                "Hannah", "Ivan", "Eve", "Otto", "Ava", "Nitin", "Liam"),
                exercises.p57UniqueNames(sample));
        assertEquals(Collections.emptySet(), exercises.p57UniqueNames(employees(2, 9)));
        assertEquals(Collections.emptySet(), exercises.p57UniqueNames(empty));
    }

    @Test
    void problem58() {
        assertEquals(map("Alice", 1L, "Bob", 2L, "Charlie", 1L, "Diana", 1L,
                "Evan", 1L, "Anna", 1L, "Frank", 1L, "Grace", 1L, "Hannah", 1L,
                "Ivan", 1L, "Eve", 1L, "Otto", 1L, "Ava", 1L, "Nitin", 1L, "Liam", 1L),
                exercises.p58NameFrequency(sample));
        assertEquals(Collections.emptyMap(), exercises.p58NameFrequency(empty));
    }

    @Test
    void problem59() {
        assertEquals(Arrays.asList("Ava", "Bob", "Bob", "Eve", "Anna", "Evan", "Ivan",
                "Liam", "Otto", "Alice", "Diana", "Frank", "Grace", "Nitin", "Hannah", "Charlie"),
                exercises.p59NamesSortedByLength(sample));
        assertEquals(Collections.emptyList(), exercises.p59NamesSortedByLength(empty));
    }

    @Test
    void problem60() {
        assertEquals(Optional.of("Bob"), exercises.p60FirstNameWithRepeatedCharacter(sample));
        assertEquals(Optional.of("Anna"),
                exercises.p60FirstNameWithRepeatedCharacter(employees(6, 2)));
        assertEquals(Optional.empty(),
                exercises.p60FirstNameWithRepeatedCharacter(employees(1, 3, 5)));
        Employee repeatedIgnoringCase = fixture(20, "AbA", "IT", 100, 25, "Male", "Pune", 2020);
        assertEquals(Optional.of("AbA"),
                exercises.p60FirstNameWithRepeatedCharacter(fixed(repeatedIgnoringCase)));
        Employee repeatedSymbol = fixture(21, "A--b", "IT", 100, 25, "Male", "Pune", 2020);
        assertEquals(Optional.of("A--b"),
                exercises.p60FirstNameWithRepeatedCharacter(fixed(repeatedSymbol)));
        assertEquals(Optional.empty(), exercises.p60FirstNameWithRepeatedCharacter(empty));
    }

    @Test
    void problem61() {
        assertEquals(employees(2, 6, 9, 10, 12, 13, 14, 15), exercises.p61PalindromicNames(sample));
        assertEquals(Collections.emptyList(), exercises.p61PalindromicNames(employees(1, 3, 4)));
        assertEquals(Collections.emptyList(), exercises.p61PalindromicNames(empty));
    }

    @Test
    void problem62() {
        assertEquals(map('A', employees(1, 6, 14), 'B', employees(2, 9), 'C', employees(3),
                'D', employees(4), 'E', employees(5, 12), 'F', employees(7), 'G', employees(8),
                'H', employees(10), 'I', employees(11), 'O', employees(13),
                'N', employees(15), 'L', employees(16)), exercises.p62GroupByNameInitial(sample));
        Employee lower = fixture(20, "alice", "IT", 100, 25, "Female", "Pune", 2020);
        assertEquals(map('a', fixed(lower), 'A', employees(1)),
                exercises.p62GroupByNameInitial(fixed(lower, employee(1))));
        assertEquals(Collections.emptyMap(), exercises.p62GroupByNameInitial(empty));
    }

    @Test
    void problem63() {
        assertEquals(map("IT", employee(3), "HR", employee(4), "Finance", employee(7),
                "Sales", employee(10), "Legal", employee(15)),
                exercises.p63LongestNameByDepartment(sample));
        assertEquals(map("Finance", employee(7)),
                exercises.p63LongestNameByDepartment(employees(8, 7)));
        assertEquals(Collections.emptyMap(), exercises.p63LongestNameByDepartment(empty));
    }

    @Test
    void problem64() {
        assertEquals("Alice,Bob,Charlie,Diana,Evan,Anna,Frank,Grace,Bob,Hannah,Ivan,Eve,Otto,Ava,Nitin,Liam",
                exercises.p64JoinNames(sample));
        assertEquals("Bob,Bob,Alice", exercises.p64JoinNames(employees(9, 2, 1)));
        assertEquals("", exercises.p64JoinNames(empty));
    }

    @Test
    void problem65() {
        assertEquals(map("IT", "Alice,Bob,Charlie,Otto", "HR", "Diana,Evan,Anna",
                "Finance", "Frank,Grace,Bob", "Sales", "Hannah,Ivan,Eve", "Legal", "Ava,Nitin,Liam"),
                exercises.p65JoinNamesByDepartment(sample));
        assertEquals(map("IT", "Bob,Bob,Alice"),
                exercises.p65JoinNamesByDepartment(employees(2, 2, 1)));
        assertEquals(Collections.emptyMap(), exercises.p65JoinNamesByDepartment(empty));
    }

    @Test
    void problem66() {
        assertEquals(employees(1, 2, 3, 13), exercises.p66EmployeesInLargeDepartments(sample, 4));
        assertEquals(sample, exercises.p66EmployeesInLargeDepartments(sample, 3));
        assertEquals(Collections.emptyList(), exercises.p66EmployeesInLargeDepartments(sample, 5));
        assertEquals(Collections.emptyList(), exercises.p66EmployeesInLargeDepartments(empty, 1));
    }

    @Test
    void problem67() {
        assertEquals(set("Pune", "Bangalore"), exercises.p67CitiesCommonToAllDepartments(sample));
        assertEquals(set("Pune", "Bangalore", "Delhi"),
                exercises.p67CitiesCommonToAllDepartments(employees(1, 2, 13)));
        Employee a = fixture(20, "A", "A", 100, 25, "Male", "SharedByTwo", 2020);
        Employee b = fixture(21, "B", "B", 100, 25, "Male", "SharedByTwo", 2020);
        Employee c = fixture(22, "C", "C", 100, 25, "Male", "Other", 2020);
        assertEquals(Collections.emptySet(), exercises.p67CitiesCommonToAllDepartments(fixed(a, b, c)));
        assertEquals(Collections.emptySet(), exercises.p67CitiesCommonToAllDepartments(empty));
    }

    @Test
    void problem68() {
        assertEquals(set("IT", "HR", "Finance", "Sales", "Legal"),
                exercises.p68DepartmentsWithBothGenders(sample));
        assertEquals(set("IT"), exercises.p68DepartmentsWithBothGenders(employees(1, 2, 4, 6)));
        Employee other = fixture(20, "Other", "IT", 100, 25, "Other", "Pune", 2020);
        assertEquals(Collections.emptySet(),
                exercises.p68DepartmentsWithBothGenders(fixed(employee(2), other)));
        assertEquals(Collections.emptySet(), exercises.p68DepartmentsWithBothGenders(empty));
    }

    @Test
    void problem69() {
        assertEquals(set("HR", "Finance", "Legal"), exercises.p69DepartmentsAllAboveSalary(sample, 50000));
        assertEquals(set("Finance", "Legal"), exercises.p69DepartmentsAllAboveSalary(sample, 60000));
        assertEquals(Collections.emptySet(), exercises.p69DepartmentsAllAboveSalary(sample, 150000));
        assertEquals(Collections.emptySet(), exercises.p69DepartmentsAllAboveSalary(empty, 0));
    }

    @Test
    void problem70() {
        assertEquals(set("IT", "Finance"), exercises.p70DepartmentsAnyAboveSalary(sample, 110000));
        assertEquals(set("Finance"), exercises.p70DepartmentsAnyAboveSalary(sample, 120000));
        assertEquals(Collections.emptySet(), exercises.p70DepartmentsAnyAboveSalary(sample, 150000));
        assertEquals(Collections.emptySet(), exercises.p70DepartmentsAnyAboveSalary(empty, 0));
    }

    @Test
    void problem71() {
        assertDoubleMap(map("IT", 80000.0, "HR", 20000.0, "Finance", 60000.0,
                "Sales", 20000.0, "Legal", 15000.0), exercises.p71SalarySpreadByDepartment(sample));
        assertDoubleMap(map("IT", 0.0), exercises.p71SalarySpreadByDepartment(employees(2, 3)));
        assertEquals(Collections.emptyMap(), exercises.p71SalarySpreadByDepartment(empty));
    }

    @Test
    void problem72() {
        assertEquals(map("IT", employee(1), "HR", employee(4), "Finance", employee(8),
                "Sales", employee(10), "Legal", employee(14)),
                exercises.p72ClosestToAverageByDepartment(sample));
        assertEquals(map("IT", employee(1)),
                exercises.p72ClosestToAverageByDepartment(employees(2, 1)));
        assertEquals(Collections.emptyMap(), exercises.p72ClosestToAverageByDepartment(empty));
    }

    @Test
    void problem73() {
        assertEquals(map("IT", new AgeExtremes(employee(13), employee(2)),
                "HR", new AgeExtremes(employee(6), employee(4)),
                "Finance", new AgeExtremes(employee(8), employee(7)),
                "Sales", new AgeExtremes(employee(12), employee(11)),
                "Legal", new AgeExtremes(employee(16), employee(14))),
                exercises.p73AgeExtremesByDepartment(sample));
        assertEquals(map("Legal", new AgeExtremes(employee(14), employee(14))),
                exercises.p73AgeExtremesByDepartment(employees(15, 14)));
        assertEquals(Collections.emptyMap(), exercises.p73AgeExtremesByDepartment(empty));
    }

    @Test
    void problem74() {
        assertEquals(map("IT", employee(13), "HR", employee(6), "Finance", employee(8),
                "Sales", employee(12), "Legal", employee(16)),
                exercises.p74LatestJoinerByDepartment(sample));
        assertEquals(map("Legal", employee(14)),
                exercises.p74LatestJoinerByDepartment(employees(15, 14)));
        assertEquals(Collections.emptyMap(), exercises.p74LatestJoinerByDepartment(empty));
    }

    @Test
    void problem75() {
        assertEquals(map("IT", employee(2), "HR", employee(4), "Finance", employee(7),
                "Sales", employee(11), "Legal", employee(14)),
                exercises.p75EarliestJoinerByDepartment(sample));
        assertEquals(map("Legal", employee(14)),
                exercises.p75EarliestJoinerByDepartment(employees(15, 14)));
        assertEquals(Collections.emptyMap(), exercises.p75EarliestJoinerByDepartment(empty));
    }

    @Test
    void problem76() {
        assertEquals(Optional.of(150000.0), exercises.p76NthHighestDistinctSalary(sample, 1));
        assertEquals(Optional.of(110000.0), exercises.p76NthHighestDistinctSalary(sample, 3));
        assertEquals(Optional.of(40000.0), exercises.p76NthHighestDistinctSalary(sample, 11));
        assertEquals(Optional.empty(), exercises.p76NthHighestDistinctSalary(sample, 12));
        assertEquals(Optional.empty(), exercises.p76NthHighestDistinctSalary(empty, 1));
        assertThrows(IllegalArgumentException.class, () -> exercises.p76NthHighestDistinctSalary(sample, 0));
        assertThrows(IllegalArgumentException.class, () -> exercises.p76NthHighestDistinctSalary(empty, -1));
    }

    @Test
    void problem77() {
        assertEquals(employees(2, 3), exercises.p77EmployeesAtNthHighestSalary(sample, 2));
        assertEquals(employees(14, 15), exercises.p77EmployeesAtNthHighestSalary(sample, 3));
        assertEquals(employees(3, 2), exercises.p77EmployeesAtNthHighestSalary(employees(3, 2, 1), 1));
        assertEquals(Collections.emptyList(), exercises.p77EmployeesAtNthHighestSalary(sample, 12));
        assertEquals(Collections.emptyList(), exercises.p77EmployeesAtNthHighestSalary(empty, 1));
        assertThrows(IllegalArgumentException.class, () -> exercises.p77EmployeesAtNthHighestSalary(sample, 0));
        assertThrows(IllegalArgumentException.class, () -> exercises.p77EmployeesAtNthHighestSalary(empty, -1));
    }

    @Test
    void problem78() {
        assertEquals(set(2, 7), exercises.p78DuplicateIds(
                Collections.unmodifiableList(SampleEmployees.withDuplicateIds())));
        assertEquals(Collections.emptySet(), exercises.p78DuplicateIds(sample));
        assertEquals(Collections.emptySet(), exercises.p78DuplicateIds(empty));
    }

    @Test
    void problem79() {
        assertEquals(map("0-50K", employees(13),
                "50K-100K", employees(4, 5, 6, 8, 9, 10, 11, 12, 16),
                "100K+", employees(1, 2, 3, 7, 14, 15)), exercises.p79GroupBySalaryRange(sample));
        Employee zero = fixture(20, "Zero", "IT", 0, 25, "Male", "Pune", 2020);
        assertEquals(map("0-50K", fixed(zero)), exercises.p79GroupBySalaryRange(fixed(zero)));
        assertEquals(Collections.emptyMap(), exercises.p79GroupBySalaryRange(empty));
    }

    @Test
    void problem80() {
        assertDoubleMap(map("IT", 110000.0, "HR", 80000.0, "Finance", 90000.0,
                "Sales", 50000.0, "Legal", 110000.0), exercises.p80MedianSalaryByDepartment(sample));
        Employee a = fixture(20, "A", "IT", 10, 25, "Male", "Pune", 2020);
        Employee b = fixture(21, "B", "IT", 10, 25, "Male", "Pune", 2020);
        Employee c = fixture(22, "C", "IT", 30, 25, "Male", "Pune", 2020);
        Employee d = fixture(23, "D", "IT", 40, 25, "Male", "Pune", 2020);
        assertDoubleMap(map("IT", 20.0), exercises.p80MedianSalaryByDepartment(fixed(d, a, c, b)));
        assertDoubleMap(map("IT", 100000.0), exercises.p80MedianSalaryByDepartment(employees(1)));
        assertEquals(Collections.emptyMap(), exercises.p80MedianSalaryByDepartment(empty));
    }

    @Test
    void problem81() {
        assertEquals(set(120000.0, 80000.0, 90000.0, 50000.0, 110000.0),
                exercises.p81MostFrequentSalaries(sample));
        assertEquals(set(100000.0, 80000.0), exercises.p81MostFrequentSalaries(employees(1, 4)));
        assertEquals(set(120000.0), exercises.p81MostFrequentSalaries(employees(1, 2, 3)));
        assertEquals(Collections.emptySet(), exercises.p81MostFrequentSalaries(empty));
    }

    @Test
    void problem82() {
        assertEquals(map(120000.0, employees(2, 3), 80000.0, employees(4, 6),
                90000.0, employees(8, 9), 50000.0, employees(10, 12),
                110000.0, employees(14, 15)), exercises.p82EmployeesSharingSalary(sample));
        assertEquals(map(120000.0, employees(3, 2)),
                exercises.p82EmployeesSharingSalary(employees(3, 1, 2)));
        assertEquals(Collections.emptyMap(), exercises.p82EmployeesSharingSalary(employees(1, 4, 7)));
        assertEquals(Collections.emptyMap(), exercises.p82EmployeesSharingSalary(empty));
    }

    @Test
    void problem83() {
        assertEquals(map("IT", map(100000.0, 1L, 120000.0, 2L, 40000.0, 1L),
                "HR", map(80000.0, 2L, 60000.0, 1L), "Finance", map(150000.0, 1L, 90000.0, 2L),
                "Sales", map(50000.0, 2L, 70000.0, 1L), "Legal", map(110000.0, 2L, 95000.0, 1L)),
                exercises.p83SalaryFrequencyByDepartment(sample));
        assertEquals(Collections.emptyMap(), exercises.p83SalaryFrequencyByDepartment(empty));
    }

    @Test
    void problem84() {
        assertEquals(Optional.of(employee(7)), exercises.p84HighestPaidOverall(sample));
        assertEquals(Optional.of(employee(2)), exercises.p84HighestPaidOverall(employees(3, 2)));
        assertEquals(Optional.empty(), exercises.p84HighestPaidOverall(empty));
    }

    @Test
    void problem85() {
        assertEquals(Optional.of(employee(13)), exercises.p85LowestPaidOverall(sample));
        assertEquals(Optional.of(employee(10)), exercises.p85LowestPaidOverall(employees(12, 10)));
        assertEquals(Optional.empty(), exercises.p85LowestPaidOverall(empty));
    }

    @Test
    void problem86() {
        assertEquals(employees(2, 4, 7, 9, 11, 14, 15), exercises.p86JoinedBeforeAverageYear(sample));
        assertEquals(employees(1), exercises.p86JoinedBeforeAverageYear(employees(1, 8)));
        assertEquals(Collections.emptyList(), exercises.p86JoinedBeforeAverageYear(employees(14, 15)));
        assertEquals(Collections.emptyList(), exercises.p86JoinedBeforeAverageYear(empty));
    }

    @Test
    void problem87() {
        assertEquals(138L, exercises.p87TotalExperience(sample, 2026));
        assertEquals(106L, exercises.p87TotalExperience(sample, 2024));
        assertEquals(0L, exercises.p87TotalExperience(employees(12, 13), 2024));
        assertEquals(0L, exercises.p87TotalExperience(empty, 2026));
        Employee a = fixture(20, "A", "IT", 100, 25, "Male", "Pune", 1);
        Employee b = fixture(21, "B", "IT", 100, 25, "Male", "Pune", 1);
        assertEquals(4294967292L, exercises.p87TotalExperience(fixed(a, b), Integer.MAX_VALUE));
    }

    @Test
    void problem88() {
        assertEquals(set(2012, 2020, 2024), exercises.p88MostCommonJoiningYears(sample));
        assertEquals(set(2018, 2015), exercises.p88MostCommonJoiningYears(employees(1, 2)));
        assertEquals(set(2012), exercises.p88MostCommonJoiningYears(employees(1, 14, 15)));
        assertEquals(Collections.emptySet(), exercises.p88MostCommonJoiningYears(empty));
    }

    @Test
    void problem89() {
        assertEquals(map(2000, employees(7), 2010, employees(1, 2, 4, 8, 9, 11, 14, 15),
                2020, employees(3, 5, 6, 10, 12, 13, 16)), exercises.p89GroupByJoiningDecade(sample));
        assertEquals(map(2020, employees(16, 3)), exercises.p89GroupByJoiningDecade(employees(16, 3)));
        assertEquals(Collections.emptyMap(), exercises.p89GroupByJoiningDecade(empty));
    }

    @Test
    void problem90() {
        Map<String, DoubleSummaryStatistics> actual = exercises.p90SalarySummaryByDepartment(sample);
        assertEquals(set("IT", "HR", "Finance", "Sales", "Legal"), actual.keySet());
        assertSummary(actual.get("IT"), 4, 40000, 120000, 380000, 95000);
        assertSummary(actual.get("HR"), 3, 60000, 80000, 220000, 220000.0 / 3);
        assertSummary(actual.get("Finance"), 3, 90000, 150000, 330000, 110000);
        assertSummary(actual.get("Sales"), 3, 50000, 70000, 170000, 170000.0 / 3);
        assertSummary(actual.get("Legal"), 3, 95000, 110000, 315000, 105000);
        assertEquals(Collections.emptyMap(), exercises.p90SalarySummaryByDepartment(empty));
    }

    private Employee employee(int id) {
        return sample.get(id - 1);
    }

    /** IDs explicitly list the expected employees in the expected order. */
    private List<Employee> employees(int... ids) {
        List<Employee> result = new ArrayList<Employee>();
        for (int id : ids) result.add(employee(id));
        return Collections.unmodifiableList(result);
    }

    private static Employee fixture(int id, String name, String department, double salary,
                                    int age, String gender, String city, int year) {
        return new Employee(id, name, department, salary, age, gender, city, year);
    }

    private static List<Employee> fixed(Employee... employees) {
        return Collections.unmodifiableList(Arrays.asList(employees));
    }

    @SafeVarargs
    private static <T> Set<T> set(T... values) {
        return new HashSet<T>(Arrays.asList(values));
    }

    /** Only builds literal expected maps; contains no exercise-solving logic. */
    @SuppressWarnings("unchecked")
    private static <K, V> Map<K, V> map(Object... entries) {
        if (entries.length % 2 != 0) throw new IllegalArgumentException("Expected key/value pairs");
        Map<K, V> result = new HashMap<K, V>();
        for (int i = 0; i < entries.length; i += 2) {
            result.put((K) entries[i], (V) entries[i + 1]);
        }
        return result;
    }

    private static void assertDoubleMap(Map<String, Double> expected, Map<String, Double> actual) {
        assertNotNull(actual);
        assertEquals(expected.keySet(), actual.keySet());
        for (String key : expected.keySet()) {
            assertNotNull(actual.get(key), key);
            assertEquals(expected.get(key), actual.get(key), 0.000001, key);
        }
    }

    private static void assertSummary(DoubleSummaryStatistics actual, long count,
                                      double min, double max, double sum, double average) {
        assertNotNull(actual);
        assertEquals(count, actual.getCount());
        assertEquals(min, actual.getMin(), 0.000001);
        assertEquals(max, actual.getMax(), 0.000001);
        assertEquals(sum, actual.getSum(), 0.000001);
        assertEquals(average, actual.getAverage(), 0.000001);
    }
}
