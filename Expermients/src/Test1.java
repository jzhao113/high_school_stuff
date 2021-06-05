import javax.swing.JApplet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Color;

public class Test1 extends JApplet implements Runnable 
{
	final int WIDTH = 700, HEIGHT =500;
	public void intit()
	{
		this.resize(WIDTH,HEIGHT);
	}
	public void paint (Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(0,0, WIDTH, HEIGHT);
	}
	public void update(Graphics g)
	{
		paint(g);
	}
        public void run()
        {
            
        }
}
