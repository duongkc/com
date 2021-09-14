package com.example.ikm;

import java.util.Scanner;

public class AdjustRecipe {

	void adjustRecipe(Recipe recipe) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to add an ingredient? Typ 'y' for yes and 'n' for no.");
		String input = sc.nextLine();		
		if(input.equals('y')) {
			System.out.println("Please insert the name of the ingriedient.");
			String inputIngredientName = sc.nextLine();
			Ingredient inputIngredient = new Ingredient();
			inputIngredient.name = inputIngredientName;
			
			Ingredient[] newIngredients = new Ingredient[recipe.ingredients.length + 1];
			for(int i = 0; i < recipe.ingredients.length; i++) {
				newIngredients[i] = recipe.ingredients[i];
			}
			newIngredients[recipe.ingredients.length] = inputIngredient;
		}
	}
}
