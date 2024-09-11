package day01;

public class Product {
	private static String name;
	private double price;
	private int quantity;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setprice(int i) {
		this.price=i;
	}
	
	public void setquantity(int quantity) {
		this.quantity=quantity;
	}
	public String getname() {
		return name;
	}
	
	public  Double getprice() {
		return price;
	}
	
	public int getquantity() {
		return quantity;
	}
	public void printProductdetails() {
		System.out.println("Product name:" + name);
		System.out.println("Product price:" + price);
		System.out.println("Product quantity:" + quantity);
	}
	
	public static void main(String [] args) {
		Product product=new Product();
		product.setName("food");
		product.setprice(20);
		product.setquantity(2);
	product.printProductdetails();
	}
	
}

	