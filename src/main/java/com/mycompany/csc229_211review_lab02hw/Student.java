package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person {
    private double gpa;

    public Student(String name, short age) {
        super(name, age);
        // ToDo 6: Fix the constructor of Student class
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getAddress() {
        // ToDo: Implement getAddress method
        return null;
    }

    @Override
    public void setAddress(String address) {
        // ToDo: Implement setAddress method
    }

    @Override
    public String toString() {
        // ToDo 7: Add a toString method for Student class
        return "Student{name='" + getName() + "', age=" + getAge() + ", gpa=" + gpa + '}';
    }
	// ToDo 1: Make this class a child of Person
	
	// ToDo 2: Fix the resulting errors
	
	// ToDo 3: Add a field for GPA and create setter and getter
	
	// ToDo 4: Add comments to your code

}