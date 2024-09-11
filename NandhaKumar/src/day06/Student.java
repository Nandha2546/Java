package day06;

public abstract class Student {
	private int studentId;
	private String studentName;
	private String department;
	private String gender;
	private String category;
	protected double collegeFee;
	
	
	public Student() {
		super();
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public double getCollegeFee() {
		return collegeFee;
	}


	public void setCollegeFee(double collegeFee) {
		this.collegeFee = collegeFee;
	}


	public Student(int studentId, String studentName, String department, String gender, String category,
			double collegeFee) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.department = department;
		this.gender = gender;
		this.category = category;
		this.collegeFee = collegeFee;
	}
	
	public abstract double calculateTotalFee();
	
	
	
}
