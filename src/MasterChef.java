
public class MasterChef {
	
	protected ProductRecipe allRecipes;
	
	public MasterChef(ProductRecipe allRecipes) {
		this.allRecipes = allRecipes;
	}
	
	public void printAllRecipes() {
		allRecipes.print();
	}

}
