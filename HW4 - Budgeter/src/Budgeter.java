/*
 * Tiarnan Marsten
 * 05 Dec, 2019
 * CSE142
 * Assignment 4
 */
import java.util.*;

public class Budgeter {
	
	/** Days in the month constant. */
	public static final int DAYS = 31;
	
	/**
	 * Runs the budgeter prompt.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		prompt(s);
	}
	
	/**
	 * Calls all helper methods.
	 * @param input
	 */
	public static void prompt(Scanner input) {
		double income = 0;
		double expense = 0;
		
		income = income(input, income);
		expense = expenses(input, expense);
		totals(income, expense);
		budgetCategory(income, expense);

		input.close();
	}
	
	/**
	 * Formats the double value to two decimal places.
	 * @param value
	 * @return String representation of the double value
	 */
	public static String format(double value) {
		return String.format("%.2f", value);
	}
	
	/**
	 * Prompts user about their income and adds all categories together.
	 * @param input
	 * @param income
	 * @return the total income amount
	 */
	public static double income(Scanner input, double income) {
		int categories;
		System.out.println("This program asks for your monthly income and \n"
				+ "expenses, then tells you your net monthly income.");
		System.out.println();
		System.out.print("How many categories of income? ");
		categories = input.nextInt();
		for (int i = 0; i < categories; i++) {
			System.out.print("Next income amount? $");
			income += input.nextDouble();
		}
		System.out.println();
		
		return income;
	}
	
	/**
	 * Prompts user about their expenses and adds all categories together 
	 * or calculates daily expenses.
	 * @param input
	 * @param expense
	 * @return the total expense amount
	 */
	public static double expenses(Scanner input, double expense) {
		int categories;
		System.out.print("Enter 1) monthly or 2) daily expenses. ");
		int option = input.nextInt();
		System.out.print("How many categories of expenses? ");
		categories = input.nextInt();
		for (int i = 0; i < categories; i++) {
			System.out.print("Next expense amount? $");
			expense += input.nextDouble();
		}
		
		if (option == 2) {
			expense = expense * DAYS;
		}
		System.out.println();
		
		return expense;
	}
	
	/**
	 * Prints out the totals and totals per day.
	 * @param income
	 * @param expense
	 */
	public static void totals(double income, double expense) {
		System.out.println("Total income = $" + format(income) + " ($" + format(income / DAYS) + "/day)");
		System.out.println("Total expenses = $" + format(expense) + " ($" + format(expense / DAYS) + "/day)");
		System.out.println();
	}
	
	/**
	 * Calculates and determines how much the user saved or spent this month
	 * and determines their category.
	 * @param income
	 * @param expense
	 */
	public static void budgetCategory(double income, double expense) {
		double difference = Math.abs(income - expense);
		if (income > expense) {
			System.out.println("You earned $" + format(difference) + " more than you spent this month.");
			System.out.print("You're a ");
			if (difference > 250.00) {
				System.out.print("big saver.");
			} else if (difference <= 250 && difference > 0) {
				System.out.print("saver.");
			}
		} else { 
			System.out.println("You spent $" + format(difference) + " more than you earned this month.");
			System.out.print("You're a ");
			if (difference >= 250.00) {
				System.out.print("big spender.");
			} else if (difference < 250 && difference >= 0) {
				System.out.print("spender.");
			}
		}
	}
}