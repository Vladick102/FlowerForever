package ua.edu.ucu.apps.item;

public class BasketDecorator extends ItemDecorator {

  public BasketDecorator(Item item) {
    super(item);
  }

  @Override
  public int getPrice() {
    return 10 + super.getPrice();
  }

  @Override
  public String getDescription() {
    return "Decorated with basket.";
  }
}
