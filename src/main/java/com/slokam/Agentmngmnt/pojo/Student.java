package com.slokam.Agentmngmnt.pojo;

public class Student {
  private Integer id;
  private String name;
  private String qual;
  private Integer age;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getQual() {
	return qual;
}
public void setQual(String qual) {
	this.qual = qual;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", qual=" + qual + ", age=" + age + "]";
}
  
  
}
