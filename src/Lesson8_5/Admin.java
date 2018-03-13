package Lesson8_5;
import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static List<Student> convertArray(Object[] studentArray) {
		List<Student> students = new ArrayList<Student>();
		
		for(Object st: studentArray)
			students.add((Student) st);
		
		
		return students;
	}
	
	
	public static double computeAverageGpa(List<Student> studentList) {
		
		double avgGPA = 0.0;
		
		for (Student st:studentList)
			avgGPA += st.computeGpa();
		
		
		return avgGPA/studentList.size();
	}
}
