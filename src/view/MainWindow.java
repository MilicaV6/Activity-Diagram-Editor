/***********************************************************************
 * Module:  MainWindow.java
 * Author:  Admir Orman
 * Purpose: Defines the Class MainWindow
 ***********************************************************************/

package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import tree.projectExplorerView.ProjectExplorerView;

public class MainWindow extends JFrame  {
  
	private static final long serialVersionUID = 1L;
	
public ProjectExplorerView projectExplorerView;
   public CanvasView canvasView;
   public CanvasView getCanvasView() {
	return canvasView;
}

public void setCanvasView(CanvasView canvasView) {
	this.canvasView = canvasView;
}

public ToolboxView toolboxView;
   public StatusBarView statusBarView;
   public MenuBarView menuBarView;
   public ToolbarView toolbarView;
   
   public MainWindow()
   {
	   setLayout(new BorderLayout());
	   setTitle("Activity Diagram Editor");
	   
	   Toolkit toolkit=Toolkit.getDefaultToolkit();
	   Image icon=toolkit.getImage("icons/diagram.png");
	   setIconImage(icon);
	   
	   setJMenuBar(new MenuBarView());
	   setExtendedState(JFrame.MAXIMIZED_BOTH); 
	   setDefaultCloseOperation(EXIT_ON_CLOSE);
	   
	   toolboxView=new ToolboxView();
	   
	  add(toolboxView,BorderLayout.WEST);
	  
	  CanvasView canvasView=new CanvasView();
	  add(canvasView,BorderLayout.CENTER);
	   
		try {
            // Set System L&F
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");    } 
			catch (UnsupportedLookAndFeelException e) {
		       // handle exception
		    }
		    catch (ClassNotFoundException e) {
		       // handle exception
		    }
		    catch (InstantiationException e) {
		       // handle exception
		    }
		    catch (IllegalAccessException e) {
		       // handle exception
		    }
   }

}