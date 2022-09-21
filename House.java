import java.awt.*;
import java.awt.geom.*;
import javax.swing.JComponent;

public class House extends JComponent
{
  public void paintComponent(Graphics g)
  {
    Graphics2D g2 = (Graphics2D) g;

    // Ellipse2D.Double head = new 					  		Ellipse2D.Double(5, 5, 400, 580);
    // g2.draw(head);

		g2.setColor(new Color(204, 213, 174));
		
		Rectangle Grass= new Rectangle(0,Main.Height-300,Main.Width,300);
	// Rectangle Body = new Rectangle(Main.Width/3, Main.Height/5, 400, 300);

		
    
		g2.fill(Grass);

    g2.setColor(new Color(221,161,94));
		// Rectangle Body = new Rectangle(50, Main.Height-?500,Main.Width-600, Main.Height/4);
    RoundRectangle2D Body = new RoundRectangle2D.Float(50, Main.Height-200-300, Main.Width/3, 300, 10, 10);
		g2.fill(Body);


		g2.setColor(new Color(178, 117, 55));

		// RoundedRectangle2D Branch=new RoundedRectangle2D.Float(Main.Width-200,Main.Height-250-350,50,350,10,10);
		// g2.fill(Branch);

		g2.setColor(Color.red);
		Rectangle Branch2=new Rectangle(Main.Width-210,Main.Height-250,10,10);
		g2.fill(Branch2);
		
    // eye.translate(150,0);
    // g2.fill(eye);

    // Line2D.Double mouth = new Line2D.Double(70, 400, 310, 400);
    // g2.setColor(Color.RED);
    // g2.draw(mouth);

    g2.setColor(Color.BLACK);
    g2.drawString("Michael. L", Main.Width-100, Main.Height-50);
  }
}