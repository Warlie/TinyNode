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
public class VCGenderStreamPanel extends AbstractStreamStructurePanel<VCard> {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6828695097608071647L;

	public VCGenderStreamPanel(StreamLine<VCard> sl)
	{
		this();
		this.addAntecessor(sl);
	}
	
	public VCGenderStreamPanel()
	{

			JPanel contentPane = new JPanel();
			this.add(contentPane);

			contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
			
			JPanel panel = new JPanel();
			panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			JPanel panel_1 = new JPanel();
			panel.add(panel_1);
			panel_1.setLayout(new BorderLayout(0, 0));
			
			JLabel lblNewLabel = new JLabel(new ImageIcon("image/pen.png"));
			panel_1.add(lblNewLabel, BorderLayout.SOUTH);
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("");
			panel_1.add(rdbtnNewRadioButton, BorderLayout.NORTH);
			
			JPanel panel_2 = new JPanel();
			panel.add(panel_2);
			panel_2.setLayout(new BorderLayout(0, 0));
			
			JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
			panel_2.add(rdbtnNewRadioButton_1, BorderLayout.NORTH);
			
			JLabel lblNewLabel_1 = new JLabel("New label");
			panel_2.add(lblNewLabel_1, BorderLayout.SOUTH);
			
			JPanel panel_3 = new JPanel();
			panel.add(panel_3);
			panel_3.setLayout(new BorderLayout(0, 0));
			
			JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("");
			panel_3.add(rdbtnNewRadioButton_2, BorderLayout.NORTH);
			
			JLabel lblNewLabel_2 = new JLabel("New label");
			panel_3.add(lblNewLabel_2, BorderLayout.SOUTH);
			
			JPanel panel_4 = new JPanel();
			panel.add(panel_4);
			panel_4.setLayout(new BorderLayout(0, 0));
			
			JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("");
			panel_4.add(rdbtnNewRadioButton_3, BorderLayout.NORTH);
			
			JLabel lblNewLabel_3 = new JLabel("New label");
			panel_4.add(lblNewLabel_3, BorderLayout.SOUTH);
			contentPane.add(panel);
	}

	@Override
	public boolean computeStream(Stream<VCard> stream) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
