# Java8

//Terminal operation 

//

List<Employee> employees = getAllEmployees();

// to list
List<String> listOfEmps = employees.stream()
         .limit(3)
         .map(Employee::getName)
         .collect(Collectors.toList());

// to set
Set<String> setOfEmps = employees.stream()
         .limit(3)
         .map(Employee::getName)
         .collect(Collectors.toSet());

// to map
Map<String, Employee> mapOfEmps = employees.stream()
         .limit(3)
         .collect(Collectors.toMap(e -> e.name, e -> e));

// john, amy, marcy
String names = employees.stream()
         .limit(3)
         .map(Employee::getName)
         .collect(Collectors.joining(","));

// group by dept
Map<String, List<Employee>> empByDept 
          = employees.stream()
         .collect(Collectors.groupingBy(e -> e.dept));

// count employees in each dept
Map<String, Long> countByDept 
          = employees.stream()
         .collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));

