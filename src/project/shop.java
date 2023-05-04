package project;

import java.util.ArrayList;
import java.util.Scanner;

public class shop {
	private int  id;
	private int price;
	private int quantity;
	private String name;
	private String Company;
	
	
	
	
	
	//functions start
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public void addstock(shop s){
		this.id =s.id ;
		this.name=s.name;
		this.price=s.price;
		this.quantity=s.quantity;
		this.Company=s.Company;
		
		
		
		
	}
	
	public void viewstock() {
		System.out.println("List of all stock:");
        System.out.println("Stock 1");
        System.out.println("Stock 2");
        System.out.println("Stock 3");
		
	}
	
	public void searchstock() {
		System.out.println("Enter the stock name or ID to search for: ");
        Scanner input = new Scanner(System.in);
        String stockNameOrId = input.nextLine();
        System.out.println("Results for stock \"" + stockNameOrId + "\":");
        System.out.println("Stock 1");
        System.out.println("Stock 2");
	}
	
	public void editstock() {
		System.out.println("Enter the ID of the stock item to edit: ");
        Scanner input = new Scanner(System.in);
        String stockId = input.nextLine();
        System.out.println("Editing stock item with ID " + stockId + "...");
		
		System.out.println("Product updated successfully.");
		
	}
	
	public void deletestock() {
		System.out.println("Enter the ID of the stock item to delete: ");
        Scanner input = new Scanner(System.in);
        String stockId = input.nextLine();
        System.out.println("Deleting stock item with ID " + stockId + "...");
		
		System.out.println("Product deleted successfully.");
		
	}
	
	public void displayitems(ArrayList<shop>arry) {
		for (shop shop : arry) {
			System.out.println("**------------------------------------**");
			System.out.println("Product ID"+shop.id);
			System.out.println("Product Name"+shop.name);
			System.out.println("Product Parice"+shop.price);
			System.out.println("Product Quantity"+shop.quantity);
			System.out.println("Product Company"+shop.Company);
			System.out.println("**------------------------------------**");
			
		}
	}
	
	
	
	
	

}