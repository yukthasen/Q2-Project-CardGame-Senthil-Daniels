import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.Image;
	import java.awt.Toolkit;
	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;
	import java.awt.geom.AffineTransform;
	import java.net.URL;
public class Player{
	
		
		//add location attributes
	private Image img; 	
	private AffineTransform tx;
	private int x, y;
	private String fn;

	public Player() {
		img = getImage("/imgs/henry.png"); //load the image for Tree
		tx = AffineTransform.getTranslateInstance(x, y );
		init(850, 270); 				//initialize the location of the image
									//use your variables
	}

	public Player(String fileName, int x, int y) {
		img = getImage(fileName); //load the image for Tree
		tx = AffineTransform.getTranslateInstance(x, y);
		init(x, y); 				//initialize the location of the image
									//use your variables
	}
	/* update variables here */
	private void update() {

	}
	
	/* Drawing commands */
	public void paint(Graphics g) {
		//these are the 2 lines of code needed draw an image on the screen
		Graphics2D g2 = (Graphics2D) g;
		
		
		//call update to update the actually picture location
		update();
		
		
		
		
		g2.drawImage(img, tx, null);
		
		

	}

	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(0.25, 0.25);
	}

	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = Player.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}

}
