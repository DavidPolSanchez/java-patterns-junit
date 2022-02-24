package com.example.structural.decoratorCustomized.decoradoresCustomized;


import com.example.structural.decoratorCustomized.Photo;

public class PhotoDecorator implements Photo {

	// elemento que decoramos
	protected Photo photo; // podría ser una DigitalPhoto o un PhotoDecorator porque ambos extienden de Photo

	protected PhotoDecorator(Photo photo) {
		if (photo==null){//Modificado para hacer el test case de photo==null
			throw new IllegalArgumentException("Argument photo is null");
		}
		this.photo = photo;
	}

}
