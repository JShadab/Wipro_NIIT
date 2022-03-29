package com.jap.furniture;

class Sofa extends Furniture {
	// Specify attributes for Sofa
	// define constructors, ensure the super keyword is used

	public Sofa(String color, double price) {
		super(FurnitureType.HOME);
		setColor(color);
		setPrice(price);
	}

	@Override
	public double calculateDiscountedPrice() {
		double originalPrice = getPrice();
		double discountedPrice = originalPrice - (originalPrice * HOME_DISCOUNT_PERCENTAGE);
		
		setDiscountedPrice(discountedPrice);
		
		return discountedPrice;
	}

	@Override
	public void displayFurnitureDetails() {

		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Sofa [color=" + color + ", price=" + price + ", discountedPrice=" + discountedPrice + ", type=" + type
				+ "]";
	}

}