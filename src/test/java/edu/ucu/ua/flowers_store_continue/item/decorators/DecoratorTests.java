package edu.ucu.ua.flowers_store_continue.item.decorators;

import edu.ucu.ua.flowers_store_continue.item.CactusFlower;
import edu.ucu.ua.flowers_store_continue.item.RomashkaFlower;
import edu.ucu.ua.flowers_store_continue.item.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTests {

    @Test
    void basketAddsPriceAndDescription() {
        Item flower = new RomashkaFlower();
        Item decorated = new BasketDecorator(flower);
        assertEquals(14.0, decorated.price(), 1e-6);
        assertNotNull(decorated.getDescription());
        assertTrue(decorated.getDescription().contains("romashaka") || decorated.getDescription().contains("romashka"));
        assertTrue(decorated.getDescription().toLowerCase().contains("basket"));
    }

    @Test
    void multipleDecoratorsStack() {
        Item flower = new CactusFlower();
        Item dec = new RibbonDecorator(new BasketDecorator(flower));
        assertEquals(57.0, dec.price(), 1e-6);
        String desc = dec.getDescription();
        assertNotNull(desc);
        assertTrue(desc.toLowerCase().contains("cactus") || desc.toLowerCase().contains("cactu"));
        assertTrue(desc.toLowerCase().contains("basket"));
        assertTrue(desc.toLowerCase().contains("ribbon"));
    }
}
