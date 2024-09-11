package day02;

public class demo {
    public static void main(String[] args) {
        Student st = new Student();
        st.setId(01);
        st.setName("Nandhakumar");
        st.setCentre("Tata Strive");
        st.setCountry("India");
        printStudentDetails(st);
}

	public static void printStudentDetails(Student student) {
        System.out.println("Student ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Centre: " + student.getCentre());
        System.out.println("Country: " + student.getCountry());
    }
}