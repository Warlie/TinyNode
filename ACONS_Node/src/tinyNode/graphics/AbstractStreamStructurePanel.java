/**
 * 
 */
package tinyNode.graphics;

import java.util.stream.Stream;

import javax.swing.*;


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
	
	
	public boolean computeStream(Stream<T> stream) {
		// TODO Auto-generated method stub
		return false;
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
