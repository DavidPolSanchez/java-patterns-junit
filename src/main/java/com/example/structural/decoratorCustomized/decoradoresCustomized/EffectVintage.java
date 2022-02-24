package com.example.structural.decoratorCustomized.decoradoresCustomized;


import com.example.structural.decoratorCustomized.Photo;

public class EffectVintage extends PhotoDecorator{

	public EffectVintage(Photo photo) {
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
	public Integer getBlur() {
		return this.photo.getBlur();
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
	public void setBlur(Integer blur) {
		this.photo.setBlur(blur);
	}

	@Override
	public String show() {
		System.out.println("Ejecutando método show de Decorador EffectVintage");
		// decorar la foto
		this.setBrightness(90);
		this.setContrast(20);
		this.setBlur(5);
		return this.photo.show() + " + Vintage";
	}
	
	@Override
	public double cost() {
		return this.photo.cost() + 15;
	}

}
