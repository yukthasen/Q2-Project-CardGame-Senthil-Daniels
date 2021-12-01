import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.Image;
	import java.awt.Toolkit;
	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;
	import java.awt.geom.AffineTransform;
	import java.net.URL;
public class Card {
	
		//NEED TO ASSIGN EACH CARD A SPECIFIC VALUE (EXCEPT BACK SIDE)
		//add location attributes
	private Image img, img2; 	
	private AffineTransform tx;
	private int x, y;
	private String fn;
	private boolean flipped = false;
	

	public Card() {
		img = getImage("/imgs/sleeping doe card.png"); //load the image for Tree
		img2 = getImage("/imgs/back of card.png"); //load the image for Tree
		tx = AffineTransform.getTranslateInstance(x, y );
		init(245, 280); 				//initialize the location of the image
									//use your variables
	}

	public Card(String fileName, int x, int y) {
		this.x = x;
		this.y = y;
		img = getImage("/imgs/sleeping doe card.png"); //load the image for Tree
		img2 = getImage("/imgs/back of card.png"); //load the image for Tree
		tx = AffineTransform.getTranslateInstance(x, y);
		init(x, y); 				//initialize the location of the image
									//use your variables
	}
	/* update variables here */
	private void update() {
		tx.setToTranslation(x,y);
		tx.scale(0.5, 0.5);
	}
	
	/* Drawing commands */
	public void paint(Graphics g) {
		//these are the 2 lines of code needed draw an image on the screen
		Graphics2D g2 = (Graphics2D) g;
		
		
		//call update to update the actually picture location
		update();
		
		if(flipped) {
			g2.drawImage(img, tx, null);
		}else {
			g2.drawImage(img2, tx, null);
		}
		

	}

	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(0.5, 0.5);
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
