package org.grc.test;

public class Employee {
private void empName() {
System.out.println("Employee name is prad");
}
private void empId() {
	System.out.println("Employee Id is 500");

}
private void empAge() {
	System.out.println("Employee age is 20");
}
public static void main(String[] args) {
	Employee e = new Employee ();
	e.empName();
	e.empId();
	e.empAge();
 }
}
