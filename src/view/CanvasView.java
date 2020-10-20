/***********************************************************************
 * Module:  CanvasView.java
 * Author:  Admir Orman
 * Purpose: Defines the Class CanvasView
 ***********************************************************************/

package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Timer;

import javax.swing.JPanel;

import model.Dokument;
import model.Element;

public class CanvasView extends JPanel implements ActionListener {
	/*
	 * private Rectangle2D rect; private Ellipse2D elipse; private float alphaRect;
	 * private float alphaEllipse;
	 */
	
	
	 
	 private void doDrawing(Graphics g) {

		 Graphics2D g2d = (Graphics2D) g.create();

	        RenderingHints rh
	                = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
	                        RenderingHints.VALUE_ANTIALIAS_ON);

	        rh.put(RenderingHints.KEY_RENDERING,
	                RenderingHints.VALUE_RENDER_QUALITY);

	        g2d.setRenderingHints(rh);
	        g2d.setPaint(Color.red);
	        
	        Element element=new Element(30,30,30,30);
	        element.setNaziv("Moj element");
	        g2d.fill(element);
	        
	        Dokument dokument=new Dokument();
	        g2d.fill(dokument);
	       g2d.rotate(Math.PI/4);
	        g2d.fill(dokument);

	      
	       
	        
	        g2d.dispose();
	    }	
	 @Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		doDrawing(g);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		
	}
}