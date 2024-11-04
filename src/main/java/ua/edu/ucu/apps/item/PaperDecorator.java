package ua.edu.ucu.apps.item;

public class PaperDecorator extends ItemDecorator {

  public PaperDecorator(Item item) {
    super(item);
  }

  @Override
  public int getPrice() {
    return 15 + super.getPrice();
  }

  @Override
  public String getDescription() {
    return "Decorated with paper.";
  }
}
