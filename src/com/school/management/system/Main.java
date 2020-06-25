package com.school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<>();
Student james = new Student(1, "James", "Obi", "elementry", 200);
studentList.add(james);
james.setName();

List<Teacher> teachersList = new ArrayList<>();
Teacher frank = new Teacher(1, "Frank", "Edward", 3000 );
teachersList.add(frank);

School army = new School("Army Group of Schools ", teachersList, studentList,"1, adejumo close, ilado", "army@gmail.com");


System.out.println(james.getClass().getSimpleName());
System.out.println(james.getSujectClass());
System.out.println(james.getName());



System.out.println(frank.getClass().getSimpleName());
System.out.println(frank.getFullName());
System.out.println(frank.getSalary());


System.out.println(army.getClass().getSimpleName());
System.out.println(army.getSchoolName());
System.out.println(army.getStudents());
System.out.println(army.getTeachers());


	}

	
}
