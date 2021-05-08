package odevUc;

public class Main {

	public static void main(String[] args) {

		Student student0 = new Student();
		student0.adress = "Karataş";
		student0.category = "Programlama";
		student0.completion = 10;
		student0.teacher = "Engin Demiroğ";
		student0.userName = "Demet ";
		student0.userPassword = "1234567";

		userManager uManager = new userManager();
		uManager.add(student0);
		studentManager sManager = new studentManager();
		sManager.information(student0);

		Instructor instructor0 = new Instructor();
		instructor0.adress = "Beykoz";
		instructor0.enrolledStudents = 100;
		instructor0.lesoons = 24;
		instructor0.userName = "Engin Demiroğ";
		instructor0.userPassword = "235698";

		uManager.add(instructor0);
		instructorManager iManager = new instructorManager();
		iManager.information(instructor0);

	}

}
