package tinyNode.graphics;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.FlowLayout;
import java.awt.AlphaComposite;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.*;
import java.util.stream.Stream;
import tinyNode.connection.*;

public class AutoFrameGraphic<T> extends JFrame implements StreamLine<T>, Castable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6736547436156460381L;
	private Vector<AbstractStreamStructurePanel<T>> panelField;
	private ComNode con;
	private AbstractStreamStructurePanel<T> start;
	private AbstractStreamStructurePanel<T> stop;
	private StreamLine<T> antecessor;
	private StreamLine<T> successor;
	
	
	public AutoFrameGraphic(Vector<AbstractStreamStructurePanel<T>> ssp, ComNode connection)
	{
		con = connection;
		BoxLayout boxLayout = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS); // top to bottom
		this.setLayout(boxLayout);
		//JPanel Container panel = this.getContentPane();
		//this.setLayout(new FlowLayout());
		//this.setLayout(new GridBagLayout());

        //panel.setAlignmentX(Component.LEFT_ALIGNMENT);
        //panel.setAlignmentY(Component.TOP_ALIGNMENT);
        //BoxLayout layout = new BoxLayout(panel, BoxLayout.PAGE_AXIS);
        //panel.setLayout(layout);


		
		AbstractStreamStructurePanel<T> help1 = null;
		AbstractStreamStructurePanel<T> help2 = null;
		boolean notFirst = false;
		panelField = ssp;
		
		//setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
		
		start = ssp.firstElement();
		stop = ssp.lastElement();
		
		
		for ( Iterator<AbstractStreamStructurePanel<T>> it = ssp.iterator(); it.hasNext(); )
			  {

				
				if(help1 != null)
				{
					help2 = help1;
				}

					help1 = it.next();
					this.add( help1 );	
					help1.setAutoFrame(this);
					
					if(help2 != null)help2.addAntecessor(help1);
				
				//it.next().addAntecessor(help);
				
			  }
System.out.println(stop.getClass().getName());
	try
	{	
		System.out.println(stop.getStream().count());
	}
	catch(BrokenStreamException e)
	{}
	}

	public void addAntecessor(AbstractStreamStructurePanel<T> ante)
	{
		this.antecessor = ante;
	}
	
	public void addAntecessor(AutoFrameGraphic<T> ante)
	{
		this.antecessor = ante;	
	}
	
	public void addsuccessor(AbstractStreamStructurePanel<T> suc)
	{
		this.successor = suc;
	}
	
	public void addsuccessor(AutoFrameGraphic<T> suc)
	{
		this.successor = suc;
	}

	@Override
	public boolean computeStream(Stream<T> stream) {
		// TODO Auto-generated method stub
		return false;
	}

	public Stream<T> getStream() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void castSpell() 
	{

	}


	public void interruptSpell() 
	{
		this.dispose();
		
	}



	


	
	
}