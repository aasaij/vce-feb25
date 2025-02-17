package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList();
		empList.add(new Employee(101, "Gajanan", 'M',200000.0));
		empList.add(new Employee(102, "Ajay", 'M',300000.0));
		empList.add(new Employee(103, "Lakshmanan", 'M',400000.0));
		empList.add(new Employee(104, "Anandhi", 'F',500000.0));
		empList.add(new Employee(105, "Rasmitha", 'F',600000.0));
//		Collections.sort(empList);
		empList.sort(Comparator.
				comparing(Employee :: getEmpName)
				.thenComparingDouble(Employee::getSalary)
				.reversed()
				);
//		System.out.println(empList);
		for (Employee emp : empList) {
			if(emp.getGender()=='F')
				System.out.println(emp);
		}
	}

}
