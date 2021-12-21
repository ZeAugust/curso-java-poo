package application;

import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		employee empregado;
		
		empregado = new employee();
		
		System.out.print("Name:");
		empregado.name = sc.nextLine();
		System.out.print("Gross salary: ");
		empregado.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		empregado.tax = sc.nextDouble();
		System.out.println();
		System.out.printf("Employee: "+ empregado.name + ", $" + empregado.netSalary());
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double porcentagem = sc.nextDouble();
		empregado.increaseSalary(porcentagem);
		System.out.println();
		System.out.print("Updated data: " + empregado.name  +", $ " + empregado.netSalary());
		
		
		sc.close();
	}

}
