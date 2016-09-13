package com.product;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			while (true) {
				Hashtable<String, Integer> pokemons = Controller.getInput(scanner);
				double totalAfterDiscount = Controller.calculateDiscount(pokemons);
				System.out.println("Total after discount: $" + String.format("%.2f", totalAfterDiscount));
				System.out.println("Want to Continue? (Y/N): ");
				if (Constants.YES.equalsIgnoreCase(scanner.next())) {
					continue;
				} else {
					System.out.println("Thanks !!!");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Please try again.");
			main(args);
		} finally {
			scanner.close();
		}
	}
}
