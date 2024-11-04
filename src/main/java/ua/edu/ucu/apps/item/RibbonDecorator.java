package ua.edu.ucu.apps.item;

public class RibbonDecorator extends ItemDecorator {

  public RibbonDecorator(Item item) {
    super(item);
  }

  @Override
  public int getPrice() {
    return 30 + super.getPrice();
  }

  @Override
  public String getDescription() {
    return "Decorated with basket.";
  }
}
