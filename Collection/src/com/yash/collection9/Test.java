package com.yash.collection9;

import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Employee> empList = new CopyOnWriteArrayList<>();
		Employee employee1 = new Employee(01, "monika", 6000, "dev", "pune");
		Employee employee2 = new Employee(02, "asmita", 3000, "dev", "solapur");
		Employee employee3 = new Employee(03, "pooja", 4000, "dev", "pune");

		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		for (Employee employee : empList) {
			int objectElement = employee.getEid();
			int index = objectElement % 10;
			empList.add(index, employee);
		}
		empList.forEach(System.out::println);
	}

}
