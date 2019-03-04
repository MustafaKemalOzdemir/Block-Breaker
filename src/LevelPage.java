import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class LevelPage extends JPanel{
	private int level=0;

	
	
	public LevelPage() {
		setLayout(null);
		
		JButton Button_1 = new JButton("01");
		Button_1.setBounds(50, 50, 50, 50);
		add(Button_1);
		
		JButton Button_2 = new JButton("02");
		Button_2.setBounds(110, 50, 50, 50);
		add(Button_2);
		
		JButton Button_3 = new JButton("03");
		Button_3.setBounds(170, 50, 50, 50);
		add(Button_3);
		
		JButton Button_4 = new JButton("04");
		Button_4.setBounds(230, 50, 50, 50);
		add(Button_4);
		
		JButton Button_5 = new JButton("05");
		Button_5.setBounds(290, 50, 50, 50);
		add(Button_5);
		
		JLabel lblNewLabel = new JLabel("Choose Level:");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel.setBounds(50, 11, 104, 14);
		add(lblNewLabel);
		Button_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				
				setLevel(1);
				
			
				
				
				
				
			}
		});
		Button_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setLevel(2);
			
				
				
				
			}
			
		});
		Button_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setLevel(3);
				
			}
		});
		Button_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setLevel(4);
				
			}
		});
		Button_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setLevel(5);
				
			}
		});

	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}


}
