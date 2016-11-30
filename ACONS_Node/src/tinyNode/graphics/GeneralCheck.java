package tinyNode.graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.JPanel;
import javax.swing.JFrame;

import tinyNode.data.vCard.VCard;

import javax.swing.JButton;

public class GeneralCheck extends AbstractStreamStructurePanel<VCard> implements ActionListener  {

	JButton btnFertig;
	JButton btnAbbrechen;	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4979879517714001264L;

	/**
	 * Create the panel.
	 */
	
	public GeneralCheck(StreamLine<VCard> sl)
	{
		this();
		this.addAntecessor(sl);
	}
	
	public GeneralCheck() {
		
		btnFertig = new JButton("Fertig");
		btnFertig.addActionListener(this);
		add(btnFertig);
		
		btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.addActionListener(this);
		add(btnAbbrechen);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
        if(ae.getSource() == this.btnFertig){
            System.out.println(("Button 1 wurde betätigt"));
        }
        else if(ae.getSource() == this.btnAbbrechen){
        	tinyNode.TinyNode.SINGLETON.interruptSpell();
        }
	}

}
