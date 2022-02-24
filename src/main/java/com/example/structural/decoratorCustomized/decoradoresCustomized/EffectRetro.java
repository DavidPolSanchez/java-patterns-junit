package com.example.structural.decoratorCustomized.decoradoresCustomized;


import com.example.structural.decoratorCustomized.Photo;

public class EffectRetro extends PhotoDecorator{


	public EffectRetro(Photo photo) {
		super(photo);

	}

	@Override
	public Integer getBrightness() {
		return this.photo.getBrightness();
	}

	@Override
	public Integer getContrast() {
		return this.photo.getContrast();
	}


	@Override
	public void setBrightness(Integer brightness) {
		this.photo.setBrightness(brightness);
	}

	@Override
	public void setContrast(Integer contrast) {
		this.photo.setContrast(contrast);
	}


	@Override
	public String show() {
		System.out.println("Ejecutando método show de Decorador EffectRetro");

		// decorar la foto
		this.setBrightness(50);
		this.setContrast(20);
		System.out.println(this.photo.getBrightness());
		System.out.println(this.photo.getContrast());
		return this.photo.show() + " + Retro";
	}
	
	@Override
	public double cost() {
		return this.photo.cost() + 20;
	}

}
