package com.collection.examples.CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ComparatorComparableExample {

	public static void main(String[] args) {
		HashSet<Employee> employee= new HashSet<Employee>();
		employee.add(new Employee(1,"Priya"));
		employee.add(new Employee(3,"Krishna"));
		employee.add(new Employee(5,"Anurag"));
		System.out.println(employee);
		List<Employee> listEmp=new ArrayList<Employee>(employee);
		System.out.println(listEmp);
		Collections.sort(listEmp, new EmployeeComparator());
		System.out.println(listEmp);
		Collections.sort(listEmp);
		System.out.println(listEmp);
	}

}


class EmployeeComparator implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getEmployeeId()>o2.getEmployeeId()) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
	
}
class Employee implements Comparable<Employee>{
	
private	int employeeId;
private	String name;

public Employee(int employeeId, String name) {

	this.employeeId = employeeId;
	this.name = name;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
}
@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
int result=this.name.compareTo(o.name); 
return result;
}

}
