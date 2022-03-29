package com.jap.furniture;

public abstract class Furniture implements IFurniture {
	// declare color, price, discounted price and furniture type as variables
	// use appropriate access specifiers

	protected String color;
	protected double price;
	protected double discountedPrice;
	protected FurnitureType type;

	public Furniture(FurnitureType furnitureType) {
		this.type = furnitureType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public FurnitureType getType() {
		return type;
	}

	public void setType(FurnitureType type) {
		this.type = type;
	}

}