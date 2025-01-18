package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.equals("Aged Brie")) {
                item.incrementQualityUpToThreshold();
            } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                item.incrementQualityUpToThreshold();
                if (item.sellIn < 11) {
                    item.incrementQualityUpToThreshold();
                }

                if (item.sellIn < 6) {
                    item.incrementQualityUpToThreshold();
                }
            } else if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.decrementQualityDownToThreshold();
            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn < 0) {
                if (item.name.equals("Aged Brie")) {
                    item.incrementQualityUpToThreshold();
                } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    item.quality = 0;
                } else if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                    item.decrementQualityDownToThreshold();
                    }
                }
            }
        }
    }
}
