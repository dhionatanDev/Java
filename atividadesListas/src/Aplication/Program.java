package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entites.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<Double> list3 = new ArrayList<>();

		Employee funcionario = new Employee(null, null, null);

		System.out.println("How many employees will be registered? \n");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Informe a Id: ");
			funcionario.setId(sc.nextInt());
			list.add(funcionario.getId());

			System.out.println("Informe o nome: ");
			sc.nextLine();
			funcionario.setName(sc.nextLine());
			list2.add(funcionario.getName());

			System.out.println("Informe o salario: ");
			funcionario.setSalary(sc.nextDouble());
			list3.add(funcionario.getSalary());
			System.out.println("Emplyoee #" + (i + 1) + " : \n" + "Id: " + list.get(i) + "\n" + "Name: " + list2.get(i)
					+ "\n" + "Salary: " + list3.get(i) + "\n");

		}

		System.out.println("Enter the employee id that will have salary increase :");
		int buscar = sc.nextInt();
		int local = list.indexOf(buscar);
		if(local >-1) {
		double salario = list3.get(local);
		funcionario.setSalary(salario);
		System.out.println("Enter the percentage: ");
		funcionario.incleaseSalary(sc.nextDouble());
		list3.remove(local);
		list3.add(local, funcionario.getSalary());
				
		int size = list.size();
		System.out.println("List of employees: ");
		for(int i=0; i<size;i++) {
			System.out.println(
					+ list.get(i) + ", "
					+ list2.get(i) + ", "
					+ list3.get(i) );
		}}
		else {
			System.out.println("This id does not exist! ");
			int size = list.size();
			System.out.println("List of employees: ");
			
			for(int i=0; i<size;i++) {
				System.out.println(
						+ list.get(i) + ", "
						+ list2.get(i) + ", "
						+ list3.get(i) );
			}
		}
		
	}

}
