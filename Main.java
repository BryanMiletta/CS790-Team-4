// Created by Nick Marn, updated to reflect ownership and contribution.


import java.util.*;

class prototype {
	
	public static void main (String [] args) {
	String shopper = "shopper";
	String manager =  "manager";
	System.out.println("Welcome to Team 4's Smart Manager Assistant Tool!");
	System.out.println("Are you a shopper or are you the store manager?");
	Scanner sc = new Scanner(System.in);
	
	String input_1 = sc.nextLine();
	sc.close();
	
		if (input_1.equals(shopper)) {
		System.out.println("Welcome shopper! The store is at 60% capacity and there is no line!");
		System.out.println("Come visit us today!");
		}
		else if (input_1.equals(manager)) {
			System.out.println("Welcome manager! The store is at 70% capacity and there is no line!");
		}
		else {
			System.out.println("Bad input! Goodbye!");
		}
	}
}