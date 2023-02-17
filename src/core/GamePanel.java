package core;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {		//class for panel
	Thread gameThread;
	final int FPS = 60;
	
	
	public GamePanel() {						
		this.setBackground(Color.BLACK);
		this.setDoubleBuffered(true);
		this.setFocusable(true);
		
		gameThread = new Thread();				//initializing the thread
		gameThread.start();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.fillRect(400, 400, 200, 200);
		g.dispose();
	}

	@Override
	public void run() {
		double drawInterval=1000000000/FPS;
		long lastTime=System.nanoTime();
		long timer=0;
		int drawCount=0;
		
		start();
		while(gameThread!=null) 
		{			
		Time.time=System.nanoTime();
		Time.dt+=(Time.time-lastTime)/drawInterval;
		timer+=(Time.time-lastTime);		
		lastTime=Time.time;
		
		   if(Time.dt>=1){
				
			  update();			
			  repaint();
			
		      Time.dt--;		
		      drawCount++;
		    }
	  	if(timer>=1000000000) {
			//System.out.println("FPS"+drawCount);
			drawCount=0;
			timer=0;
		}
		}
	}
	
	public void start() {								//here game can be initialized
		
	}
	
	
	public void update() {								//here game logic is updated

	}
}
