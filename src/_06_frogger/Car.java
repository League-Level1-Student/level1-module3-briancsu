package _06_frogger;

import processing.core.PApplet;
public class Car {

	public int carX;
	public int carY;
	public int carSize;
	public int carSpeed;
	public PApplet applet;
	
	public Car(PApplet applet, int carX, int carY, int carSize, int carSpeed) {
		this.applet = applet;
		this.carX = carX;
		this.carY = carY;
		this.carSize = carSize;
		this.carSpeed = carSpeed;
	}
	public void move() {
		carX+=carSpeed;
		if(carX > applet.displayWidth-50) {
			carX = 50;
		}
		else if(carX < 50) {
			carX = applet.displayWidth - 50;
		}
	}
	public void display()
	  {
	    
		applet.fill(0, 255, 0);
	    applet.rect(carX , carY,  carSize, 50);
	  }
	public int getX() {
		return(carX);
	}
	public int getY() {
		return carY;
	}
	public int getSize() {
		return carSize; 
	}
	
	
	
}
