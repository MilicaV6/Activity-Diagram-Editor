package views;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.border.Border;

public class ViewToolBar  extends JToolBar{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton zoomin;
	JButton zoomout;
	JButton scale;
	
	public JButton getZoomin() {
		return zoomin;
	}

	public void setZoomin(JButton zoomin) {
		this.zoomin = zoomin;
	}

	public JButton getZoomout() {
		return zoomout;
	}

	public void setZoomout(JButton zoomout) {
		this.zoomout = zoomout;
	}

	public JButton getScale() {
		return scale;
	}

	public void setScale(JButton scale) {
		this.scale = scale;
	}

	public ViewToolBar()
	{
		setFloatable(false);
		setBackground(Color.decode("#E9FDFF"));
		
		zoomin = new JButton();
		zoomin.setBackground(Color.decode("#E9FDFF"));
		zoomin.setIcon(new ImageIcon("./icons/zoomin.png"));
		zoomin.setBorderPainted(false);
		zoomin.setToolTipText("Zoom In");
		add(zoomin);
		addSeparator();
		
		 zoomout = new JButton();
		zoomin.setBackground(Color.decode("#E9FDFF"));
		zoomout.setIcon(new ImageIcon("./icons/zoomout.png"));
		zoomout.setBorderPainted(false);
		zoomout.setToolTipText("Zoom Out");
		add(zoomout);
		
		scale = new JButton();
		scale.setBackground(Color.decode("#E9FDFF"));
		scale.setIcon(new ImageIcon("./icons/scale.png"));
		scale.setBorderPainted(false);
		scale.setToolTipText("Scale");
		add(scale);
		
	}
	
	
}
