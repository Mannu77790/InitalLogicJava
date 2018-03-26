package com.mm.model;

import java.util.Comparator;

public class Fruits implements Comparable<Fruits> {
	String name;
	String description;
	int quantity;
	
	public Fruits() {

	}
	
	public Fruits(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Fruits [name=" + name + ", description=" + description + ", quantity=" + quantity + "]";
	}
	@Override
	public int compareTo(Fruits o) {
		// TODO Auto-generated method stub
		int newQuanity = ((Fruits) o).getQuantity(); 
		return this.quantity-newQuanity;
	}
	
	public static Comparator<Fruits> FruitNameComparator = new Comparator<Fruits>() {

		@Override
		public int compare(Fruits arg0, Fruits arg1) {
			// TODO Auto-generated method stub
			String s1 = arg0.getName();
			String s2 = arg1.getName();
			
			return s1.compareTo(s2);
		}
		
	};
}
