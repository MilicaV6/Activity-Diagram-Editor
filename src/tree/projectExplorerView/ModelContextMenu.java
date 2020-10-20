package tree.projectExplorerView;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;
import javax.swing.tree.DefaultMutableTreeNode;

import controller.ButtonActionListener;

/**
 * Kontekstni meni za modele
 * @author Milica
 *
 */


public class ModelContextMenu extends JPopupMenu {
	@SuppressWarnings("deprecation")
	DefaultMutableTreeNode invokerNode;
	public DefaultMutableTreeNode getInvokerNode() {
		return invokerNode;
	}
	public void setInvokerNode(DefaultMutableTreeNode invokerNode) {
		this.invokerNode = invokerNode;
	}
	public ModelContextMenu() {

		JMenuItem saveItem=new JMenuItem("Save");
		saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_MASK));
		add(saveItem);
		
		JMenuItem saveAsItem=new JMenuItem("Save As New Model...");
		add(saveAsItem);
		
		addSeparator(); 
		
		JMenuItem detachItem=new JMenuItem("Detach from Workspace");
		this.add(detachItem);
		
		addSeparator();
		
		JMenu newItem=new JMenu("New");
		JMenuItem newDocumentItem=new JMenuItem("Document");
		newDocumentItem.setActionCommand("newDocument");
		newDocumentItem.addActionListener(new ButtonActionListener());
		JMenuItem newactionItem=new JMenuItem("Action");
		JMenuItem newDecisionItem=new JMenuItem("Decision");
		JMenuItem newStartItem=new JMenuItem("Start");
		JMenuItem newEndItem=new JMenuItem("End");
		JMenuItem newFlowItem=new JMenuItem("Flow");
		
		newItem.add(newDocumentItem);
		newItem.add(newactionItem);
		newItem.add(newDecisionItem);
		newItem.add(newStartItem);
		newItem.add(newEndItem);
		newItem.add(newFlowItem);
		
		this.add(newItem);
		
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
		propertiesItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.ALT_MASK,KeyEvent.VK_ENTER));		
		add(propertiesItem);
		
	
	}

}
