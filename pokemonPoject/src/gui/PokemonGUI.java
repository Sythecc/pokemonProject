package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class PokemonGUI extends JFrame{
	@SuppressWarnings("null")
	public void paint(Graphics g) {
	    g.drawLine(10, 10, 100, 200);
	}
	public static void main(String[] args) throws IOException {
		JFrame frame = new JFrame();
		JButton fight, back, run, move1, move2, move3, move4;
		JProgressBar yourHP;
		JProgressBar enemyHP = new JProgressBar();

		JPanel panel = new JPanel();
		fight = new JButton("Fight");
		back = new JButton("Back");
		run = new JButton("Run");
		move1 = new JButton("Move 1");
		move2 = new JButton("Move 2");
		move3 = new JButton("Move 3");
		move4 = new JButton("Move 4");
		yourHP = new JProgressBar();
		panel.setLayout(null);

		ImageIcon imageIcon = new ImageIcon(getScaledImage(new ImageIcon("img/back/egg.png").getImage(), 200, 200));
		JLabel label = new JLabel(imageIcon);
		label.setBounds(230, 10, 200, 200);
		panel.add(label);
		
		ImageIcon imageIcon1 = new ImageIcon(getScaledImage(new ImageIcon("img/back/egg.png").getImage(), 200, 200));
		JLabel label1 = new JLabel(imageIcon1);
		label1.setBounds(40, 140, 200, 200);
		panel.add(label1);

		fight.setBounds(385, 300, 100, 30);
		panel.add(fight);
		fight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				System.out.println("hahaha 9 is even");
				run.setVisible(false);
				back.setVisible(true);
				fight.setVisible(false);
				move1.setVisible(true);
				move2.setVisible(true);
				move3.setVisible(true);
				move4.setVisible(true);
			};
		});

		back.setBounds(285, 330, 100, 30);
		back.setVisible(false);
		panel.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				System.out.println("UWU Loli");
				run.setVisible(true);
				back.setVisible(false);
				fight.setVisible(true);
				move1.setVisible(false);
				move2.setVisible(false);
				move3.setVisible(false);
				move4.setVisible(false);
			};
		});

		run.setBounds(385, 330, 100, 30);
		panel.add(run);

		move1.setBounds(385, 240, 100, 30);
		move1.setVisible(false);
		move1.setToolTipText("Sup loser lmao");
		panel.add(move1);

		move2.setBounds(385, 270, 100, 30);
		move2.setVisible(false);
		move2.setToolTipText("Daddddddddddddy!\nhahahaha");
		panel.add(move2);

		move3.setBounds(385, 300, 100, 30);
		move3.setVisible(false);
		move3.setToolTipText("UUUUUUUUUUUUUUUUUUUWWWWWWWWWWWWWWWWWWWWWWWWWWUUUUUUUUUUU");
		panel.add(move3);

		move4.setBounds(385, 330, 100, 30);
		move4.setVisible(false);
		move4.setToolTipText(".");
		panel.add(move4);

		yourHP.setBounds(285, 260, 100, 20);
		yourHP.setVisible(true);
		yourHP.setString(100 + "/" + 1000);
		yourHP.setStringPainted(true);
		yourHP.setValue(90);
		yourHP.setMaximum(100);
		if (enemyHP.getValue() >= 100) {
			enemyHP.setBackground(Color.green);
		}
		if (enemyHP.getValue() <= 99 && enemyHP.getValue() >= 50) {
			enemyHP.setBackground(Color.yellow);
		}
		if (enemyHP.getValue() <= 49) {
			enemyHP.setBackground(Color.red);
		}
		panel.add(yourHP);

		enemyHP.setBounds(100, 100, 100, 20);
		enemyHP.setVisible(true);
		enemyHP.setString(468 + "/" + 1000);
		enemyHP.setStringPainted(true);
		enemyHP.setValue(80);
		enemyHP.setMaximum(100);
		int dhing = (enemyHP.getValue() / enemyHP.getMaximum()) * 100;
		if (dhing >= 70) {
			enemyHP.setBackground(Color.green);
			System.out.print(enemyHP.getValue());
		}
		if (enemyHP.getValue() <= 69 && enemyHP.getValue() >= 50) {
			enemyHP.setBackground(Color.green);
		}
		if (enemyHP.getValue() <= 49) {
			enemyHP.setBackground(Color.green);
		}
		panel.add(enemyHP);
		
		
		JLabel textLabel = new JLabel();
		textLabel.setText("yeet yeet");
		textLabel.setBounds(0,280,386,50);
		panel.add(textLabel);
		
		
		JLabel Box = new JLabel();
	    Box.getRootPane();
	    panel.add(Box);
	    
	
		frame.add(panel);
		frame.pack();
		// setLayout(null);
		frame.setDefaultCloseOperation(3);
		frame.setSize(500, 400);
		frame.setVisible(true);
		frame.setResizable(false);

	}

	private static Image getScaledImage(Image srcImg, int w, int h) {
		BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = resizedImg.createGraphics();
			
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.drawImage(srcImg, 0, 0, w, h, null);
		g2.dispose();

		return resizedImg;
	}
	

}
