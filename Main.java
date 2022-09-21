import javax.swing.JFrame;

public class Main
{

	static int Width=1000;
	static int Height=1000;
  public static void main(String[] args)

  {
    JFrame frame = new JFrame();


    frame.setSize(Width, Height);
    frame.setTitle("Welcome to My House");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    FaceComponent component = new FaceComponent();
		House house=new House();
		
    frame.add(house);

    frame.setVisible(true);
  }
}