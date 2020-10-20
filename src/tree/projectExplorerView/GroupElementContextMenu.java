package tree.projectExplorerView;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * Kontekstni meni za kolekcije elemenata
 * @author Milica
 *
 */


public class GroupElementContextMenu extends JPopupMenu {
	DefaultMutableTreeNode invokerNode;
	public DefaultMutableTreeNode getInvokerNode() {
		return invokerNode;
	}
	public void setInvokerNode(DefaultMutableTreeNode invokerNode) {
		this.invokerNode = invokerNode;
	}
	public GroupElementContextMenu() {
		JMenuItem newItem=new JMenuItem("New");
		add(newItem);
	}

}
