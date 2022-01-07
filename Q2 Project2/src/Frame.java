import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Frame extends JPanel implements ActionListener, MouseListener, KeyListener {
	
	
	//CREATE THE OBJECT (STEP 1)
	Background 	bg 	= new Background();
	Player henry = new Player();
	Player kat = new Player("/imgs/kat.PNG", 0, 250);
	
	//back side (common for all cards) Card baseCard = new Card();
	Card backSide = new Card("/imgs/back of card.png", 190, 250);
	Card backTwo = new Card("/imgs/back of card.png", 330, 250);
	Card backThree = new Card("/imgs/back of card.png", 470, 250);
	Card backFour = new Card("/imgs/back of card.png", 610, 250);
	Card backFive = new Card("/imgs/back of card.png", 750, 250);
	
	//front sides of cards
	static Card cardOne = new Card();
	static Card cardTwo = new Card("/imgs/rabiddog.png", 330, 250);
	static Card cardThree = new Card("/imgs/crow coven card.png", 470, 250);
	static Card cardFour = new Card("/imgs/spryserpentcard4.png", 610, 250);
	static Card cardFive = new Card("/imgs/ruderaccooncard5.png", 750, 250);
	

	
	Font f1 = new Font(Font.SERIF, Font.PLAIN, 50);
	int score1 = 0;//kat's score
	int score2 = 0;//henry's score
	
	
	
   //array created to access list of card objects to flip random cards
    	Card[] mixedArray = {cardOne, cardOne, cardTwo, cardThree, cardFour, cardFive};


	public void paint(Graphics g) {
		super.paintComponent(g);
		bg.paint(g);
		henry.paint(g);
		kat.paint(g);
		
		//painting scores
		g.setFont(f1);
		g.setColor(Color.white);
		g.drawString("Kat's score: "+score1, 80,130);
		g.drawString("Henry's score: "+score2, 600,130);
		
	
		
		//painting cards
		cardOne.paint(g);
		cardTwo.paint(g);
		cardThree.paint(g);
		cardFour.paint(g);
		cardFive.paint(g);
		
		//will only paint message of who wins when score is 10
		if(score1>=5 || score2>=5) {
			if(score1>score2) {
				g.drawString("You win!!! Play again", 400, 500);
			}else if(score1==score2) {
				g.drawString("You and Henry tied...Play again", 400, 500);
			}else {
				g.drawString("Oh no! Henry won :( Play again", 400, 500);
			}
		}
		
		
		
		
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
	
Random rnd = new Random();
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
		//if up or down arrow is pressed card is flipped and score is updated 
		if (arg0.getKeyCode()==38) {
			backSide.flipped();
			backTwo.flipped();
			backThree.flipped();
			backFour.flipped();
			backFive.flipped();
			int elm = rnd.nextInt((5-1)+1)+1;//picks random cards
			mixedArray[elm].flipped();
			score1 += elm;
		}
		if(arg0.getKeyCode()==40) {
			backSide.flipped();
			backTwo.flipped();
			backThree.flipped();
			backFour.flipped();
			backFive.flipped();
			int elm = rnd.nextInt((5-1)+1)+1;
			mixedArray[elm].flipped();
			score2 += elm;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
