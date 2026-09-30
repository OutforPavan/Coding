package practice.streams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/** These checks pass before you implement any stream solutions. */
class PracticeSetupTest {
    @Test
    void sampleDataIsReadyForPractice() {
        List<Employee> employees = SampleEmployees.all();
        assertEquals(16, employees.size());
        Set<Integer> ids = new HashSet<Integer>();
        Set<String> departments = new HashSet<String>();
        for (Employee employee : employees) {
            assertTrue(ids.add(employee.getId()), "Main fixture IDs must be unique");
            departments.add(employee.getDepartment());
        }
        assertEquals(5, departments.size());
    }

    @Test
    void fixturesAreIndependent() {
        List<Employee> first = SampleEmployees.all();
        first.clear();
        assertEquals(16, SampleEmployees.all().size());
    }

    @Test
    void duplicateIdFixtureHasExpectedCollisions() {
        List<Employee> employees = SampleEmployees.withDuplicateIds();
        Set<Integer> seen = new HashSet<Integer>();
        Set<Integer> duplicates = new HashSet<Integer>();
        for (Employee employee : employees) {
            if (!seen.add(employee.getId())) duplicates.add(employee.getId());
        }
        assertEquals(new HashSet<Integer>(java.util.Arrays.asList(2, 7)), duplicates);
        assertEquals(18, employees.size());
    }
}
