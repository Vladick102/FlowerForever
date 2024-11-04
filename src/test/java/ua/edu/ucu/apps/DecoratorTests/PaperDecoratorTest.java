package ua.edu.ucu.apps.DecoratorTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.item.Item;
import ua.edu.ucu.apps.item.PaperDecorator;

class PaperDecoratorTest {

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
    Item decoratedItem = new PaperDecorator(item);
    assertEquals(115, decoratedItem.getPrice(), "Price should include paper decoration cost");
  }

  @Test
  void testGetDescription() {
    Item decoratedItem = new PaperDecorator(item);
    assertEquals("Decorated with paper.", decoratedItem.getDescription(),
        "Description should reflect paper decoration");
  }
}
