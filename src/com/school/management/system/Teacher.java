/**
 * 
 */
package com.school.management.system;

/**
 * @author CoddeXaver
 *
 */
public class Teacher {
private int id;
private String fName;
private String lName;
private int salary;
private int totalSalary;
private String fullName;
/**
 * @param id
 * @param fName
 * @param lName
 * @param salary
 */
public Teacher(int id, String fName, String lName, int salary) {
	
	this.id = id;
	this.fName = fName;
	this.lName = lName;
	this.salary = salary;
	this.totalSalary = 0;
	this.fullName = fName + " " + lName;
}

/**
 * @return
 * teacher id
 */
public int getId() {
	return id;
}
/**
 * @param id
 * set teacher id
 */
public void setId(int id) {
	this.id = id;
}

/**
 * @return
 * Teacher's first name
 */
public String getfName() {
	return fName;
}
/**
 * @param fName
 * set teachers first name
 */
public void setfName(String fName) {
	this.fName = fName;
}

/**
 * @return
 * Teachers last name
 */
public String getlName() {
	return lName;
}
/**
 * @param lName
 * set teachers last name
 */
public void setlName(String lName) {
	this.lName = lName;
}

public String getFullName() {
	return fullName;
}

/**
 * @return
 * teachers salary
 */
public int getSalary() {
	return salary;
}
/**
 * @param salary
 * set teachers salary
 */
public void setSalary(int salary) {
	this.salary = salary;
}

/**
 * teacher recieve salary
 */
public void recieveSalary() {
	this.totalSalary += this.salary;
}

/**
 * @return
 * teacher's total salary received
 */
public int getTotalSalary() {
	
	return totalSalary;
}

}
