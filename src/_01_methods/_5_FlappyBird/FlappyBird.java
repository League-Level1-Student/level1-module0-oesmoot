package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int birdY=200;
    int birdX=150;
    int grav = 1;
    int birdYVelocity=-5;
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
    	if (mousePressed) {
    		birdYVelocity=-10;
    	}
    	fill(0,255,0);
    	rect(350,450,50,150);
    	birdYVelocity+=grav;
    	background(255,255,255);
    	fill(255,255,0);
    	stroke(255,255,0);
    	ellipse(birdX, birdY, 50, 50);
    	birdY+=birdYVelocity;
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
