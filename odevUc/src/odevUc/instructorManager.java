package odevUc;

public class instructorManager {
	public void information(Instructor instructor) {
		System.out.println("*****************ÖÐRETMEN***********************\n");

		System.out.println(instructor.enrolledStudents+" öðrenciniz mevcut.\n"
				+instructor.lesoons+" tane ders sisteme yüklediniz.\n");
		System.out.println("----------------------------------\n");

	}
	

}
