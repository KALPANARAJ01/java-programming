package com.ritroorkee;

public class UniversityDemo {
	public static void main(String[] args) {

		University u = new University();
		Department cse = new Department("CSE", 1);
		u.addDepartment(cse); 
		
		Department mca = new Department("MCA",2);
		u.addDepartment(mca);
		
		Student s = new Student("Kalpana Raj ",1);
		cse.addStudent(s);
		
		Student s2 = new Student("Santosh",2);
		cse.addStudent(s2);
		
		Student s3 = new Student("Manisha",3);
		cse.addStudent(s3);
		
		Student s4 = new Student("Arjun ",4);
		cse.addStudent(s4);
		
		Student s5 = new Student("Trived",5);
		cse.addStudent(s5);
		
		Student s6 = new Student("Aman",6);
		cse.addStudent(s6);
		
		
		u.declareResult();
	}
}