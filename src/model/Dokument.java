
package model;

<<<<<<< .mine
import java.awt.geom.Rectangle2D;

public class Dokument extends Rectangle2D.Float {
   public java.util.Collection<Element> element;
||||||| .r265
public class Dokument {
   public java.util.Collection<Element> element;
=======
import javax.swing.tree.DefaultMutableTreeNode;

public class Dokument implements Cvor {
 // public java.util.Collection<Element> elementi;
   private String naziv;
   transient DefaultMutableTreeNode node;
  public static int brojDokumenata;
>>>>>>> .r751
   
<<<<<<< .mine
   public Dokument() {
	super(60, 60, 60, 60);
	
}
   public boolean isHit(float x, float y) {
       
       return getBounds2D().contains(x, y);
   }

   public void addX(float x) {
       
       this.x += x;
   }

   public void addY(float y) {
       
       this.y += y;
   }

   public void addWidth(float w) {
       
       this.width += w;
   }

   public void addHeight(float h) {
       
       this.height += h;
   }
}
   
  
||||||| .r265
   
   /** @pdGenerated default getter */
   public java.util.Collection<Element> getElement() {
      if (element == null)
         element = new java.util.HashSet<Element>();
      return element;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorElement() {
      if (element == null)
         element = new java.util.HashSet<Element>();
      return element.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newElement */
   public void setElement(java.util.Collection<Element> newElement) {
      removeAllElement();
      for (java.util.Iterator iter = newElement.iterator(); iter.hasNext();)
         addElement((Element)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newElement */
   public void addElement(Element newElement) {
      if (newElement == null)
         return;
      if (this.element == null)
         this.element = new java.util.HashSet<Element>();
      if (!this.element.contains(newElement))
         this.element.add(newElement);
   }
   
   /** @pdGenerated default remove
     * @param oldElement */
   public void removeElement(Element oldElement) {
      if (oldElement == null)
         return;
      if (this.element != null)
         if (this.element.contains(oldElement))
            this.element.remove(oldElement);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllElement() {
      if (element != null)
         element.clear();
   }
=======
   public DefaultMutableTreeNode getNode() {
	return node;
}

public void setNode(DefaultMutableTreeNode node) {
	this.node = node;
}


public Dokument() {
	
}
	/*
	 * public java.util.Collection<Element> getElementi() { return elementi; }
	 * public void setElementi(java.util.Collection<Element> elementi) {
	 * this.elementi = elementi; }
	 */

   @Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNaziv();
	}
public String getNaziv() {
	return naziv;
}
public void setNaziv(String naziv) {
	this.naziv = naziv;
}
@Override
public DefaultMutableTreeNode napraviCvor() {
	node=new DefaultMutableTreeNode(this);
	return node;
}

   
 
>>>>>>> .r751

