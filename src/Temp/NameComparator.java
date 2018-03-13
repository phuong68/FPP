package Temp;

import java.util.Comparator;

public class NameComparator<T> implements Comparator<T>{

	@Override
	public int compare(Object arg0, Object arg1) {
		Employee emp0 = (Employee)arg0;
		Employee emp1 = (Employee)arg1;
		
		return emp0.name.compareTo(emp1.getName());
	}

}
