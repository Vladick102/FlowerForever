package ua.edu.ucu.apps.item;

public class BasketDecorator extends ItemDecorator {

    final int PRICE = 10;

    public BasketDecorator(Item item) {
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
