package org.study.spring.circulation;

/**
 * StudentB
 *
 * @author dkl
 * 2019/8/28
 **/
public class StudentB {

	private StudentC studentC ;

	public void setStudentC(StudentC studentC) {
		this.studentC = studentC;
	}

	public StudentB() {
	}

	public StudentB(StudentC studentC) {
		this.studentC = studentC;
	}
}
