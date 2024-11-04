package ua.edu.ucu.apps.item;

public class RibbonDecorator extends ItemDecorator {

  final int PRICE = 30;

  public RibbonDecorator(Item item) {
    super(item);
  }

  @Override
  public int getPrice() {
    return PRICE + super.getPrice();
  }

  @Override
  public String getDescription() {
    return "Decorated with basket.";
  }
}
