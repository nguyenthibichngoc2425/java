package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.Box;
import javax.swing.border.LineBorder;

import View.DangkyUsers;

public class LOGINFORM {

	JFrame frame;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGINFORM window = new LOGINFORM();
					window.frame.setVisible(true);
					window.frame.setTitle("Đăng Nhập");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LOGINFORM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 204, 255));
		frame.getContentPane().setForeground(new Color(240, 248, 255));
		frame.setBounds(100, 100, 450, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tài khoản:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(34, 127, 147, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mật Khẩu:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(35, 200, 123, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		username = new JTextField();
		username.setBackground(Color.WHITE);
		
		username.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		username.setBounds(181, 132, 195, 28);
		frame.getContentPane().add(username);
		username.setColumns(10);
	
		JButton Dangnhap = new JButton("Đăng nhập");
		Dangnhap.setBackground(new Color(102, 153, 204));
		Dangnhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String inputUsername = username.getText();
			        String inputPassword = new String(password.getPassword());
			        
			        if (inputUsername.equals("admin") && inputPassword.equals("123456")) {
			            // Đăng nhập thành công, thực hiện các hành động mong muốn
			        	thongTinTS dk = new thongTinTS();
						dk.frame.setVisible(true);
			        } else {
			            // Đăng nhập thất bại, hiển thị thông báo lỗi
			     JOptionPane.showMessageDialog(frame,"Sai mật khẩu hoặc tài khoản");
			        }
			    
			}
		});
		Dangnhap.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Dangnhap.setBounds(22, 308, 123, 21);
		frame.getContentPane().add(Dangnhap);
		
		password = new JPasswordField();
		password.setBackground(Color.WHITE);
		password.setBounds(181, 200, 195, 28);
		frame.getContentPane().add(password);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBorder(new LineBorder(new Color(0, 0, 0)));
		verticalBox.setBounds(10, 91, 416, 183);
		frame.getContentPane().add(verticalBox);
		
		JPanel panel = new JPanel();
		verticalBox.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("ĐĂNG NHẬP");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2.setBounds(136, 31, 153, 32);
		frame.getContentPane().add(lblNewLabel_2);
				
		JButton btnNewButton = new JButton("Đăng Ký");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DangkyUsers app = new DangkyUsers();
				app.frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(102, 153, 204));
		btnNewButton.setBounds(290, 308, 116, 21);
		frame.getContentPane().add(btnNewButton);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
