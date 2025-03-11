package com.model;

public class Author {
	
	

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + "]";
	}

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(String name) {
		super();
		this.name = name;
	}
	
	

}
