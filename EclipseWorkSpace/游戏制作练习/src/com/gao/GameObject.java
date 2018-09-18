package com.gao;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;


/**
 * @author Gaoch
 *
 */
public class GameObject {
	 Image img;
	 double x,y;
	 int speed;
	 int width,height;
	
	public void drawSelf(Graphics g) {
		g.drawImage(img,(int)x,(int)y,null);
	}
	
	public GameObject() {
		
	}
	
	public GameObject(Image img, double x, double y, int speed, int width, int height) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.width = width;
		this.height = height;
	}

	public GameObject(Image img, double x, double y) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
	}
	//获取物体所在矩形，为了以后做碰撞检测
	public Rectangle getRect() {
		return new Rectangle((int)x,(int)y,width,height);
	}
	
}
