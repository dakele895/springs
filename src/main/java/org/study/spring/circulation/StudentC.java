package org.study.spring.circulation;

/**
 * StudentC
 *
 * @author dkl
 * 2019/8/28
 **/
public class StudentC {

	private StudentA studentA ;

	public void setStudentA(StudentA studentA) {
		this.studentA = studentA;
	}

	public StudentC() {
	}

	public StudentC(StudentA studentA) {
		this.studentA = studentA;
	}
}
