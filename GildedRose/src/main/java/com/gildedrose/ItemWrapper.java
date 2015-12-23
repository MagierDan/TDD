package com.gildedrose;

/**
 * Created by Dan on 23/12/2015.
 */
public class ItemWrapper {
    private final Item item;

    public ItemWrapper(Item item) {
        this.item = item;
    }

    public void decreaseQuality() {
        if (item.quality > 0)
            item.quality--;
    }

    public void increaseQuality() {
        if (item.quality < 50)
            item.quality++;
    }

    public void decreaseSellIn() {
        item.sellIn--;
    }
}
