package _06_frogger;

import processing.core.PApplet;
import processing.core.PImage;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    Car carLeft;
    Car carRight;
 
    int frogX = 325;
    int frogY = 510;
    int hopDistance = 10;
       public void settings(){
           size(800,600);
       }
       public void setup() {
          background(0,0,0);
           carLeft = new Car(this,250,360,120, -20);
           
           carRight = new Car(this,250,150,120, 20);
           
          
        
          
          
       }
       public void draw() {
    	   background(0,0,0);
    	   carLeft.move();
    	   carLeft.display();
    	  
    	 
    	   carRight.move();
    	   carRight.display();
    	   fill(0, 255, 0);
    	   ellipse(frogX, frogY, 50, 50);
    	   
    	   System.out.println(carLeft.getX());
    	   if(intersects(carLeft) == true || intersects(carRight) == true) {
    		   
    		   frogX=325;
    		   frogY=510;
    	   }
    	  
       }
        
       public void keyPressed()
       {
           if(key == CODED){
               if(keyCode == UP)
               {
                   frogY -= hopDistance;
            	   //Frog Y position goes up
               }
               else if(keyCode == DOWN)
               {
            	   frogY += hopDistance;
            	   //Frog Y position goes down 
               }
               else if(keyCode == RIGHT)
               {
            	   frogX += hopDistance;
            	   //Frog X position goes right
               }
               else if(keyCode == LEFT)
               {
            	   frogX -= hopDistance;
                   //Frog X position goes left
               }
           }
       }
       public void Border() {
    	   if(frogY<0) {
    		   frogY +=50;
    	   }
    	   else  if(frogX<0) {
    		   frogX +=50;
    	   }
    	   else  if(frogY>HEIGHT) {
    		   frogY -=50;
    	   }
    	   else  if(frogX>WIDTH) {
    		   frogX -=50;
    	   }
       }
       
       boolean intersects(Car car) {
  		 if ((frogY > car.getY() && frogY < car.getY()+50) &&
  		                (frogX > car.getX() && frogX < car.getX()+car.getSize())) { 
  		   return true;
  		  }
  		 else  {
  			return false;
  		 }
       }
       
       
       
       
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
