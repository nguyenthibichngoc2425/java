package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JPanel;

public class DangkyUsers {

	JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangkyUsers window = new DangkyUsers();
					window.frame.setVisible(true);
					window.frame.setTitle(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DangkyUsers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 204, 255));
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 18));
		frame.setBounds(100, 100, 409, 393);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ĐĂNG KÝ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(135, 25, 125, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tên đăng nhập: ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(30, 127, 129, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mật Khẩu: ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(30, 193, 107, 24);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBackground(UIManager.getColor("Button.background"));
		textField.setBounds(190, 121, 141, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(UIManager.getColor("Button.background"));
		passwordField.setBounds(190, 182, 141, 30);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton_1 = new JButton("Hoàn tất");
		btnNewButton_1.setBackground(new Color(102, 153, 204));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGINFORM lf = new LOGINFORM();
				lf.frame.setVisible(true);
				
				
			}
		});
		btnNewButton_1.setBounds(190, 301, 107, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBackground(new Color(255, 255, 255));
		verticalBox.setBorder(new LineBorder(new Color(0, 0, 0)));
		verticalBox.setBounds(10, 65, 375, 193);
		frame.getContentPane().add(verticalBox);
		
		JPanel panel = new JPanel();
		verticalBox.add(panel);
	}
}
