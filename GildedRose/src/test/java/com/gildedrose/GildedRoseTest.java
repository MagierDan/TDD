package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

   @Test
   public void should_decrease_sellIn_for_common_item_quality_and_quality_does_not_go_under_0() {
      Item[] items = new Item[]{new Item("foo", 0, 0)};
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertEquals("foo", app.items[0].name);
      assertEquals(-1, app.items[0].sellIn);
      assertEquals(0, app.items[0].quality);
   }

   @Test
   public void should_decrease_by_1_quality_for_common_item() {
      Item[] items = new Item[]{new Item("foo", 10, 10)};
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertEquals(9, app.items[0].quality);
   }

   @Test
   public void should_decrease_quality_by_2_when_sellIn_is_inferior_to_0() {
      Item[] items = new Item[]{new Item("foo", -1, 5)};
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertEquals(3, app.items[0].quality);
   }

   @Test
   public void should_increase_quality_by_1_for_aged_bries_item() {
      Item[] items = new Item[]{new Item("Aged Brie", 10, 10)};
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertEquals(11, app.items[0].quality);
   }

   @Test
   public void should_increase_quality_by_1_when_sellIn_supperior_to_10_for_backstage_passes_item() {
      Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 15, 10)};
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertEquals(11, app.items[0].quality);
   }

   @Test
   public void should_increase_quality_by_2_when_sellIn_between_5_and_10_for_backstage_passes_item() {
      Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 6, 10)};
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertEquals(12, app.items[0].quality);
   }

   @Test
   public void should_increase_quality_by_2_when_sellIn_inferior_to_6_for_backstage_item() {
      Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10)};
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertEquals(13, app.items[0].quality);
   }

   @Test
   public void should_decrease_quality_to_0_when_sellIn_inferior_to_0_for_backstage_item() {
      Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", -1, 10)};
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertEquals(0, app.items[0].quality);
   }

   @Test
   public void should_increase_quality_by_2_when_sellIn_inferior_to_0_for_aged_brie_item() {
      Item[] items = new Item[]{new Item("Aged Brie", -1, 10)};
      GildedRose app = new GildedRose(items);
      app.updateQuality();
      assertEquals(12, app.items[0].quality);
   }

}