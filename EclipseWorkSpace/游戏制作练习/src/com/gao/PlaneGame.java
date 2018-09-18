package com.gao;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

import javax.swing.JFrame;

public class PlaneGame extends Frame{
	Image planeImg = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	Plane  plane = new Plane(planeImg,250,250);
	Shell shell = new Shell();
	Shell[] shells = new Shell[50];
	Explode boom;
	Date startTime = new Date();
	Date endTime;
	int period;
	public static void main(String[] args) {
		PlaneGame p = new PlaneGame();
		p.launchFrame();

	}
	@Override
	public void paint(Graphics g) {   //����
		Color c = g.getColor();
		g.drawImage(bg,0,0,null);
		plane.drawSelf(g);
		for(int i = 0;i<shells.length;i++) {
			shells[i].draw(g);
			
			boolean peng = shells[i].getRect().intersects(plane.getRect());
			if(peng) {
				plane.live = false;
				if(boom==null) {
					boom = new Explode(plane.x,plane.y);
					
					endTime = new Date();
					period = (int)((endTime.getTime() - startTime.getTime())/10000);
					
				}
				boom.draw(g);
			
			}
			if(!plane.live) {
				Font f = new Font("����",Font.BOLD,50);
				g.setFont(f);
				g.setColor(Color.RED);
				g.drawString("ʱ�䣺"+ period +"s",(int)plane.x,(int)plane.y);
				
			}
			
		}
		g.setColor(c);
	}
	
	class KeyMonitor extends KeyAdapter{    //�������̲���Ӧ

		@Override
		public void keyPressed(KeyEvent e) {
			plane.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			plane.minusDirection(e);
		}
		
	}
	//�ڲ��࣬���Է���ĵ���PlaneGame�����Ժͷ���
	//�����Ƿ������ػ�����
	class PaintThread extends Thread{
		@Override
		public void run() {
			while(true) {
				repaint();
				try {
					Thread.sleep(40);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
	//����˫��������˸����   
	private Image offScreebImage = null;
	public void update(Graphics g) {
		if(offScreebImage == null) {
			offScreebImage = this.createImage(500,500);
		}
		Graphics gOff = offScreebImage.getGraphics();
		paint(gOff);
		g.drawImage(offScreebImage, 0, 0, null);
	}
	
	
	
	public void	launchFrame() {   //����ʱ����
		this.setTitle("��ɻ�");
		this.setVisible(true);
		this.setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		this.setLocation(300, 300);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		new PaintThread().start();//�����߳�
		addKeyListener(new KeyMonitor()); //��������Ӽ��̼���
		//��ʼ���ڵ�
		for(int i = 0;i<shells.length;i++) {
			shells[i] = new Shell();
		}
	}
	
	
}
