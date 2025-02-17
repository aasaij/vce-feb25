package day4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList();
		empList.add(new Employee(101, "Gajanan", 'M',2000000.0));
		empList.add(new Employee(102, "Ajay", 'M',300000.0));
		empList.add(new Employee(103, "Lakshmanan", 'M',400000.0));
		empList.add(new Employee(104, "Anandhi", 'F',500000.0));
		empList.add(new Employee(105, "Rasmitha", 'F',600000.0));
		empList.stream()
//			.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
			.sorted()
//			.limit(2)
//			.sorted(Comparator.comparing(Employee::getEmpName))
//			.filter(emp -> emp.getGender()=='F')
			.forEach(emp -> System.out.println(emp));
	}
}

