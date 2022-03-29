package com.jap.furniture;

public class FurnitureDemo
    {
        public static void main(String[] args)
        {
            // Declare Objects for the furniture Bookshelf, Table and Sofa
            // Ensure that the super type refers to the sub classes
            // Display the details of each of them
        	Furniture sofa = new Sofa("Green", 15000);
        	sofa.calculateDiscountedPrice();
        	sofa.displayFurnitureDetails();
        	
        	Furniture table = new Table("Black", 3000);
           	table.calculateDiscountedPrice();
        	table.displayFurnitureDetails();
        	
        	Furniture bookself= new Bookshelf("White", 1250);
           	bookself.calculateDiscountedPrice();
        	bookself.displayFurnitureDetails();
        }
    }