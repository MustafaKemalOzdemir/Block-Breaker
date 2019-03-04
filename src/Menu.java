import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Menu extends JPanel implements MouseListener {

	
	public Menu() {
		setLayout(null);
		
		JButton btnstart = new JButton("=>Start<=");
		btnstart.addMouseListener(this);
		btnstart.setBounds(455, 418, 90, 23);
		add(btnstart);
		
		JLabel lblWelcomeToBlockbreaker = new JLabel("Welcome to BlockBreaker!");
		lblWelcomeToBlockbreaker.setFont(new Font("Calibri Light", Font.PLAIN, 18));
		lblWelcomeToBlockbreaker.setBounds(381, 102, 238, 34);
		
		add(lblWelcomeToBlockbreaker);

	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		Main.removePanelFromFrame(Main.getMenu());
		Main.addPanel2Frame(Main.getPanel());
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}