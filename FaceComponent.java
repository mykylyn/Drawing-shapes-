import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class FaceComponent extends JComponent
{
  public void paintComponent(Graphics g)
  {
    Graphics2D g2 = (Graphics2D) g;

    Ellipse2D.Double head = new Ellipse2D.Double(5, 5, 400, 580);
    g2.draw(head);

    g2.setColor(Color.GREEN);
    Rectangle eye = new Rectangle(90, 150, 60, 60);
    g2.fill(eye);
    eye.translate(150,0);
    g2.fill(eye);

    Line2D.Double mouth = new Line2D.Double(70, 400, 310, 400);
    g2.setColor(Color.RED);
    g2.draw(mouth);

    g2.setColor(Color.BLUE);
    g2.drawString("Hello World!", 450, 475);
  }
}