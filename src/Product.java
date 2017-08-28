
public class Product extends ProductRecipe{

	protected String name;
	protected String quantity;
	
	public Product(String name,
				String quantity)
	{
		this.name = name;
		this.quantity = quantity;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getQuantity() {
		return quantity;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public Iterator createIterator() {
		return new NullIterator();
	}
	
	@Override
	public void print() {
		System.out.println(" *" + name + " - " + quantity);
	}
	
}
