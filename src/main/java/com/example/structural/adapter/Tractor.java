package com.example.structural.adapter;

public class Tractor {
	
	private double speed;

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}


	public void changeMode(int mode) {
		switch (mode) {
			case 1: // TORTUGA
				this.speed = 5;
				break;
			case 2: // LIEBRE
				this.speed = 15;
				break;
		default:
			break;
		}
	}

}
