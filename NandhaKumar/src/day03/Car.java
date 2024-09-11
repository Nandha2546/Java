package day03;

public class Car {
	//Instance variables
	private String make;
	private String model;
	private int year;
	
	//Constructor
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	//method
	public void methoddisplayDetails() {
		System.out.println(make);
		System.out.println(model);
		System.out.println(year);
	}

	@Override
	public String toString() {
		return "make:" + make + "\nmodel=" + model + "\nyear=" + year ;
		
	}
	
	public static void main(String[] args) {
		Car car1=new Car("BMW","Hybrid",2023);
		System.out.println(car1);
		car1.methoddisplayDetails();
	}
}
