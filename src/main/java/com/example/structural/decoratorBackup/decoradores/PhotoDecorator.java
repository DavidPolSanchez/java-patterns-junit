package com.example.structural.decoratorBackup.decoradores;


import com.example.structural.decoratorBackup.Photo;

public abstract class PhotoDecorator extends Photo {

	// elemento que decoramos
	protected Photo photo; // podría ser una DigitalPhoto o un PhotoDecorator porque ambos extienden de Photo

	protected PhotoDecorator(Photo photo) {
		if (photo==null){//Modificado para hacer el test case de photo==null
			throw new IllegalArgumentException("Argument photo is null");
		}
		this.photo = photo;
	}

}
