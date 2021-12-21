package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<>();	
		
		System.out.print("How many employees will be regitered?");
		int n = sc.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Employee #%d\n", i+1);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee employee = new Employee(id, name, salary);
			list.add(employee);		
		}
		
		System.out.println();
		System.out.println("\nEnter the employee id that will have salary increase: ");
		int idIncreased = sc.nextInt();
		Integer position = position(list, idIncreased);
		if(position == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(position).salatyIncrease(percentage);
		}
		
		System.out.println();
		System.out.println("Employee list: ");
		for(Employee employee : list) {
			System.out.println(employee);
		}
	
		sc.close();
	}
	
	public static Integer position (List<Employee> list, int id) {
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getId() == id) {
					return i;    
				}
			}
		return null;
	}
	
}
