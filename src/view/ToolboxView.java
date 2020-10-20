/***********************************************************************
 * Module:  ToolboxView.java
 * Author:  Admir Orman
 * Purpose: Defines the Class ToolboxView
 ***********************************************************************/

package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ToolboxView extends JPanel {
	public ToolboxView() {
		
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(250	, 200));
		
		JButton button=new JButton();
		button.setActionCommand("nacrtaj");
		add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	MainWindow frame= (MainWindow) SwingUtilities.getWindowAncestor(((JButton)e.getSource()).getParent());
	CanvasView canvasView=frame.getCanvasView();
	
	if(e.getActionCommand()=="nacrtaj")
	{
	
	}
				
			}
		});
	}
}