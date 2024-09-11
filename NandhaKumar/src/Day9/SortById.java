package Day9;

import java.util.Comparator;

public class SortById implements Comparator<Product> 
{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		
		return o2.getProductId()-o1.getProductId();
	}
	

}
