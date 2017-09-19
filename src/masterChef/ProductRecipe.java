package masterChef;

import java.util.*;
import java.io.*;

public abstract class ProductRecipe implements Serializable {
	
	public void add(ProductRecipe productRecipe) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(ProductRecipe productRecipe) {
		throw new UnsupportedOperationException();
	}
	
	public void setName(String name) {
		throw new UnsupportedOperationException();
	}
	
	public void setFullRecipe(String recipe) {
		throw new UnsupportedOperationException();
	}
	
	public void setQuantity(String quantity) {
		throw new UnsupportedOperationException();
	}
	
	public ProductRecipe getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	public String getName() {
		throw new UnsupportedOperationException();
	}
	
	public String getFullRecipe() {
		throw new UnsupportedOperationException();
	}
	
	public String getQuantity() {
		throw new UnsupportedOperationException();
	}

	public abstract Iterator createIterator();
	
	public void print() {
		throw new UnsupportedOperationException();
	}

}
