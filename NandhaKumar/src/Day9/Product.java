package Day9;

public class Product {
	private int productId;
	private String productName;
	private double price;
	
	public Product() {
	}
	
	public Product(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName()
	{
		return productName;
	}
	public void  setProductName(String productName)
	{
       this.productName=productName;		
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}
	
	

}
