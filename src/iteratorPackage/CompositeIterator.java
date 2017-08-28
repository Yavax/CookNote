package iteratorPackage;

import java.util.*;

public class CompositeIterator implements Iterator{
	Stack stack = new Stack();
	
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}
	

}
