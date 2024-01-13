package _01_methods._5_FlappyBird;

import java.util.Random;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int birdY=200;
    int birdX=150;
    int grav = 1;
    int birdYVelocity=-5;
    int pipeX =750;
    Random ran = new Random();
    int h1 = ran.nextInt(500);
    int pipeGap = 150;
    int lowerY = h1 +pipeGap;
    int upperY = 0;
    int score = 0;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }
    public void mousePressed() {
    	for(int i =0;i>4;i++) {
    		birdY+=5;
    	}
    	grav =1;
    }

    @Override
    public void setup() {
    }
   
    @Override
    public void draw() {
    	background(255,255,255);
    	if (pipeX < -51) {
    		pipeX = 750;
    		h1 = ran.nextInt(500);
    		lowerY = h1 + pipeGap;
    	}
    	if (birdX == pipeX + 75) {
    		score++;
    	}
	   
    	if (mousePressed) {
    		birdYVelocity=-10;
    	}
    	fill(0,255,0);
    	rect(pipeX,upperY,50,h1);
    	rect(pipeX,lowerY,50,600);
    	birdYVelocity+=grav;
    	fill(255,255,0);
    	stroke(255,255,0);
    	ellipse(birdX, birdY, 50, 50);
    	birdY+=birdYVelocity;
    	pipeX -= 5;
    	fill (0,0,0);
    	text("score: " + score, 100,100);
    	if (intersectsPipes()) {
    	exit();	
    	}
    }
    boolean intersectsPipes() { 
        if (birdY < h1 && birdX > pipeX && birdX < (pipeX+50)){
           return true; }
       else if (birdY>lowerY && birdX > pipeX && birdX < (pipeX+50)) {
           return true; }
       else { return false; }
}
    static public void main(String[] args) { int pipeGap = 150;
        PApplet.main(FlappyBird.class.getName());
    }
}
