package masterChef;

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

	}

}
