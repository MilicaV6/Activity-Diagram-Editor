/***********************************************************************
 * Module:  MenuBarView.java
 * Author:  Admir Orman
 * Purpose: Defines the Class MenuBarView
 ***********************************************************************/

package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.MenuItem;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.*;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuBarView extends JMenuBar {
	
	

	private static final long serialVersionUID = 1L;
	JMenu[] menuBarStavke = null;
	
	public MenuBarView()
	{

		menuBarStavke = postavi_MenuBar();
		
		for(int i = 0;i<menuBarStavke.length;i++)
		{
			add(menuBarStavke[i]);
		}
		
		
		add(Box.createHorizontalStrut(Toolkit.getDefaultToolkit().getScreenSize().width-180));
		
		JButton dugme = new JButton();
		urediDugme(dugme);
		add(dugme);
		
	

	}
	public JMenu[] postavi_MenuBar()
	{
		JMenu[] menuBarStavke = new JMenu[4];
		
		menuBarStavke[0] =  new JMenu("File");
		menuBarStavke[0].setMnemonic(KeyEvent.VK_F);
		postaviFile(menuBarStavke[0]);
		
		menuBarStavke[1] =  new JMenu("Edit");
		menuBarStavke[1].setMnemonic(KeyEvent.VK_E);
		postaviEdit(menuBarStavke[1]);
		
		menuBarStavke[2] =  new JMenu("View");
		menuBarStavke[2].setMnemonic(KeyEvent.VK_V);
		postaviView(menuBarStavke[2]);
		
		menuBarStavke[3] =  new JMenu("Help");
		menuBarStavke[3].setMnemonic(KeyEvent.VK_H);
		postaviHelp(menuBarStavke[3]);
		
		return menuBarStavke;
	}
	
	
	public void postaviFile(JMenu File)
	{
		JMenuItem newProject = new JMenuItem("New Project");
		newProject.setMnemonic(KeyEvent.VK_N);
		newProject.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
		newProject.setIcon(new ImageIcon("./icons/newProject.png"));
		newProject.setActionCommand("newProject");

		JMenuItem openProject = new JMenuItem("Open Project");
		openProject.setMnemonic(KeyEvent.VK_O);
		openProject.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_MASK));
		openProject.setIcon(new ImageIcon("./icons/openProjectIcon.png"));
		openProject.setActionCommand("openProject");
		
		JMenuItem newDocument = new JMenuItem("New Document");
		newDocument.setMnemonic(KeyEvent.VK_E);
		newDocument.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_MASK));
		newDocument.setIcon(new ImageIcon("./icons/newDocument.png"));
		newDocument.setActionCommand("newDocument");

		JMenuItem openDocument = new JMenuItem("Open Document");
		openDocument.setMnemonic(KeyEvent.VK_O);
		openDocument.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_MASK+KeyEvent.SHIFT_MASK));
		openDocument.setIcon(new ImageIcon("./icons/openDocument.png"));
		openDocument.setActionCommand("openDocument");
		
		JMenuItem save = new JMenuItem("Save");
		save.setMnemonic(KeyEvent.VK_S);
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
		save.setIcon(new ImageIcon("./icons/save.png"));
		save.setActionCommand("save");
		
		JMenuItem saveAs = new JMenuItem("Save As");
		saveAs.setIcon(new ImageIcon("./icons/saveAs.png"));
		saveAs.setActionCommand("saveAs");
		
		JMenuItem renameProject = new JMenuItem("Rename Project");
		renameProject.setMnemonic(KeyEvent.VK_R);
		renameProject.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_MASK));
		renameProject.setIcon(new ImageIcon("./icons/renameIcon.png"));
		renameProject.setActionCommand("renameProject");

		JMenuItem close = new JMenuItem("Close");
		close.setMnemonic(KeyEvent.VK_C);
		close.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, KeyEvent.CTRL_MASK));
		close.setIcon(new ImageIcon("./icons/close.png"));
		close.setActionCommand("close");
		
		
		JMenuItem recentFiles = new JMenuItem("Recent Files");
		
		
		JMenuItem exit = new JMenuItem("Exit");
		exit.setMnemonic(KeyEvent.VK_X);
		exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, KeyEvent.ALT_MASK));
		exit.setIcon(new ImageIcon("./icons/exit.png"));
		exit.setActionCommand("exit");
		
		

		File.add(newProject);
		File.add(openProject);
		File.add(renameProject);
		File.addSeparator();
		File.add(newDocument);
		File.add(openDocument);
		File.addSeparator();
		File.add(save);
		File.add(saveAs);
		File.addSeparator();
		File.add(close);
		File.addSeparator();
		File.add(recentFiles);
		File.addSeparator();
		File.add(exit);		
	}
	public void postaviEdit(JMenu Edit)
	{
		JMenuItem copy = new JMenuItem("Copy");
		copy.setMnemonic(KeyEvent.VK_O);
		copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
		copy.setIcon(new ImageIcon("./icons/copy.png"));
		copy.setActionCommand("copy");
		
		JMenuItem cut = new JMenuItem("Cut");
		cut.setMnemonic(KeyEvent.VK_C);
		cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_MASK));
		cut.setIcon(new ImageIcon("./icons/cut.png"));
		cut.setActionCommand("cut");

		JMenuItem paste = new JMenuItem("Paste");
		paste.setMnemonic(KeyEvent.VK_P);
		paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_MASK));
		paste.setIcon(new ImageIcon("./icons/paste.png"));
		paste.setActionCommand("paste");

		JMenuItem undo = new JMenuItem("Undo");
		undo.setMnemonic(KeyEvent.VK_U);
		undo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_MASK));
		undo.setIcon(new ImageIcon("./icons/undo.png"));
		undo.setActionCommand("undo");

		JMenuItem redo = new JMenuItem("Redo");
		redo.setMnemonic(KeyEvent.VK_R);
		redo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, KeyEvent.CTRL_MASK));
		redo.setIcon(new ImageIcon("./icons/redo.png"));
		redo.setActionCommand("redo");
		
		
		
		JMenu selectMenu = new JMenu("Select");
		
		
		JMenuItem selectAll= new JMenuItem("Select All");
		selectAll.setMnemonic(KeyEvent.VK_A);
		selectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_MASK));
		selectAll.setIcon(new ImageIcon("./icons/SelectAllIcon.png"));
		selectAll.setActionCommand("selectAll");
		
		selectMenu.add(selectAll);
		
		JMenuItem selectGroup= new JMenuItem("Select Group");
		selectGroup.setMnemonic(KeyEvent.VK_G);
		selectGroup.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, KeyEvent.CTRL_MASK));
		selectGroup.setIcon(new ImageIcon("./icons/SelectGroupIcon.png"));
		selectGroup.setActionCommand("selectGroup");
		
		selectMenu.add(selectGroup);

		
		JMenuItem changeColor= new JMenuItem("Change Color");
		changeColor.setIcon(new ImageIcon("./icons/format_colors.png"));
		changeColor.setActionCommand("changeColor");
		
		JMenuItem deleteElememt= new JMenuItem("Delete Element");
		deleteElememt.setIcon(new ImageIcon("./icons/false.png"));
		deleteElememt.setActionCommand("deleteElememt");
		
		Edit.add(copy);
		Edit.add(cut);
		Edit.add(paste);
		Edit.addSeparator();
		Edit.add(undo);
		Edit.add(redo);
		Edit.addSeparator();
		Edit.add(selectMenu);
		Edit.addSeparator();
		Edit.add(changeColor);
		Edit.add(deleteElememt);
	}
	
	
	public void postaviView(JMenu View)
	{
		JMenuItem actualSize=new JMenuItem("Actual Size");
		actualSize.setMnemonic(KeyEvent.VK_A);
		actualSize.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, KeyEvent.ALT_MASK));
		actualSize.setActionCommand("actualSize");
		
		JMenuItem zoomIn = new JMenuItem("Zoom In");
		zoomIn.setMnemonic(KeyEvent.VK_I);
		zoomIn.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F6, KeyEvent.ALT_MASK));
		zoomIn.setIcon(new ImageIcon("./icons/zoomin.png"));
		zoomIn.setActionCommand("zoomIn");

		
		JMenuItem zoomOut = new JMenuItem("Zoom Out");
		zoomOut.setMnemonic(KeyEvent.VK_O);
		zoomOut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F7, KeyEvent.ALT_MASK));
		zoomOut.setIcon(new ImageIcon("./icons/zoomout.png"));
		zoomOut.setActionCommand("zoomOut");
		
		JMenuItem scale = new JMenuItem("Scale");
		scale.setIcon(new ImageIcon("./icons/scale.png"));
		scale.setActionCommand("scale");

		JCheckBox toolboxView = new JCheckBox("Toolbox");
		

		JMenuItem editToolbar = new JMenuItem("Edit Toolbar");
		editToolbar.setActionCommand("editToolbar");
		
		JMenuItem fileToolbar = new JMenuItem("File Toolbar");
		fileToolbar.setActionCommand("fileToolbar");
		
		View.add(actualSize);
		View.add(zoomIn);
		View.add(zoomOut);	
		View.add(scale);
		View.addSeparator();
		View.add(toolboxView);
		View.add(editToolbar);
		View.add(fileToolbar);


	}
	
	public void postaviHelp(JMenu Help) 
	{
		JMenuItem about=new JMenuItem("About");
		about.setIcon(new ImageIcon("./icons/diagram.png"));
		about.setActionCommand("about");
		
		Help.add(about);
		
	}
	public void urediDugme(JButton dugme)
	{
		dugme.setBackground(null);
		dugme.setBorder(null);
		dugme.setIcon(new ImageIcon("./icons/Help-icon.png"));
		dugme.setActionCommand("Help");
	
	}
}