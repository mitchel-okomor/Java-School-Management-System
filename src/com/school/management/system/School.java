package com.school.management.system;

import java.util.List;

public class School {
	private String schoolName;
private List<Teacher> teachers;
private List<Student> students;
private String address;
private String email;
private int totalMoneyEarned;
private int totalMoneySpent;

/**
 * @param schoolName
 * @param teachers
 * @param students
 * @param address
 * @param email
 * @param totalMoneyEarned
 * @param totalMoneySpent
 */
public School(String schoolName, List<Teacher> teachers, List<Student> students, String address, String email
		) {
	this.schoolName = schoolName;
	this.teachers = teachers;
	this.students = students;
	this.address = address;
	this.email = email;
	this.totalMoneyEarned = 0;
	this.totalMoneySpent = 0;
}


/**
 * @return
 * Name of School
 */
public String getSchoolName() {
	return schoolName;
}
/**
 * @param schoolName
 * set school name
 */
public void setSchoolName(String schoolName) {
	this.schoolName = schoolName;
}

/**
 * @return
 * list of teachers
 */
public List<Teacher> getTeachers() {
	return teachers;
}

/**
 * @param teachers
 * add a teacher
 */
public void setTeachers(Teacher teacher) {
	this.teachers.add(teacher);
}
public List<Student> getStudents() {
	return students;
}
public void setStudents(Student student) {
	this.students.add(student);
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getTotalMoneyEarned() {
	return totalMoneyEarned;
}
public void setTotalMoneyEarned(int totalMoneyEarned) {
	this.totalMoneyEarned = totalMoneyEarned;
}
public int getTotalMoneySpent() {
	return totalMoneySpent;
}
public void setTotalMoneySpent(int totalMoneySpent) {
	this.totalMoneySpent = totalMoneySpent;
}





}
