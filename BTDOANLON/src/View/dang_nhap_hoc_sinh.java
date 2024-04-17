package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import DAO.svDAO;
import model.hocsinh;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class dang_nhap_hoc_sinh {

	JFrame frame;
	private JTextField textField_tim;
	private JTable table_DATA;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dang_nhap_hoc_sinh window = new dang_nhap_hoc_sinh();
					window.frame.setVisible(true);
					window.frame.setTitle("Học sinh");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public dang_nhap_hoc_sinh() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 204, 255));
		frame.setBounds(100, 100, 913, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NHẬP SỐ BÁO DANH.");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(383, 45, 174, 19);
		frame.getContentPane().add(lblNewLabel);
		
		textField_tim = new JTextField();
		textField_tim.setBackground(Color.WHITE);
		textField_tim.setBounds(383, 74, 174, 19);
		frame.getContentPane().add(textField_tim);
		textField_tim.setColumns(10);
		
		JButton btb_timkiem = new JButton("TÌM KIẾM");
		btb_timkiem.setBackground(new Color(102, 153, 204));
		btb_timkiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				showDataToJTable();
		        performSearch();
			}
		});
		btb_timkiem.setBounds(419, 104, 103, 38);
		frame.getContentPane().add(btb_timkiem);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 176, 800, 161);
		frame.getContentPane().add(scrollPane);
		
		table_DATA = new JTable();
		scrollPane.setViewportView(table_DATA);
		table_DATA.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"SBD", "H\u1ECD V\u00E0 T\u00EAn", "Gi\u1EDBi t\u00EDnh", "Ng\u00E0y Sinh", "\u0110\u1ECBa ch\u1EC9", "Email", "\u0110i\u1EC3m TB l\u1EDBp 9", "H\u1EA1nh ki\u1EC3m", "N\u01A1i sinh", "Tr\u01B0\u1EDDng THCS"
			}
		));
	}
	
	
	private void showDataToJTable() {
	    table_DATA.setDefaultEditor(Object.class, null);
	        DefaultTableModel model = (DefaultTableModel) (table_DATA.getModel());
	    model.setRowCount(0);
	    ArrayList<hocsinh> hocsinhs = svDAO.getAll();
	    for(hocsinh hocsinh : hocsinhs){
	        model.addRow( new Object[]{
	            hocsinh.getSbd() ,
	            hocsinh.getHovaten(), 
	            hocsinh.getGioitinh(), 
	            hocsinh.getNgaysinh(), 
	            hocsinh.getDiachi(),
	            hocsinh.getEmail(),
	            hocsinh.getDiemtb(),
	            hocsinh.getHanhkiem(),
	            hocsinh.getNoisinh(),
	            hocsinh.getTruongcap2()
	        });
	        
	                }
	    
	    }
	
	private void displaySearchResults(ArrayList<hocsinh> ketQuaTimKiem) {
	    DefaultTableModel model = (DefaultTableModel) table_DATA.getModel();
	    model.setRowCount(0);

	    for (hocsinh hocsinh : ketQuaTimKiem) {
	        model.addRow(new Object[]{
	                hocsinh.getSbd(),
	                hocsinh.getHovaten(),
	                hocsinh.getGioitinh(),
	                hocsinh.getNgaysinh(),
	                hocsinh.getDiachi(),
	                hocsinh.getEmail(),
	                hocsinh.getDiemtb(),
	                hocsinh.getHanhkiem(),
	                hocsinh.getNoisinh(),
	                hocsinh.getTruongcap2()
	        });
	    }
	}
	
	private void performSearch() {
		
	    String sbdSinhVien = textField_tim.getText();

	    // Gọi hàm tìm kiếm từ DAO
	    ArrayList<hocsinh> ketQuaTimKiem = svDAO.search(sbdSinhVien);

	    // Hiển thị kết quả trên bảng
	    displaySearchResults(ketQuaTimKiem);
	}
     
	
}

