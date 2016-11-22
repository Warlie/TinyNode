package tinyNode.graphics;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class VCGender extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VCGender frame = new VCGender();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VCGender() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("New label");
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
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon("image/pen.png"));
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
}
