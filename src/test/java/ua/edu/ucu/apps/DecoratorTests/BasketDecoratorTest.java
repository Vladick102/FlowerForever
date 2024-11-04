package ua.edu.ucu.apps.DecoratorTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.item.BasketDecorator;
import ua.edu.ucu.apps.item.Item;

class BasketDecoratorTest {

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
    Item decoratedItem = new BasketDecorator(item);
    assertEquals(110, decoratedItem.getPrice());
  }

  @Test
  void testGetDescription() {
    Item decoratedItem = new BasketDecorator(item);
    assertEquals("Decorated with basket.", decoratedItem.getDescription());
  }
}
