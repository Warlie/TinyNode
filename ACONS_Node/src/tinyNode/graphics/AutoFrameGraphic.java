package tinyNode.graphics;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.FlowLayout;
import java.awt.AlphaComposite;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.*;
import java.util.stream.Stream;
import tinyNode.connection.*;

public class AutoFrameGraphic<T> extends JFrame implements StreamLine<T>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6736547436156460381L;
	private Vector<AbstractStreamStructurePanel<T>> panelField;
	private AbstractStreamStructurePanel<T> start;
	private AbstractStreamStructurePanel<T> stop;
	private StreamLine<T> antecessor;
	private StreamLine<T> successor;
	
	
	public AutoFrameGraphic(Vector<AbstractStreamStructurePanel<T>> ssp, ComNode connection)
	{
		
		this.setLayout(new FlowLayout());
		AbstractStreamStructurePanel<T> help = null;
		panelField = ssp;
		
		//setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
		
		start = ssp.firstElement();
		stop = ssp.lastElement();
		
		
		for ( Iterator<AbstractStreamStructurePanel<T>> it = ssp.iterator(); it.hasNext(); )
			  {
				this.add( it.next() );
				//it.next().addAntecessor(help);
				//help = it.next();
			  }

		
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
	


	
	
}