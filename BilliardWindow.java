/*  
 *  Copyright (C) 2010  Luca Wehrstedt
 *
 *  This file is released under the GPLv2
 *  Read the file 'COPYING' for more information
 */

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BilliardWindow extends JFrame implements ActionListener {
	// Members
	private Billiard content;
	private Overlay overlay;
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	// Constructor
	public BilliardWindow () {
		super ();
		
		setTitle ("Billiard");
		setResizable (false);
		pack ();
		
		setSize (WIDTH + getInsets ().left + getInsets ().right,
		         HEIGHT + getInsets ().top + getInsets ().bottom);
		
		content = new Billiard ();
		setContentPane (content);
		
		overlay = new Overlay ();
		setGlassPane (overlay);
		getGlassPane ().setVisible (true);

		Timer timer = new Timer (10, this);
		timer.start ();
	}
	
	// New frame
	public void actionPerformed (ActionEvent e) {
		repaint ();
	}
}
