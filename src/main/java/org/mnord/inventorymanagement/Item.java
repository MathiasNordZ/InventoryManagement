package org.mnord.inventorymanagement;

import java.util.UUID;

/**
 * Represents an item in the inventory with details such as name, category, ID, description, and price.
 * Provides methods to access and modify these details.
 */
public class Item {
  private String itemName;
  private String itemCategory;
  private UUID itemId;
  private String itemDescription;
  private double itemPrice;

  /**
   * Constructs a new Item with the specified details.
   *
   * @param itemName        the name of the item
   * @param itemCategory    the category of the item
   * @param itemId          the unique identifier of the item
   * @param itemDescription a brief description of the item
   * @param itemPrice       the price of the item
   */
  public Item(String itemName, String itemCategory, UUID itemId, String itemDescription, double itemPrice) {
    setItemName(itemName);
    setItemCategory(itemCategory);
    setItemId(itemId);
    setItemDescription(itemDescription);
    setItemPrice(itemPrice);
  }

  /**
   * Retrieves the name of the item.
   *
   * @return the name of the item
   */
  public String getItemName() {
    return itemName;
  }

  /**
   * Sets the name of the item after validating it.
   *
   * @param itemName the name to set for the item
   * @throws IllegalArgumentException if the name is null, blank, or contains non-letter characters
   */
  public void setItemName(String itemName) {
    stringValidator(itemName);
    this.itemName = itemName;
  }

  /**
   * Retrieves the category of the item.
   *
   * @return the category of the item
   */
  public String getItemCategory() {
    return itemCategory;
  }

  /**
   * Sets the category of the item after validating it.
   *
   * @param itemCategory the category to set for the item
   * @throws IllegalArgumentException if the category is null, blank, or contains non-letter characters
   */
  public void setItemCategory(String itemCategory) {
    stringValidator(itemCategory);
    this.itemCategory = itemCategory;
  }

  /**
   * Retrieves the unique identifier of the item.
   *
   * @return the unique identifier of the item
   */
  public UUID getItemId() {
    return itemId;
  }

  /**
   * Sets the unique identifier of the item.
   *
   * @param itemId the unique identifier to set for the item
   */
  public void setItemId(UUID itemId) {
    this.itemId = itemId;
  }

  /**
   * Retrieves the description of the item.
   *
   * @return the description of the item
   */
  public String getItemDescription() {
    return itemDescription;
  }

  /**
   * Sets the description of the item after validating it.
   *
   * @param itemDescription the description to set for the item
   * @throws IllegalArgumentException if the description is null, blank, or contains non-letter characters
   */
  public void setItemDescription(String itemDescription) {
    stringValidator(itemDescription);
    this.itemDescription = itemDescription;
  }

  /**
   * Retrieves the price of the item.
   *
   * @return the price of the item
   */
  public double getItemPrice() {
    return itemPrice;
  }

  /**
   * Sets the price of the item.
   *
   * @param itemPrice the price to set for the item
   */
  public void setItemPrice(double itemPrice) {
    this.itemPrice = itemPrice;
  }

  /**
   * Validates a string to ensure it is not null, blank, and contains only letters.
   *
   * @param providedString the string to validate
   * @throws IllegalArgumentException if the string is null, blank, or contains non-letter characters
   */
  private void stringValidator(String providedString) {
    if (providedString == null || providedString.isBlank() || !providedString.chars().allMatch(Character::isLetter)) {
      String errorMessage;
      if (providedString == null) {
        errorMessage = "String cannot be null.";
      } else if (providedString.isBlank()) {
        errorMessage = "String cannot be empty/blank.";
      } else {
        errorMessage = "String must contain valid letters.";
      }
      throw new IllegalArgumentException(errorMessage);
    }
  }
}
