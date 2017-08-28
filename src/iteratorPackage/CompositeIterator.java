package iteratorPackage;

import java.util.*;
import masterChef.*;

public class CompositeIterator implements Iterator {
	Stack stack = new Stack();
	
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}
	
	public Object next() {
		if(hasNext()) {
			Iterator iterator = (Iterator) stack.peek();
			ProductRecipe product = (ProductRecipe) iterator.next();
			if(product instanceof ProductRecipe) {
				stack.push(product.createIterator());
			}
			return product;
		}else {
			return null;
		}
	}
	
	public boolean hasNext() {
		if(stack.empty()) {
			return false;
		}else {
			Iterator iterator = (Iterator) stack.peek();
			if(!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			}else
				return true;
		}
	}
	
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
