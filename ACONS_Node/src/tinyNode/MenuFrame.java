package tinyNode;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.FlowLayout;
import java.awt.AlphaComposite;
import javax.swing.JPanel;

public class MenuFrame extends JPanel implements MouseListener
{
	private JPanel spielfeld;
	//private Trommel trommel;
	
	MenuFrame()
	{
		
		super(new FlowLayout());
		setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
		//spielfeld = new JPanel();
		
	}
	
    @Override
    protected void paintComponent(Graphics g) {

        // Allow super to paint
        super.paintComponent(g);

        // Apply our own painting effect
        Graphics2D g2d = (Graphics2D) g.create();
        // 50% transparent Alpha
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));

        g2d.setColor(getBackground());
        g2d.fill(getBounds());

        g2d.dispose();

    }
	
	public void setSpielfeld(JPanel spielfeld)
	{
		this.spielfeld = spielfeld;
	}
/*
	public void setTrommel(Trommel trommel)
	{
		this.trommel = trommel;
	}
	*/
	/*public Kreis SchlagAusgefuehrt()
	{
		return null;
		
	}*/

	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
		 
			int mx = e.getX(); 
			int my = e.getY(); 
			System.out.println("mousePressed:x-" + mx + " y-"+ my);
			//Kreis kreis = new Kreis(mx, my, Color.BLUE, trommel.getRadius(mx, my)); //
			//trommel.addKreis(kreis);
			
			//this.spielfeld.add(kreis);
			//this.spielfeld.repaint();
			
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}