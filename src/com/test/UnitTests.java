package com.test;

import org.junit.Assert;
import java.util.Hashtable;
import org.junit.Test;

import com.product.Constants;
import com.product.Controller;

public class UnitTests {

	@Test
	public void example_1() {
		Hashtable<String, Integer> pokemons = new Hashtable<String, Integer>();
		pokemons.put(Constants.PIKACHU, 1);
		Assert.assertEquals("Should yield $6.00", 6, Controller.calculateDiscount(pokemons), 0.0001);
	}
	
	@Test
	public void example_2() {
		Hashtable<String, Integer> pokemons = new Hashtable<String, Integer>();
		pokemons.put(Constants.PIKACHU, 2);
		Assert.assertEquals("Should yield $12.00", 12, Controller.calculateDiscount(pokemons), 0.0001);
	}
	
	@Test
	public void example_3() {
		Hashtable<String, Integer> pokemons = new Hashtable<String, Integer>();
		pokemons.put(Constants.PIKACHU, 1);
		pokemons.put(Constants.SQUIRTLE, 1);
		Assert.assertEquals("Should yield $9.90", 9.90, Controller.calculateDiscount(pokemons), 0.0001);
	}
	
	@Test
	public void example_4() {
		Hashtable<String, Integer> pokemons = new Hashtable<String, Integer>();
		pokemons.put(Constants.PIKACHU, 2);
		pokemons.put(Constants.SQUIRTLE, 2);
		Assert.assertEquals("Should yield $19.80", 19.80, Controller.calculateDiscount(pokemons), 0.0001);
	}
	
	@Test
	public void example_5() {
		Hashtable<String, Integer> pokemons = new Hashtable<String, Integer>();
		pokemons.put(Constants.PIKACHU, 3);
		pokemons.put(Constants.SQUIRTLE, 3);
		Assert.assertEquals("Should yield $29.70", 29.70, Controller.calculateDiscount(pokemons), 0.0001);
	}
	
	@Test
	public void example_6() {
		Hashtable<String, Integer> pokemons = new Hashtable<String, Integer>();
		pokemons.put(Constants.PIKACHU, 2);
		pokemons.put(Constants.SQUIRTLE, 1);
		Assert.assertEquals("Should yield $15.90", 15.90, Controller.calculateDiscount(pokemons), 0.0001);
	}
	
	@Test
	public void example_7() {
		Hashtable<String, Integer> pokemons = new Hashtable<String, Integer>();
		pokemons.put(Constants.PIKACHU, 1);
		pokemons.put(Constants.SQUIRTLE, 1);
		pokemons.put(Constants.CHARMANDER, 1);
		Assert.assertEquals("Should yield $12.80", 12.80, Controller.calculateDiscount(pokemons), 0.0001);
	}
	
	@Test
	public void example_8() {
		Hashtable<String, Integer> pokemons = new Hashtable<String, Integer>();
		pokemons.put(Constants.PIKACHU, 2);
		pokemons.put(Constants.SQUIRTLE, 1);
		pokemons.put(Constants.CHARMANDER, 1);
		Assert.assertEquals("Should yield $18.80", 18.80, Controller.calculateDiscount(pokemons), 0.0001);
	}
	
	@Test
	public void example_extra() {
		Hashtable<String, Integer> pokemons = new Hashtable<String, Integer>();
		pokemons.put(Constants.PIKACHU, 3);
		pokemons.put(Constants.SQUIRTLE, 2);
		pokemons.put(Constants.CHARMANDER, 1);
		Assert.assertEquals("Should yield $28.70", 28.70, Controller.calculateDiscount(pokemons), 0.0001);
	}

}
