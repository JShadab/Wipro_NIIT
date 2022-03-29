package com.jap.furniture;

public class Table extends Furniture {
	// specify attributes for Table
	// define constructors, ensure the super keyword is used
	public Table(String color, double price) {
		super(FurnitureType.OFFICE);
		setColor(color);
		setPrice(price);
	}

	@Override
	public double calculateDiscountedPrice() {
		double originalPrice = getPrice();
		double discountedPrice = originalPrice - (originalPrice * OFFICE_DISCOUNT_PERCENTAGE);
		setDiscountedPrice(discountedPrice);
		return discountedPrice;
	}

	@Override
	public void displayFurnitureDetails() {
		System.out.println(toString());

	}

	@Override
	public String toString() {
		return "Table [color=" + color + ", price=" + price + ", discountedPrice=" + discountedPrice + ", type=" + type
				+ "]";
	}

}
