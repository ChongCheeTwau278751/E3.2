package Exe3_2;

import java.util.Scanner;

public class Boat {

	 private String type;
	 private String brand;
	 private int price;
	 private int quantity;
	 
	 Scanner in = new Scanner(System.in);
	 
	 public Boat(){
	     System.out.println("Enter the type\t\t: ");
		 type = in.next();
		 System.out.println("Enter the price\t\t:RM ");
		 price = in.nextInt();
		 System.out.println("Enter the quantity\t: ");
		 quantity = in.nextInt();
		 System.out.println("Enter the brand\t\t: ");
		 brand = in.next();
		    }
	 
	 Boat(String T, int P, int Q, String B){
		 type = T;
		 price = P;
		 quantity = Q;
		 brand = B;
	 }
	 
	 	public String getType(){
			return type;
		}

	    public int getPrice(){
	       return price;
	    }
	    
	    public int getQuantity(){
		    return quantity;
	    }
	    
	    public String getBrand(){
		    return brand;
	    }
	    
	    public int getTotal() {
	       return price*quantity;
	    } 
	    
	    public String toString() {
	    	return "\nType\t = " + type +"\nPrice\t = " + price + "\nQuantity = " + quantity + "\nBrand\t = " + brand;
}
}
