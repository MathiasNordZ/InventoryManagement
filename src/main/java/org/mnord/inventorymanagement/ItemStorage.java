package org.mnord.inventorymanagement;

import java.util.*;

public class ItemStorage {
  private Item item;
  private float amountOfItems;
  private double valueOfItems;
  private String itemLocation;
  private List<Item> itemList;
  private final Map<String, List<Item>> storage; // String is category, and List is the list of items.

  public ItemStorage() {
    this.storage = new HashMap<>();

  }

  public void addItem (Item item) {
    if (item == null) {
      throw new IllegalArgumentException("Item to add cannot be null");
    }
    storage.computeIfAbsent(item.getItemCategory(), k -> new ArrayList<>()).add(item);
  }

  public void removeItem (Item item) {
    UUID itemId = item.getItemId();
    String itemCategory = item.getItemCategory();

    storage.values().remove(item)
  }
}
