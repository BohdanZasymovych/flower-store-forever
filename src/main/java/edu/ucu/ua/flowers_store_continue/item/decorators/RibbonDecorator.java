package edu.ucu.ua.flowers_store_continue.item.decorators;

import edu.ucu.ua.flowers_store_continue.item.Item;

public class RibbonDecorator extends AbstractDecorator {
    private static final double RIBBON_PRICE = 40.0;

    public RibbonDecorator(Item wrapped) {
        super(wrapped);
        this.description = wrapped.getDescription() + " + ribbon";
    }

    @Override
    public double price() {
        return wrapped.price() + RIBBON_PRICE;
    }
}