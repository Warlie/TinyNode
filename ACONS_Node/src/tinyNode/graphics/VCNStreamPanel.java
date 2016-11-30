/**
 * 
 */
package tinyNode.graphics;

import java.awt.*;
import java.util.stream.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import tinyNode.data.vCard.*;

/**
 * @author warlie
 *
 */
public class VCNStreamPanel extends AbstractStreamStructurePanel<VCard> {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6828695097608071647L;

	public VCNStreamPanel(StreamLine<VCard> sl)
	{
		this();
		this.addAntecessor(sl);
	}
	
	public VCNStreamPanel()
	{
		  //this.add(new JLabel("Ihr habt gerufen, Meister"));
		  JPanel panel1 = new JPanel();
		    panel1.add(new JLabel("Vorname"));
		    JTextField tf1 = new JTextField() ;
		    panel1.add(tf1);
		    panel1.setLayout(new GridLayout());
		    this.add(panel1);
			JPanel panel2 = new JPanel();
		    panel2.add(new JLabel("Nachname"));
		    JTextField tf2 = new JTextField() ;
		    panel1.add(tf2);
		    panel1.setLayout(new GridLayout());
		    this.add(panel2);
		    

	}

	@Override
	public boolean computeStream(Stream<VCard> stream) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
