package com.jap.furniture;

public class Bookshelf extends Furniture {
	// specify attributes for BookShelf
	// define constructors, ensure the super keyword is used
	public Bookshelf(String color, double price) {
		super(FurnitureType.GARDEN);
		setColor(color);
		setPrice(price);
	}

	@Override
	public double calculateDiscountedPrice() {
		double originalPrice = getPrice();
		double discountedPrice = originalPrice - (originalPrice * GARDEN_DISCOUNT_PERCENTAGE);
		setDiscountedPrice(discountedPrice);
		return discountedPrice;
	}

	@Override
	public void displayFurnitureDetails() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Bookshelf [color=" + color + ", price=" + price + ", discountedPrice=" + discountedPrice + ", type="
				+ type + "]";
	}

}