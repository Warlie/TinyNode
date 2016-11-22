/**
 * 
 */
package tinyNode;

import java.awt.*; 
import java.awt.event.*;
import java.util.stream.Stream;
import java.util.stream.*;
import java.awt.Color;
import javax.swing.*;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.List;

import tinyNode.connection.*;
import tinyNode.graphics.*;
import tinyNode.data.vCard.*;
//import java.math.*;


/**
 * @author Stefan Wegerhoff
 *
 */
public class TinyNode  extends Thread implements MouseListener {

	private JFrame master;
	private ComNode cn;
	private Evocation evo = null;
	public static TinyNode SINGLETON = null;
	
	public TinyNode()
	{
		cn = new ComNode(new DummyConnection());
	}
	
	/**
	 * 
	 * @param fct
	 * @param fc
	 * @return
	 */
	
	public static JComponent createStructurePanel(EnumFormComponentsType fct, EnumFormComponents fc)
	{
		return null;
	}
	
	public ComNode getComNode(){return cn;}
	
	/**
	 * Creates an anonymous Object, connected to ComNode to handle 
	 * various streams with one ComNode object.
	 * 
	 * @return generic StreamLine object
	 */
	public static <T> StreamLine<T> createFinalElement()
	{
		StreamLine<T> out = new StreamLine<T>()
				{
					private ComNode cn = tinyNode.TinyNode.SINGLETON.getComNode(); 
			
					@SuppressWarnings("unchecked")
					public boolean computeStream(Stream<T> stream) 
					{
						java.util.List<T> res = (List<T>) stream.collect(Collectors.toList()); ;
						String name;
						if(res.size() > 0)
							 name = res.get(0).getClass().getName();
						else
							return true;
						
						switch(name)
						{
						case "VCard" :
							cn.storeVC((List<VCard>)res);
						}
						
						return false;
					}
			
				};


				
				return out;
	}
	
	  @Override public void run()
	  {

		  master = new JFrame ();
		  master.add(new JLabel(new ImageIcon("image/index.jpg")));
		  startFrame(master);

		  //new ComNode()
		  

	      try
	      {
			  this.sleep( 2000 );
	      }
	      catch ( InterruptedException e )
	      {

	       System.out.println( "Unterbrechung in sleep()" );
	       return;
	      }
	      
	      stopFrame(master);
	      
		  master = new JFrame ();
		  master.getContentPane().setLayout(new FlowLayout());
		  //master.add(new JLabel(new ImageIcon("image/index.jpg")));
		  master.add(new JLabel(new ImageIcon("image/pen.png")));

		  master.addMouseListener(this); 
		  
		  startFrame(master);
		    while ( ! isInterrupted() )
		    {
		      

		      try
		      {
		       Thread.sleep( 500 );
		      }
		      catch ( InterruptedException e )
		      {
		       interrupt();
		       System.out.println( "Unterbrechung in sleep()" );
		      }
		    }


		  

	  }

		private void startFrame(JFrame frame)
		{
			
			frame.setUndecorated(true);
			frame.pack();
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
		}
		
		private void stopFrame(JFrame frame)
		{

			frame.setVisible(false); //you can't see me!
			frame.dispose(); //Destroy the JFrame object
		}
	
	
	/** 
	 * TODO in eine eigene Klasse packen, stoert hier
	 */
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			evo = new Evocation( EnumSpells.GROWUPANDASKFOR ,this.getComNode());
	
			master.setVisible(false);
			
			
			
			
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			 
				
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		tinyNode.TinyNode.SINGLETON = new TinyNode();
		tinyNode.TinyNode.SINGLETON.start();


	}

}
