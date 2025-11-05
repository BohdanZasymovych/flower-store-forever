package edu.ucu.ua.flowers_store_continue.item.decorators;

import edu.ucu.ua.flowers_store_continue.item.Item;

public class BasketDecorator extends AbstractDecorator {
    private static final double BASKET_PRICE = 4.0;

    public BasketDecorator(Item wrapped) {
        super(wrapped);
        this.description = wrapped.getDescription() + " + basket";
    }

    @Override
    public double price() {
        return wrapped.price() + BASKET_PRICE;
    }
}