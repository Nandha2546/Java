package Day9;

public class HappyMart {
	public static void main(String[] args) {
		Product[] products = { new Product(100,"name",500), new Product(),
				new Product(), new Product(), new Product()
		};
		for(int i=0;i<products.length;i++) {
			System.out.println(products[i]);
		}
		
	}

}
