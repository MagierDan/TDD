package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updateItem(item);
        }
    }

    private void updateItem(Item item) {
        if (item.name.equals("Aged Brie")) {
            updateAgedBrieItem(item);
            return;
        }

        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            updateBackstageItem(item);
            return;
        }

        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        }
        updateOtherItem(item);
    }

    private void updateOtherItem(Item item) {
        ItemWrapper wrapper = new ItemWrapper(item);

        wrapper.decreaseQuality();

        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            wrapper.decreaseQuality();
        }
    }

    private void updateBackstageItem(Item item) {
        ItemWrapper wrapper = new ItemWrapper(item);

        wrapper.increaseQuality();

        if (item.sellIn < 11) {
            wrapper.increaseQuality();
        }

        if (item.sellIn < 6) {
            if (item.quality < 50) {
                wrapper.increaseQuality();
            }
        }

        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            item.quality = 0;
        }

        return;
    }

    private void updateAgedBrieItem(Item item) {
        ItemWrapper wrapper = new ItemWrapper(item);
        wrapper.increaseQuality();

        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            wrapper.increaseQuality();
        }

        return;
    }
}
