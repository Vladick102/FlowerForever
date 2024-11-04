package ua.edu.ucu.apps.item;

public class PaperDecorator extends ItemDecorator {

  final int PRICE = 15;

  public PaperDecorator(Item item) {
    super(item);
  }

  @Override
  public int getPrice() {
    return PRICE + super.getPrice();
  }

  @Override
  public String getDescription() {
    return "Decorated with paper.";
  }
}
