package com.cheetah.store.model;

public class Person {
	String id;
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name;
//	public Person(String id){
//		this.id=id;
//	}
	public String getName(){
		switch(id){
		case "1":
			name="dennis";
			break;
		case"2":
			name="selina";
			break;
	 default:
			name="No id";
			break;
		}
		return name;
	}
	public String getId(){
		return id;
	}
}
