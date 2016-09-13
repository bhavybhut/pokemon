package com.product;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class Controller {
	
	/** To get price of Pokemon
	 * 
	 * @param pokemon type as String 
	 * @return price of pokemon
	 */
	private static int getPrice(String type){
		int price=0;
		if(Constants.PIKACHU.equalsIgnoreCase(type)){
			price = Constants.PIKACHU_POKEMON_PRICE;
		}
		else if(Constants.SQUIRTLE.equalsIgnoreCase(type)){
			price = Constants.SQUIRTLE_POKEMON_PRICE;
		}
		else if(Constants.CHARMANDER.equalsIgnoreCase(type)){
			price = Constants.CHARMANDER_POKEMON_PRICE;
		}
		return price;
	}
	
	/** Calculate Discount
	 * 
	 * @param pokemons as Hashtable<String,Integer>
	 * @return Discounted Total of primitive data type double
	 */
	public static double calculateDiscount(Hashtable<String,Integer> pokemons){
		double totalAfterDiscount = 0;
		ArrayList<Integer> keyList = new ArrayList<Integer>();
		ArrayList<Integer> valueList = new ArrayList<Integer>();
		int maxVal = 0;
		for(Integer max : pokemons.values()){
			maxVal = maxVal > max ? maxVal : max;
		}
		
		while(maxVal > 0){
			int total = 0;
			int totalPokemon = 0;
			for(Entry<String, Integer> tempSet: pokemons.entrySet()){
				if(tempSet.getValue() > 0){
					total += getPrice(tempSet.getKey());
					totalPokemon++;
					pokemons.replace(tempSet.getKey(), tempSet.getValue()-1);
				}
			}
			keyList.add(total);
			valueList.add(totalPokemon);
			maxVal--;
		}
		
		
		Iterator<Integer> keyIterator = keyList.iterator();
		Iterator<Integer> valueIterator = valueList.iterator();
		while(keyIterator.hasNext()){
			int key = keyIterator.next();
			int value = valueIterator.next();
			if(value==1){
				totalAfterDiscount += key;
			}
			else if(value == 2){
				totalAfterDiscount += (key - (key*0.1));
			}
			else if(value == 3){
				totalAfterDiscount += (key - (key*0.2));
			}
		}
		
		return totalAfterDiscount;
	}
	
	/** Read values from Console
	 * 
	 * @return Hashtable<String, Integer> of input
	 */
	protected static Hashtable<String, Integer> getInput(Scanner scanner) throws Exception{
		Hashtable<String, Integer> pokemons = new Hashtable<String, Integer>();
		try {
			System.out.print("Enter Quantity of Pikachu: ");
			pokemons.put(Constants.PIKACHU, scanner.nextInt());

			System.out.print("Enter Quantity of Squirtle: ");
			pokemons.put(Constants.SQUIRTLE, scanner.nextInt());
			
			System.out.print("Enter Quantity of Charmander: ");
			pokemons.put(Constants.CHARMANDER, scanner.nextInt());
		} catch (InputMismatchException e) {
			System.out.println("Please enter Integer values");
			throw e;
		} catch (Exception e){
			throw e;
		}
		return pokemons;
	}
}