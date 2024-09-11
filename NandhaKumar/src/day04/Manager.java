package day04;

public class Manager extends Employee{
	private String department;
	
	public Manager(String name, int id, double salary,String department) {
		super(name,id,salary);
		this.department=department;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Department:"+department);
	}
	
}



