package com.masai;



public class PresentationLayer {
	ServiceLayer s1;
	

	public void setS1(ServiceLayer s1) {
		this.s1 = s1;
	}
	
	public void show() {
		s1.calculateArea();
	}
}
