package edu.ucu.ua.flowers_store_continue.item.decorators;

import edu.ucu.ua.flowers_store_continue.item.Item;
import edu.ucu.ua.flowers_store_continue.item.ItemDecorator;


public abstract class AbstractDecorator extends ItemDecorator {
    protected final Item wrapped;

    public AbstractDecorator(Item wrapped) {
        this.wrapped = wrapped;
        this.description = wrapped.getDescription();
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double price() {
        return wrapped.price();
    }

    @Override
    public boolean equals(Item other) {
        return wrapped.equals(other);
    }
}