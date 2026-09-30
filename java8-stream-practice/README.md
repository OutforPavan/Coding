# Java 8 Employee Streams Practice

90 exercises matching the numbered list from your interview practice conversation.
All solution methods are intentionally unfinished. Write your stream expressions in
`src/main/java/practice/streams/EmployeeStreamExercises.java`.

## Start here

Open the parent `/Users/pavtiwar/Coding` folder as a Gradle project in IntelliJ IDEA.
The practice folder is included as the `java8-stream-practice` module. After changing
Gradle settings, use **Reload All Gradle Projects** so IntelliJ recognizes its source
and test folders and resolves Java APIs. You can also open the practice folder directly.
Use JDK 17 for Gradle (already installed on this machine). Both production code and
tests compile with `--release 8`, which rejects APIs added after Java 8.

1. Open `Employee.java` to inspect the eight fields and getters.
2. Open `SampleEmployees.java` to inspect the sample records.
3. Implement one method in `EmployeeStreamExercises.java`.
4. Run that problem's test using the gutter arrow in IntelliJ or a command below.
5. Repeat with the next problem.

No exercise solutions are included. The tests contain expected answers.

## Run one exercise

This practice module reuses the Gradle wrapper in the parent Coding folder.
Run these commands from the practice folder:

```sh
cd /Users/pavtiwar/Coding/java8-stream-practice
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home
export PATH="$JAVA_HOME/bin:/usr/bin:/bin:$PATH"

# Confirm the project and sample data are ready (does not run unfinished exercises).
../gradlew test --tests 'practice.streams.PracticeSetupTest'

# Problem 1: highest-paid employee in each department.
../gradlew test --tests 'practice.streams.EmployeeStreams01To45Test.problem01'

# Problem 18: second-highest distinct salary in each department.
../gradlew test --tests 'practice.streams.EmployeeStreams01To45Test.problem18'

# Problem 76: nth-highest distinct salary.
../gradlew test --tests 'practice.streams.EmployeeStreams46To90Test.problem76'
```

Use `problem01` through `problem45` in `EmployeeStreams01To45Test`,
and `problem46` through `problem90` in `EmployeeStreams46To90Test`.
Use `--rerun-tasks` if you want to force a fresh run without changing code.

```sh
# Compile all source and tests without running unfinished exercises.
../gradlew testClasses

# Run everything after implementing the exercises.
../gradlew test
```

The first run may download Gradle or test dependencies if they are not cached.
The HTML results are saved at `build/reports/tests/test/index.html`.
The commands above run from the practice folder and do not compile the parent's exercises.
From `/Users/pavtiwar/Coding`, you can also run an individual practice test with:

```sh
./gradlew :java8-stream-practice:test --tests 'practice.streams.EmployeeStreams01To45Test.problem01'
```

To compile and package both projects without running unfinished exercises, run
`./gradlew assemble testClasses` from the parent folder. A full `./gradlew build`
also runs all exercise tests, so it fails until you implement the corresponding solutions.

`java.util`, `java.util.stream`, and `java.util.function` are part of the JDK;
they do not require extra dependencies. Java package wildcard imports do not include
subpackages, so the exercise class imports all three explicitly.

## What to expect before implementing a problem

Each unfinished method throws `UnsupportedOperationException("TODO: implement problem NN")`.
Its test will fail with that message until you replace the stub.
Tests are not disabled or marked as passing for incomplete work.
A passing test validates the included cases, not every possible input.

## Data and contracts

`Employee` is immutable and has these fields:

| Field | Type |
| --- | --- |
| id | int |
| name | String |
| department | String |
| salary | double |
| age | int |
| gender | String |
| city | String |
| yearOfJoining | int |

`SampleEmployees.all()` returns a fresh list of 16 employees across IT, HR, Finance,
Sales and Legal. It contains repeated names, salary ties, age ties, palindromic names,
an employee younger than 18, salaries on the bucket boundaries, and cities shared
across departments. IDs are unique in the main fixture.
`SampleEmployees.withDuplicateIds()` supplies a separate duplicate-ID fixture.

`AgeExtremes` is the result class for problem 73, with `getYoungest()` and
`getOldest()`. No extra domain classes are needed for the other exercises.

Follow these common rules (individual method comments add any exceptions):

- Inputs, employees and fields are non-null; names are nonempty.
- Salaries are finite and nonnegative. Doubles keep the practice focused on streams.
- Do not mutate the supplied list or employee data.
- Filtered and grouped lists keep input encounter order unless sorting is requested.
- A single employee selected from a tie uses the smallest ID.
- Salary/name sorting uses ID ascending to break ties.
- A tied winning department is selected alphabetically.
- Map and set iteration order does not matter.
- Empty inputs yield empty collections/Optionals, zero counts/sums, or an empty joined string.
- Partition results always contain both `true` and `false`, even for empty input.
- nth salary means nth **distinct** salary; n starts at 1.
- A name comparison is case-sensitive unless the problem says otherwise.
- Years are explicit parameters where needed, so tests do not depend on today's date.

Problems 45–49 intentionally repeat earlier collector patterns.
Problem 55 counts the salary partitions. Problem 67 means a city must appear in
every department present. Problems 81 and 88 return all tied modes.

## Exercise checklist

| Problem | Method | Requirement |
| --- | --- | --- |
| 01 | `p01HighestPaidByDepartment` | Highest-paid employee in each department. |
| 02 | `p02LowestPaidByDepartment` | Lowest-paid employee in each department. |
| 03 | `p03HighestSalaryByDepartment` | Highest salary value in each department. |
| 04 | `p04AverageSalaryByDepartment` | Average salary in each department. |
| 05 | `p05TotalSalaryByDepartment` | Total salary in each department. |
| 06 | `p06EmployeeCountByDepartment` | Count employees in each department. |
| 07 | `p07GroupByDepartment` | Group employees by department; retain encounter order inside each list. |
| 08 | `p08GroupByGender` | Group employees by gender; retain encounter order inside each list. |
| 09 | `p09CountByGender` | Count employees by gender. |
| 10 | `p10AverageAgeByGender` | Average age by gender. |
| 11 | `p11HighestSalaryByGender` | Highest salary by gender. |
| 12 | `p12DepartmentsWithMoreThan` | Departments with strictly more than count employees. |
| 13 | `p13DepartmentsAboveAverageSalary` | Departments whose average salary is strictly above threshold. |
| 14 | `p14DepartmentWithHighestTotalSalary` | Department with highest total salary; break ties by department name alphabetically. |
| 15 | `p15DepartmentWithMostEmployees` | Department with most employees; break ties alphabetically. |
| 16 | `p16DepartmentWithHighestAverageSalary` | Department with highest average salary; break ties alphabetically. |
| 17 | `p17EmployeesAboveDepartmentAverage` | Employees earning strictly above their own department average; retain encounter order. |
| 18 | `p18SecondHighestSalaryByDepartment` | Second-highest DISTINCT salary by department; Optional.empty() if a department has fewer than two distinct salaries. |
| 19 | `p19TopThreePaidByDepartment` | Up to three employees per department, salary descending then ID ascending; ties occupy separate positions. |
| 20 | `p20AllHighestPaidByDepartment` | ALL employees tied for maximum salary in each department; retain encounter order. |
| 21 | `p21SortSalaryAscending` | Sort salary ascending, then ID ascending. |
| 22 | `p22SortSalaryDescending` | Sort salary descending, then ID ascending. |
| 23 | `p23SortDepartmentThenSalary` | Sort department alphabetically, then salary descending, then ID ascending. |
| 24 | `p24SortByName` | Sort name alphabetically (case-sensitive), then ID ascending. |
| 25 | `p25TopFivePaid` | Up to five employees, salary descending then ID ascending. |
| 26 | `p26BottomThreePaid` | Up to three employees, salary ascending then ID ascending. |
| 27 | `p27SalaryAbove` | Employees with salary strictly above threshold; retain encounter order. |
| 28 | `p28SalaryBetween` | Employees within the inclusive salary range; retain encounter order. |
| 29 | `p29OlderThan` | Employees strictly older than age; retain encounter order. |
| 30 | `p30JoinedAfter` | Employees joining strictly after year; retain encounter order. |
| 31 | `p31JoinedIn` | Employees joining in year; retain encounter order. |
| 32 | `p32InDepartmentAndCity` | Employees matching both department and city exactly; retain encounter order. |
| 33 | `p33YoungestEmployee` | Youngest employee. |
| 34 | `p34OldestEmployee` | Oldest employee. |
| 35 | `p35SecondYoungestEmployee` | Employee at the second-lowest DISTINCT age; use smallest ID if tied. Empty if fewer than two distinct ages. |
| 36 | `p36EmployeeWithLongestName` | Employee with longest name. |
| 37 | `p37NameStartsWith` | Employees whose names start with prefix (case-sensitive); retain encounter order. |
| 38 | `p38NameContains` | Employees whose names contain text (case-sensitive); retain encounter order. |
| 39 | `p39DistinctDepartments` | Distinct department names. |
| 40 | `p40DistinctCities` | Distinct cities. |
| 41 | `p41DistinctNames` | Distinct employee names. |
| 42 | `p42CountDistinctDepartments` | Count distinct departments. |
| 43 | `p43EmployeeById` | Map unique IDs to employees. Throw IllegalStateException if an ID is duplicated. |
| 44 | `p44SalaryByName` | Map names to salaries, keeping the first encountered salary for duplicate names. |
| 45 | `p45DepartmentCountMap` | Map department to count; intentional collector revision of problem 6. |
| 46 | `p46DepartmentAverageMap` | Map department to average salary; intentional collector revision of problem 4. |
| 47 | `p47DepartmentHighestPaidMap` | Map department to highest-paid employee; revision of problem 1. |
| 48 | `p48MergeDuplicateNames` | Map name to employee; for duplicates keep the higher salary, then smaller ID. |
| 49 | `p49DepartmentEmployeeLists` | Map department to employee list; revision of problem 7. |
| 50 | `p50DepartmentNameSets` | Map department to distinct employee names. |
| 51 | `p51PartitionBySalary` | Partition by salary strictly above threshold. Always include true and false keys. |
| 52 | `p52PartitionAdults` | Partition by age >= 18. Always include true and false keys. |
| 53 | `p53PartitionByExperience` | Partition by currentYear - yearOfJoining >= minimumYears. Always include both keys; currentYear is not earlier than any joining year. |
| 54 | `p54PartitionIT` | Partition by exact department IT. Always include both keys. |
| 55 | `p55CountSalaryPartitions` | Count each salary > threshold partition. Always include both keys, including zero counts. |
| 56 | `p56DuplicateNames` | Names occurring more than once. |
| 57 | `p57UniqueNames` | Names occurring exactly once. |
| 58 | `p58NameFrequency` | Frequency of every name. |
| 59 | `p59NamesSortedByLength` | Names sorted by length ascending, then alphabetically; retain duplicates. |
| 60 | `p60FirstNameWithRepeatedCharacter` | First encountered name containing a repeated character, ignoring case using Locale.ROOT. |
| 61 | `p61PalindromicNames` | Employees with palindromic names, ignoring case using Locale.ROOT; retain encounter order. |
| 62 | `p62GroupByNameInitial` | Group by case-sensitive first character; names are nonempty; retain encounter order. |
| 63 | `p63LongestNameByDepartment` | Employee with longest name in each department. |
| 64 | `p64JoinNames` | Join all names with comma only (no spaces); retain encounter order and duplicates. |
| 65 | `p65JoinNamesByDepartment` | Join names per department with comma only; retain encounter order and duplicates. |
| 66 | `p66EmployeesInLargeDepartments` | Employees whose department has at least minimumCount employees; retain encounter order. |
| 67 | `p67CitiesCommonToAllDepartments` | Cities represented in EVERY department present in the input. Empty input returns empty set. |
| 68 | `p68DepartmentsWithBothGenders` | Departments containing at least one Male and at least one Female employee (exact strings). |
| 69 | `p69DepartmentsAllAboveSalary` | Present departments where every salary is strictly above threshold. |
| 70 | `p70DepartmentsAnyAboveSalary` | Present departments where at least one salary is strictly above threshold. |
| 71 | `p71SalarySpreadByDepartment` | Maximum minus minimum salary in each department. |
| 72 | `p72ClosestToAverageByDepartment` | Employee whose salary is closest to their department average; use smallest ID for equal absolute distance. |
| 73 | `p73AgeExtremesByDepartment` | Youngest and oldest employee in each department; AgeExtremes has getYoungest() and getOldest(). |
| 74 | `p74LatestJoinerByDepartment` | Employee with greatest joining year in each department. |
| 75 | `p75EarliestJoinerByDepartment` | Employee with smallest joining year in each department. |
| 76 | `p76NthHighestDistinctSalary` | Nth-highest DISTINCT salary, n is one-based. Empty if unavailable; throw IllegalArgumentException for n <= 0. |
| 77 | `p77EmployeesAtNthHighestSalary` | All employees at nth-highest DISTINCT salary, encounter order. Empty if unavailable; throw IllegalArgumentException for n <= 0. |
| 78 | `p78DuplicateIds` | IDs occurring more than once. Test with SampleEmployees.withDuplicateIds(). |
| 79 | `p79GroupBySalaryRange` | Group nonnegative salaries into [0,50000), [50000,100000), [100000,+infinity), labeled 0-50K, 50K-100K, 100K+. Only include populated buckets; retain encounter order. |
| 80 | `p80MedianSalaryByDepartment` | Median salary per department, retaining duplicate values. Even-sized groups use mean of the two middle salaries. |
| 81 | `p81MostFrequentSalaries` | ALL salary values tied for highest frequency (the modes). Empty input returns empty set. |
| 82 | `p82EmployeesSharingSalary` | Group by salary, keeping only groups of at least two employees; retain encounter order. |
| 83 | `p83SalaryFrequencyByDepartment` | Nested map: department -> salary -> count. |
| 84 | `p84HighestPaidOverall` | Highest-paid employee overall; department is available through its getter. |
| 85 | `p85LowestPaidOverall` | Lowest-paid employee overall. |
| 86 | `p86JoinedBeforeAverageYear` | Employees joining strictly before the arithmetic mean of joining years; retain encounter order. |
| 87 | `p87TotalExperience` | Sum currentYear - yearOfJoining as a long. currentYear is not earlier than any joining year. |
| 88 | `p88MostCommonJoiningYears` | ALL joining years tied for highest frequency. Empty input returns empty set. |
| 89 | `p89GroupByJoiningDecade` | Group by decade start (e.g. 2018 -> 2010); joining years are positive; retain encounter order. |
| 90 | `p90SalarySummaryByDepartment` | Department salary count, minimum, maximum, sum, average using DoubleSummaryStatistics. |

Keep your implementations within Java 8: avoid `List.of`, `Map.of`, `Stream.toList`,
`takeWhile`, records, and newer collectors. Java 8 alternatives include
`Arrays.asList` and `collect(Collectors.toList())`.
