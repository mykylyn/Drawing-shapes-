import java.awt.*;
import java.awt.geom.*;
import javax.swing.JComponent;
import javax.swing.*;

public class House extends JComponent
{
  public void paintComponent(Graphics g)
  {
    Graphics2D g2 = (Graphics2D) g;

		int constantRound=10;


		//Gradient

		
		// GradientPaint blueToBlack = new GradientPaint(50, 50, Color.BLUE,
  //               600, 600, Color.GREEN);
  //       g2.setPaint(blueToBlack);

		

//Grass		
		
		int grassX=0;
		int grassY=Main.Height-300;
		int grassWidth=Main.Width;
		int grassHeight=300;

		Color grassGreen=new Color(204, 213, 174);
		
		g2.setColor(grassGreen);
		
		Rectangle Grass= new Rectangle(0,grassY, grassWidth,grassHeight);

    
		g2.fill(Grass);

//House Base

		int houseX=50;
		int houseY=Main.Height-200;
		int houseWidth=Main.Width/3;
		int houseHeight=300;		

		Color houseBrown=new Color(221,161,94);
		
    g2.setColor(houseBrown);

    RoundRectangle2D house = new RoundRectangle2D.Float(houseX, houseY-houseHeight, houseWidth, houseHeight, constantRound, constantRound);
		
		g2.fill(house);

//Branch

		int branchX=50;
		int branchY=Main.Height-200;
		int branchWidth=Main.Width/3;
		int branchHeight=300;		

		Color branchBrown=new Color(128, 86, 44);
		
		g2.setColor(branchBrown);


    RoundRectangle2D Branch2=new RoundRectangle2D.Float(Main.Width-210,Main.Height-250-300,50,300,10,10);
		
		g2.fill(Branch2);
		
//Top of the Tree		

		int topOfTreeX=Main.Width-210-150+25;
		int topOfTreeY=Main.Height-200;
		int topOfTreeWidth=Main.Width/3;
		int topOfTreeHeight=300;		

		Color topOfTreeBrown=new Color(128, 86, 44);
		
		g2.setColor(new Color(88, 129, 87));

		
	Shape topOfTree= new Ellipse2D.Double(topOfTreeX,Main.Height-250-300-300+20,300,300);
                                                        		//half                     //BUFFER
		g2.fill(topOfTree);

		int WidthOfH=50+Main.Width/3;

		g2.setColor(new Color(188, 108, 37));
		
		Polygon Roof= new Polygon(new int[] {50,WidthOfH/2+23 , 50+Main.Width/3}, new int[] {Main.Height-200-300, 300, Main.Height-200-300}, 3);
		g2.fill(Roof);

		
    // eye.translate(150,0);
    // g2.fill(eye);

    // Line2D.Double mouth = new Line2D.Double(70, 400, 310, 400);
    // g2.setColor(Color.RED);
    // g2.draw(mouth);

		
    g2.setColor(Color.BLACK);
    g2.drawString("Michael. L", Main.Width-100, Main.Height-50);
  }
}