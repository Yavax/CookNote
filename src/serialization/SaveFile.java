package serialization;

import masterChef.ProductRecipe;
import java.io.*;

public class SaveFile {
	
	public static void saveRecipe(ProductRecipe productRecipe) {
		try {
			FileOutputStream sr = new FileOutputStream("przepisy.ser");
			ObjectOutputStream os = new ObjectOutputStream(sr);
			os.writeObject(productRecipe);
			os.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static ProductRecipe readRecipe() {
		ProductRecipe recipe = null;
		
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("przepisy.ser"));
			recipe = (ProductRecipe) is.readObject();
		}catch(Exception ex) {
			ex.printStackTrace();
		}

		return recipe;
	}

}
