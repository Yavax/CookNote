package masterChef;

import java.util.Iterator;
import serialization.SaveFile;

public class Test {

	public static void main(String[] args) {
		
		//
		//Create temp recipes
		//
		ProductRecipe recipe1 = new Recipe("Schabowy", "Sposob przygotowania schabowego");
		ProductRecipe recipe2 = new Recipe("Pomidorowa", "Gotowanie zupy");
		ProductRecipe recipe3 = new Recipe("Szarlotka", "Przygotowanie ciasta");
		
		//
		//Create cookbook with all recipes
		//
		ProductRecipe allRecipes = new Recipe("Wszystkie przepisy", "Zbior przepisow");
		
		
		//
		//Add recipes to cookbook
		//
		allRecipes.add(recipe1);
		allRecipes.add(recipe2);
		allRecipes.add(recipe3);
		
		//
		//Add products to recipe1
		//
		recipe1.add(new Product("Mieso", "1 kg"));
		recipe1.add(new Product("Ziemniaki", "2 kg"));
		
		//
		//Add products to recipe2
		//
		recipe2.add(new Product("Rosó³", "2 litry"));
		recipe2.add(new Product("Pomidory", "30 gram"));
		
		//
		//Add product to recipe3
		//
		recipe3.add(new Product("ciasto", "1kg"));
		
		//
		//Use MasterChef class 
		//
		MasterChef masterChef = new MasterChef(allRecipes);
		
		masterChef.printAllRecipes();
		
		//
		//Test wyszukiwania konkretnego przepisu
		//
		Iterator iterator = allRecipes.createIterator();
		
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("Tylko Szarlotka:");
		System.out.println("---------------------");
		while(iterator.hasNext()) {
			ProductRecipe recipe = (ProductRecipe)iterator.next();
			try {
				if(recipe.getName()=="Szarlotka") {
					recipe.print();
				}
			}catch (UnsupportedOperationException e) {}
		}
		
		
		//
		//Test zapisu do pliku
		//
		System.out.println("Zapis");
		SaveFile.saveRecipe(allRecipes);
		System.out.println("Zapisane");
		
		//
		//Test odczytu
		//
		System.out.println("Odczyt");
		ProductRecipe newAllRecipe = SaveFile.readRecipe();
		System.out.println("Odczytane");
		newAllRecipe.print();
		

	}

}
