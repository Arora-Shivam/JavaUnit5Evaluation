package com.masai;

public class ServiceLayer {
	Shapes shape;

	public void setShape(Shapes s) {
		this.shape = s;
	}
	
	public void calculateArea() {
		shape.area();
	}
	
}


interface Shapes{
	public void area();
}

class Circle implements Shapes{

	@Override
	public void area() {
		System.out.println("Area of Circle");
		
	}
	
}

class Square implements Shapes{

	@Override
	public void area() {
		System.out.println("Area of Square");
		
	}
	
}