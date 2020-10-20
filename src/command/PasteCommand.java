/***********************************************************************
 * Module:  PasteCommand.java
 * Author:  Admir Orman
 * Purpose: Defines the Class PasteCommand
 ***********************************************************************/

package command;

import java.awt.MouseInfo;
import java.util.*;

import javax.swing.SwingUtilities;
import javax.swing.text.Utilities;
import javax.swing.tree.DefaultMutableTreeNode;

import Drawing.TabComponent;
import globalClases.ClipboardClass;
import globalClases.ToolboxGlobalClass;
import model.ActivityElement;
import model.DecisionElement;
import model.Element;
import model.EndElement;
import model.ModelModel;
import model.ObjectNodeElement;
import model.PackageElement;
import model.StartElement;
import model.SynchronizationElement;

public class PasteCommand extends CanvasCommand {
	ClipboardClass klasa =ClipboardClass.getInstance();
	TabComponent tab = klasa.getTab();
	Vector<Element>elements=new Vector<Element>();
	ModelModel model;
	Element element;
	
	
	static int j=0;
	
	public PasteCommand(ModelModel model) {
	this.model=model;
	}
   public void execute() {
	

		ClipboardClass.getInstance();
		if(ClipboardClass.isCut())
		{
		ClipboardClass.setCopy(false);
		ClipboardClass.setCut(false);

	//	for(int i = 0;i<klasa.getElement().size();i++)
		
		

		{
			int i =klasa.getElement().size()-1;
			
		 element=klasa.getElement().get(i);
			
			new NacrtajElement(model,element, tab,(int)(tab.getWidth()/10),(int)(tab.getHeight()/10),element.getNaziv()).execute();
			
			elements.add(element);
			j++;
			klasa.getElement().remove(i);
			
		}
		
		tab.repaint();
		} else {
			ClipboardClass.getInstance();
			if(ClipboardClass.isCopy())
			{

				int i =klasa.getElement().size()-1;
				 element=klasa.getElement().get(i); 
				
				new NacrtajElement(model,element, tab,(int)(tab.getWidth()/10),(int)(tab.getHeight()/10),element.getNaziv()+(Element.distNumber++)).execute();
				}
				
			}
			
		
	
		CommandHistory.pushU(this);
   }

   
   
   public void unexecute() {
int k=elements.size()-1;
if(k!=0)
{  tab.remove(elements.get(k));
	   elements.remove(elements.get(k));
		tab.repaint();
		}

		

	
}
   }