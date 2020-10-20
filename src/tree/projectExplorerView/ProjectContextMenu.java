package tree.projectExplorerView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;
import javax.swing.tree.DefaultMutableTreeNode;


import controller.ButtonActionListener;
import model.ProjectModel;

/**
 * Kontkstni meni projektata
 * @author Milica
 *
 */

public class ProjectContextMenu extends JPopupMenu {
	DefaultMutableTreeNode invokerNode;
	public DefaultMutableTreeNode getInvokerNode() {
		return invokerNode;
	}
	public void setInvokerNode(DefaultMutableTreeNode invokerNode) {
		this.invokerNode = invokerNode;
	}
	@SuppressWarnings("deprecation")
	public ProjectContextMenu() {
		
		JMenuItem saveItem=new JMenuItem("Save");
		saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_MASK));
		add(saveItem);
		
		JMenuItem saveAsItem=new JMenuItem("Save As New Project...");
		add(saveAsItem);
		
		addSeparator(); 
		
		JMenuItem detachItem=new JMenuItem("Detach from Workspace");
		this.add(detachItem);
		
		addSeparator();
		
		
		JMenuItem newModelItem=new JMenuItem("New model");
		this.add(newModelItem);
		newModelItem.setActionCommand("newModel");
		newModelItem.addActionListener(new ButtonActionListener());
		
		JMenuItem importItem=new JMenuItem("Import model");
		this.add(importItem);
		
//		JMenuItem addItem=new JMenuItem("Add ");
//		this.add(addItem);
		
		addSeparator();
		
		JMenu editJMenu=new JMenu("Edit");
		JMenuItem cutItem=new JMenuItem("Cut");
		JMenuItem copyItem=new JMenuItem("Copy");
		JMenuItem pasteItem=new JMenuItem("Paste");
		
		editJMenu.add(cutItem);
		editJMenu.add(copyItem);
		editJMenu.add(pasteItem);
		
		add(editJMenu);
	
		
		JMenuItem renameItem=new JMenuItem("Rename");
		this.add(renameItem);
		
		JMenuItem propertiesItem=new JMenuItem("Properties");
		propertiesItem.setAccelerator(KeyStroke.getKeyStroke(ActionEvent.ALT_MASK,KeyEvent.VK_ENTER));		
		add(propertiesItem);
		
		this.show();
	}

}
