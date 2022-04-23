package org.grc.test;

public class Employee {
private void empName() {
System.out.println("Employee name is prad");
<<<<<<< HEAD
System.out.println("Employee salary is 75000");
=======
System.out.println("Employee salary is 50000");
>>>>>>> 956318f55766b78a4b29e6e531e107c568a0fb2c
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
