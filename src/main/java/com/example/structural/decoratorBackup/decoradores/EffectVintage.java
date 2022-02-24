package com.example.structural.decoratorBackup.decoradores;


import com.example.structural.decoratorBackup.Photo;

public class EffectVintage extends PhotoDecorator {

	public EffectVintage(Photo photo) {
		super(photo);
	}

	@Override
	public String show() {
		System.out.println("Ejecutando método show de Decorador EffectVintage");
		// decorar la foto
		//this.photo.setBrightness(90);
		//this.photo.setContrast(20);
		//this.photo.setBlur(5);
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
