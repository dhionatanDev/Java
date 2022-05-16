package aplication;

import java.util.Scanner;

import entites.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double incleaseSalary;
		
		Scanner lerTeclado = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("Name, salario Bruto, imposto");
		employee.name = lerTeclado.next();
		employee.grossSalary = lerTeclado.nextDouble();
		employee.tax = lerTeclado.nextDouble();
		
		System.out.println("Name: " + employee.name);
		System.out.println("Gross salary: " + employee.grossSalary);
		System.out.println("Tax: " + employee.tax);
		System.out.println();
		System.out.printf("Employee: " + employee);
		System.out.println();
		System.out.println("Which percentage to increse salary ? ");
		incleaseSalary = lerTeclado.nextDouble();
		employee.incleaseSalary(incleaseSalary);
		System.out.printf("Update data: "+ employee);
		
		lerTeclado.close();
		
	}

}
