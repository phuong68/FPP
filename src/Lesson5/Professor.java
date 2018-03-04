package Lesson5;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
	int numberOfPublications;

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

	public Professor(String name, double salary, LocalDate hireFate, int numberOfPublications) {
		super(name, salary, hireFate);
		this.numberOfPublications = numberOfPublications;
	}
	
	
}
