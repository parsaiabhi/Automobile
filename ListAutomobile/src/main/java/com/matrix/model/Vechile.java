package com.matrix.model;

public class Vechile {
	
	private String color;
	private String type;
	private String model;
	
	
	
	
	public Vechile() {
		super();
	}
	public Vechile(String color, String type, String model) {
		super();
		this.color = color;
		this.type = type;
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Vechile [color=" + color + ", type=" + type + ", model=" + model + "]";
	}
	
	

}
