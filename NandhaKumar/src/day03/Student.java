package day03;

public class Student {
	private String name;
	private int grade;
	public String getName() {
		return name;
	}
	
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "name:" + name + ", grade=" + grade ;
	}
	
	public static void main(String[] args) {
		Student student=new Student("Nandhakumar N",05);
		System.out.println(student);
	}
}
