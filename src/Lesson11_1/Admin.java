package Lesson11_1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> hashmap = new HashMap<Key, Student>();
		
		for(Student st: students) {
			hashmap.put(new Key(st.getFirstName(), st.getLastName()),st);
		}
		return hashmap;
	}
}
