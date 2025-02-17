package day4;

public class Employee implements Comparable{
	private int id;
	private String empName;
	private char gender;
	private double salary;
	
	public Employee(int id, String empName, char gender, double salary) {
		this.id = id;
		this.empName = empName;
		this.gender = gender;
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", gender=" + gender + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Object emp) {
		Employee e = (Employee)emp;
		return this.empName.compareToIgnoreCase(e.empName);
	}
}
