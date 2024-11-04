package ua.edu.ucu.apps.decorator;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.item.Item;
import ua.edu.ucu.apps.item.RibbonDecorator;

class RibbonDecoratorTest {

	final int PRICE = 130;
	private Item item;

	@BeforeEach
	void setUp() {
		item = new Item() {
			@Override
			public int getPrice() {
				return 100;
			}

			@Override
			public String getDescription() {
				return "Basic item";
			}
		};
	}

	@Test
	void testGetPrice() {
		Item decoratedItem = new RibbonDecorator(item);
		Assertions.assertEquals(PRICE, decoratedItem.getPrice());
	}

	@Test
	void testGetDescription() {
		Item decoratedItem = new RibbonDecorator(item);
		Assertions.assertEquals("Decorated with basket.", decoratedItem.getDescription());
	}
}
