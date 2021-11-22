package fi.oulu.tol.sqat.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fi.oulu.tol.sqat.GildedRose;
import fi.oulu.tol.sqat.Item;

public class GildedRoseTest {

	@Test
	public void testTheTruth() {
		assertTrue(true);
	}
	@Test
	public void exampleTest() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("+5 Dexterity Vest", 10, 20));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Dexterity Vest", 19, quality);
	}
	
	@Test
	public void agedBrie() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Aged Brie", 2, 0));
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has increased by one
		assertEquals("Brie Ok?", 8, quality);
	}
	@Test
	public void testBackstagePass() {
		GildedRose inn = new GildedRose();	
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		inn.oneDay();
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		assertEquals("Pass ok?", 21, quality);
	}
	
	@Test
	public void qualitySulfuras () {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		assertEquals("This value Ok?", 80, quality);
	}
	
	@Test
	public void testDoubleValueLoss() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Conjured Mana Cake", 3, 6));
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		assertEquals("This value Ok?", 1, quality);
	}
	
	@Test
	public void testZeroQuality() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Conjured Mana Cake", 3, 6));
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		assertEquals("This value Ok?", 0, quality);
	}
	
	@Test
	public void testUnder10days() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		assertEquals("This value Ok?",50, quality);
	}
	

	@Test
	public void testUnderStage() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		assertEquals("This value Ok?",47, quality);
	}
	@Test
	public void gigOver() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		assertEquals("This value Ok?",0, quality);
	}

	@Test
	public void testSomething() {
		GildedRose inn = new GildedRose();
	}
	@Test
	public void testSomething2() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("+5 Dexterity Vest", 10, 20));
		inn.setItem(new Item("Aged Brie", 2, 0));
		inn.setItem(new Item("Elixir of the Mongoose", 5, 7));
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		assertEquals("This value Ok?",19, quality);
		
		int quality1 = items.get(1).getQuality();
		assertEquals("This value Ok?",1, quality1);
		
		int quality2 = items.get(2).getQuality();
		assertEquals("This value Ok?",6, quality2);
	}
	@Test
	public void testNegative() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Conjured Mana Cake", 3, 6));
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		assertEquals("This value Ok?", 0, quality);
	}
	@Test
	public void testRagnaros() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		assertEquals("This value Ok?", 80, quality);
	}
}