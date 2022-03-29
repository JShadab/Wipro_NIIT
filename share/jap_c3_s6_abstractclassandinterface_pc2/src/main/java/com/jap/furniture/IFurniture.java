package com.jap.furniture;

public interface IFurniture {
	// define the discount percentage for various furniture types

	public static final double OFFICE_DISCOUNT_PERCENTAGE = 0.10;
	double HOME_DISCOUNT_PERCENTAGE = 0.05;
	double GARDEN_DISCOUNT_PERCENTAGE = 0.025;

	// define common methods like calculateDiscountedPrice and display furniture
	// details

	double calculateDiscountedPrice();
	void displayFurnitureDetails();

}
