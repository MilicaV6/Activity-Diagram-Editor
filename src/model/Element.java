/***********************************************************************
 * Module:  Element.java
 * Author:  Admir Orman
 * Purpose: Defines the Class Element
 ***********************************************************************/

package model;

<<<<<<< .mine
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
||||||| .r265
public class Element implements command.Command {
=======
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.Vector;
>>>>>>> .r751

<<<<<<< .mine
public class Element extends Ellipse2D.Float implements command.Command {

	String naziv;
	public String getNaziv() {
		return naziv;
	}


	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}


	public Element(float x,float y,float w, float h) {
		super(x, y, w, h);
		
	}
	
	
||||||| .r265
=======
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;

import Drawing.DragLineClass;
import Drawing.TabComponent;
import globalClases.ToolboxGlobalClass;
import mouseListeners.PanelMouseListener;
import views.ObserverInterface;

public abstract class Element extends JPanel implements command.Command,Cvor {

	public String naziv = null;
	public String comment = null;
	public String code = null;
	public String keywords = null;
	public static boolean pomjeranje = false;
	public  ArrayList<DragLineClass> lista = new ArrayList<DragLineClass>();
	Dokument dokument;
	DefaultMutableTreeNode node;
	public static int distNumber;
	public DefaultMutableTreeNode getNode() {
		return node;
	}

	public void setNode(DefaultMutableTreeNode node) {
		this.node = node;
	}

	private Vector<ObserverInterface> interfaces=new Vector<ObserverInterface>();
	
	public Dokument getDokument() {
		return dokument;
	}

	public void setDokument(Dokument dokument) {
		this.dokument = dokument;
	}

	public Vector<ObserverInterface> getInterfaces() {
		return interfaces;
	}

	public void setInterfaces(Vector<ObserverInterface> interfaces) {
		this.interfaces = interfaces;
	}

	public Element()
	{
		
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e)
			{
				Element element = (Element) e.getSource();
				TabComponent trenutniPanel = (TabComponent) element.getParent();
			
				if(ToolboxGlobalClass.getInstance().isSelect())
				{
				Point tacka1 = new Point((int)getLocation().getX()+getWidth()/2,(int)getLocation().getY()+getHeight()-10);
				Point tacka2 = new Point((int)getLocation().getX()+getWidth()/2,(int)getLocation().getY()+10);
						
				for(int i = 0;i<trenutniPanel.getFlows().size();i++)
				{
					if((trenutniPanel.getFlows().get(i).getX() == tacka1.getX() && trenutniPanel.getFlows().get(i).getY() == tacka1.getY()))
					{
						pomjeranje = true;
						lista.add(new DragLineClass(i,true,false,tacka1));		
					}
					else if((trenutniPanel.getFlows().get(i).getX() == tacka2.getX() && trenutniPanel.getFlows().get(i).getY() == tacka2.getY()))
					{
						pomjeranje = true;
						lista.add(new DragLineClass(i,false,true,tacka2));		
					}
					
				}
				e.translatePoint((int)e.getComponent().getLocation().getX()-e.getComponent().getWidth()/2,(int)e.getComponent().getLocation().getY()-e.getComponent().getHeight()/2);
				setLocation((int)e.getPoint().getX(),(int)e.getPoint().getY());	
				if(pomjeranje == true)
					{
					for(int i = 0;i<lista.size();i++)
					{
						if(lista.get(i).gornji)
						{
							trenutniPanel.getFlows().set(lista.get(i).getPozicija(), new Point((int)e.getComponent().getLocation().getX()+e.getComponent().getWidth()/2,(int)e.getComponent().getLocation().getY()+e.getComponent().getHeight()-10));
		
						}
						else if(lista.get(i).donji)
						{
							trenutniPanel.getFlows().set(lista.get(i).getPozicija(), new Point((int)e.getComponent().getLocation().getX()+e.getComponent().getWidth()/2,(int)e.getComponent().getLocation().getY()+10));
		
						}
					   
						trenutniPanel.repaint();
					}
					lista.clear();
					}

				}
			}
		});
		addMouseListener(new PanelMouseListener());
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
>>>>>>> .r751
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNaziv();
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}
<<<<<<< .mine


	@Override
	public Rectangle2D getBounds2D() {
		// TODO Auto-generated method stub
		return super.getBounds2D();
	}


	@Override
	public double getX() {
		// TODO Auto-generated method stub
		return super.getX();
	}


	@Override
	public double getY() {
		// TODO Auto-generated method stub
		return super.getY();
	}


	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return super.getWidth();
	}


	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return super.getHeight();
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return super.isEmpty();
	}


	@Override
	public void setFrame(double x, double y, double w, double h) {
		this.x=(float) x;
		this.y=(float) y;
		this.width=(float) w;
		this.height=(float) h;
		
	}
||||||| .r265
=======
	@Override
	public DefaultMutableTreeNode napraviCvor() {
		node=new DefaultMutableTreeNode(this);
		return (node);
	}
	
	public void notifyAllObservers() {
		
		for (ObserverInterface observerInterface : interfaces) {
			observerInterface.update();
			
		}
		
	}
>>>>>>> .r751
}