package com.commons.sample.dao;

public class Simple {
	
	int id;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Simple [id=" + id + ", name=" + name + "]";
	}

}
