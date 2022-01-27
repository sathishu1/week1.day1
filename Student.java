package college.package1;

public class Student {
	String name = "Dhamo";
	int rollNumber = 102;

	public void college() {
		String name1 = "Arun";
		System.out.println("Student name:" + name1);
	}

	public static void main(String[] args) {
		Student details = new Student();
		details.college();
		System.out.println(details.name);
		System.out.println(details.rollNumber);
	}
}
