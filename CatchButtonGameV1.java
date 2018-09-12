import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class CatchButtonGameV1 extends JFrame {
	private static int number;
	private int size = (int) ((float) (Toolkit.getDefaultToolkit().getScreenSize().width) / 3); // Set the size of GUI.
	private JButton[] gameButton = new JButton[number * number];
 
	public static void main(String[] args) {
		number = 3;
		CatchButtonGameV1 game = new CatchButtonGameV1();
		//game.start();
	}
 
	// Constructor.
	public CatchButtonGameV1() {
		super("Catch me if you can!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit when click the exit button.
		getContentPane().setBackground(new Color(90, 154, 212)); // Set the background color of window.
		setSize(size, size); // Set the size of window.
		setResizable(false); // Forbid to resize the window.
		setLocationRelativeTo(null); // Set the window in the centre of screen.
 
		initialize();
	}
 
	/**
	 *  This method will create a GridLayout panel and add buttons to it.
	 */
	private void initialize() {
		int hap = (int) ((float) (size) / 100);
		JPanel gamePanel = new JPanel(new GridLayout(number, number, hap, hap));
		gamePanel.setOpaque(false);
		for (int i = 0; i < number * number; i++) {
			gameButton[i] = new JButton();
			gamePanel.add(gameButton[i]);
		}
		this.getContentPane().add(gamePanel);
 
		MouseListener moveOn = new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				int Wooha = 0;
				for (int i = 0; i < number * number; i++) {
					if (e.getSource().equals(gameButton[i])) {
						Wooha = i;
						gameButton[i].setText("");
						gameButton[i].removeMouseListener(this);
						break;
					}
				}
 
				int j;
				//do {
					j = (int) (Math.random() * number * number);
				//} while (j == Wooha);
				gameButton[j].addMouseListener(this);
				gameButton[j].setText("Click me");
				validate();
				gamePanel.repaint();
			}
		};
 
		int i = (int) (Math.random() * number * number);
		gameButton[i].addMouseListener(moveOn);
		gameButton[i].setText("Click me");
		this.setVisible(true);
	}
 
	//private void start() {
	//	this.setVisible(true);
	//\s}
}