package masterChef;

import java.util.ArrayList;
import java.util.Iterator;
import iteratorPackage.*;

public class Recipe extends ProductRecipe{
	
	protected ArrayList<ProductRecipe> productsList = new ArrayList<ProductRecipe>();
	protected String name;
	protected String fullRecipe;
	
	public Recipe(String name,
				String fullRecipe)
	{
		this.name = name;
		this.fullRecipe = fullRecipe;
	}
	
	@Override
	public void add(ProductRecipe product) {
		this.productsList.add(product);
	}
	
	@Override
	public void remove(ProductRecipe product) {
		this.productsList.remove(product);
	}
	
	@Override
	public ProductRecipe getChild(int i) {
		return (ProductRecipe)productsList.get(i);
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getFullRecipe() {
		return fullRecipe;
	}
	
	@Override
	public Iterator createIterator() {
		return new CompositeIterator(productsList.iterator());
	}
	
	@Override
	public void print() {
		System.out.println("Nazwa: " + name);
		System.out.println("Przepis:" + fullRecipe);
		
		Iterator<ProductRecipe> iterator = productsList.iterator();
		while(iterator.hasNext()) {
			ProductRecipe productRecipe = (ProductRecipe) iterator.next();
			productRecipe.print();
		}
		
		System.out.println("------------------------");
		
	}

}
