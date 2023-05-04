package project;

import java.util.ArrayList;
import java.util.Scanner;


public class mainclass {
	
	static void menu() {
		System.out.println("1-Add Stock");
		System.out.println("2-view Stock");
		System.out.println("3-Search Stock");
		System.out.println("4-Edit Stock");
		System.out.println("5-Delete Stock");
		System.out.println("0-Exit");
		
	}
	
	public static void main(String[]args) {
		int opt;
		Scanner sc = new Scanner(System.in);
		ArrayList<shop> shopList = new ArrayList<shop>();
		do {
			shop s =new shop();
			menu();
			opt = sc.nextInt();
			switch (opt) {
			case 0:
				System.out.println("Exiting Inventory Management System...");
				
				System.exit(0);
			
			case 1:
				System.out.println("Enter Product ID");
				s.setId(sc.nextInt());
				System.out.println("Enter Product Name");
				sc = new Scanner(System.in);
				s.setName(sc.next());
				System.out.println("Enter Product Price");
				s.setPrice(sc.nextInt());
				System.out.println("Enter Product Quantity");
				s.setQuantity(sc.nextInt());
				System.out.println("Enter Product Company");
				s.setCompany(sc.next());
				
			
				break;
			case 2:
				s.viewstock();
				
				break;
			case 3:
				
				s.searchstock();
				
				break;
			case 4:
				s.deletestock();
				
				break;
			case 5:
				s.deletestock();
				break;
				
			default:
			
				break;
			}
	
		}while (opt != 0);
			
	}

}