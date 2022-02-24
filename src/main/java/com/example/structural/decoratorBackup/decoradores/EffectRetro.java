package com.example.structural.decoratorBackup.decoradores;


import com.example.structural.decoratorBackup.Photo;

public class EffectRetro extends PhotoDecorator {

	public EffectRetro(Photo photo) {
		super(photo);

	}

	@Override
	public String show() {
		System.out.println("Ejecutando método show de Decorador EffectRetro");

		// decorar la foto
		//this.photo.setBrightness(50);
		//this.photo.setContrast(20);
		//System.out.println(this.getBrightness());
		//System.out.println(this.getContrast());
		this.setBrightness(50);
		this.setContrast(20);
		System.out.println(this.getBrightness());
		System.out.println(this.getContrast());
		return this.photo.show() + " + Retro";
	}
	
	@Override
	public double cost() {
		return this.photo.cost() + 20;
	}

}
