import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Frame extends JPanel implements ActionListener, MouseListener, KeyListener {
	
	
	//CREATE THE OBJECT (STEP 1)
	Background 	bg 	= new Background();
	Player henry = new Player();
	Player kat = new Player("/imgs/kat.PNG", 0, 250);
	
	//back side (common for all cards) Card baseCard = new Card();
	Card backSide = new Card("/imgs/back of card.png", 100, 100);
	Card backTwo = new Card("/imgs/back of card.png", 100, 100);
	Card backThree = new Card("/imgs/back of card.png", 190, 100);
	Card backFour = new Card("/imgs/back of card.png", 280, 100);
	Card backFive = new Card("/imgs/back of card.png", 370, 100);
	Card backSix = new Card("/imgs/back of card.png", 370, 100);

	Card cardOne = new Card();
	Card cardTwo = new Card("/imgs/rabiddog.png", 100, 100);
	Card cardThree = new Card("/imgs/rabiddog.png", 190, 100);
	Card cardFour = new Card("/imgs/spryserpentcard4.png", 280, 100);
	Card cardFive = new Card("/imgs/ruderaccooncard5.png", 370, 100);

	
	Font f1 = new Font(Font.SERIF, Font.PLAIN, 50);
	int score = 10;

	public void paint(Graphics g) {
		super.paintComponent(g);
		bg.paint(g);
		henry.paint(g);
		kat.paint(g);
		backSide.paint(g); 
		backTwo.paint(g); 
		backThree.paint(g); 
		backFour.paint(g);
		backFive.paint(g);;
		//playerOne.paint(g);
		//cardOne.paint(g);
		//cardTwo.paint(g);
		//cardThree.paint(g);
		//cardFour.paint(g);
		//cardFive.paint(g);
	}
	public static void main(String[] arg) {
		Frame f = new Frame();
	}
	
	public Frame() {
		JFrame f = new JFrame("Crossy Street");
		f.setSize(new Dimension(1000, 700));
		f.setBackground(Color.blue);
		f.add(this);
		f.setResizable(false);
		f.setLayout(new GridLayout(1,2));
		f.addMouseListener(this);
		f.addKeyListener(this);
		Timer t = new Timer(16, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
			System.out.println(arg0.getKeyCode());

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
