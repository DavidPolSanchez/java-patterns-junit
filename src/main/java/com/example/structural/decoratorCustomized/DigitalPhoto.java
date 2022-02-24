package com.example.structural.decoratorCustomized;

public class DigitalPhoto extends PhotoImpl{


	@Override
	public String show() {
		System.out.println("Ejecutando método show de foto original DigitalPhoto");

		return "Normal photo without edit";
	}
	
	@Override
	public double cost() {
		return 15;
	}


}
