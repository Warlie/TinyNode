/**
 * 
 */
package tinyNode.graphics;

import java.util.stream.Stream;

import javax.swing.*;

import tinyNode.connection.BrokenStreamException;


/**
 * @author warlie
 *
 */
public abstract class AbstractStreamStructurePanel<T> extends JPanel implements StreamLine<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7461273589358133436L;
	private StreamLine<T> antecessor;
	private StreamLine<T> successor;
	protected Stream<T> stream;
	protected AutoFrameGraphic<T> afg;
	
	
	protected void setAutoFrame(AutoFrameGraphic<T> frame){ this.afg = frame;}
	
	public boolean computeStream(Stream<T> stream) {
		// TODO Auto-generated method stub
		return false;
	}	
	

	public Stream<T> getStream() throws BrokenStreamException {
		
		System.out.println(this.getClass().getName());
		
		if(this.antecessor != null)
			stream = this.antecessor.getStream();
		else
		{
			System.out.println(this.getClass().getName() + " has no antecessor");
			stream = null;
			throw new BrokenStreamException();
		}
		
		return stream;
	}
	
	
	public void addAntecessor(StreamLine<T> ante)
	{
		this.antecessor = ante;
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
	
}
