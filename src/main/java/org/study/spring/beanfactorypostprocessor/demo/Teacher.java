package org.study.spring.beanfactorypostprocessor.demo;

/**
 * Teacher
 *
 * @author dkl
 * 2019/8/23
 **/
public class Teacher {
	/**
	 * 老师的姓名
	 */
	private String name;

	/**
	 * 年龄
	 */
	private int age;

	/**
	 * 是否抽烟
	 */
	private boolean smoking;

	/**
	 * 老师教授的课程
	 */
	private String language;

	/**
	 * 临时变量，默认抽烟
	 */
	private boolean tempSmoking = true;

	public Teacher() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSmoking() {
		return smoking;
	}

	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public boolean isTempSmoking() {
		return tempSmoking;
	}

	public void setTempSmoking(boolean tempSmoking) {
		this.tempSmoking = tempSmoking;
	}

	public void teach(){
		System.out.println("I am :"+name+" and I will teach you :"+language + " and I "+(tempSmoking?"will":"will not")+" smoking");
	}

}
