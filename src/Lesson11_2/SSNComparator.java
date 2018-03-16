package Lesson11_2;

import java.util.Comparator;

public class SSNComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.getSsn().compareTo(e2.getSsn());
	}
}
