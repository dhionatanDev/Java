package aplication;

import java.util.Scanner;

import entites.Product;

public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quantity;
		
		Scanner lerTeclado = new Scanner(System.in);
		
		Product product = new Product();
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = lerTeclado.nextLine();
		
		System.out.print("Price: ");
		product.price = lerTeclado.nextDouble();
		
		System.out.print("Quantity in stock:  ");
		product.quantity = lerTeclado.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = lerTeclado.nextInt();
		product.addProducts(quantity);
		System.out.println("Update data: " + product);
		System.out.println();
		
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = lerTeclado.nextInt();
		product.removeProducts(quantity);
		System.out.println("Update data: " + product);
		
		
		lerTeclado.close();
	}

}
