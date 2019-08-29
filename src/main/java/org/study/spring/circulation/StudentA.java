package org.study.spring.circulation;

/**
 * StudentA
 *
 * @author dkl
 * 2019/8/28
 **/
public class StudentA {

	private StudentB studentB ;

	public void setStudentB(StudentB studentB) {
		this.studentB = studentB;
	}

	public StudentA() {
	}

	public StudentA(StudentB studentB) {
		this.studentB = studentB;
	}
}

