package com.imooc.sethomework;



public class Student {
	
	//根据需求完成Student类的定义
	private int stuId;//学号
	private String name;//姓名
	private double score;//成绩
	
	public Student() {
		
	}
	public Student(int stuId, String name, double score) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.score = score;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "[学号：" + stuId + ", 姓名：" + name + ", 成绩：" + score + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + stuId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		//判断对象是否相等，相等则返回true，不用继续比较属性了
		if (this == obj)
			return true;
		if(obj.getClass() == Student.class) {
			Student stu = (Student)obj;
			return (stu.getStuId()==score);
		}
		return false;
	}
	
	
	
	
	

}
