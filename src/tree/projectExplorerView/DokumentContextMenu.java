package tree.projectExplorerView;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * Kontekstni meni za dokumente
 * @author Milica
 *
 */

public class DokumentContextMenu extends JPopupMenu {
	DefaultMutableTreeNode invokerNode;
	public DefaultMutableTreeNode getInvokerNode() {
		return invokerNode;
	}
	public void setInvokerNode(DefaultMutableTreeNode invokerNode) {
		this.invokerNode = invokerNode;
	}
	public DokumentContextMenu() {
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
