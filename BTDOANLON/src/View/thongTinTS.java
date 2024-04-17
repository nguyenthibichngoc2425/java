package View;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.TextField;

import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import Controller.QLTS10Controller;
import DAO.svDAO;
import model.hocsinh;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.Action;
import javax.swing.table.TableColumn;
import javax.swing.UIManager;





public class thongTinTS {
	Action action = new QLTS10Controller();
	
	JFrame frame;
	private JTextField textField_hvt;
	private JTextField textField_ngaysinh;
	private JTextField textField_noisinh;
	private JTextField textField_diachi;
	private JTextField textField_email;
	private JTextField textField_thcs;
	private JTable table;
	private JTextField textField_diemthi;
	private JTextField textField_hanhkiem;
	private JTextField textField_sbd;
	private JTable table_1;
	private JTextField textField_10;
	DefaultTableModel model;

	private JTextField textField_GioiTinh;
	
	/**
	 * Launch the application.
	 */
	
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					thongTinTS window = new thongTinTS();
					window.frame.setVisible(true);
					window.frame.setTitle("Thông tin tuyển sinh");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public thongTinTS() {
		initialize();
		
		showDataToJTable();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 204, 255));
		frame.setBackground(SystemColor.activeCaption);
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 18));
		frame.setBounds(30, 100, 1475, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblhovaten = new JLabel("Họ và Tên:");
		lblhovaten.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblhovaten.setBounds(25, 24, 109, 23);
		frame.getContentPane().add(lblhovaten);
		
		JLabel lblngaysinh = new JLabel("Ngày sinh:");
		lblngaysinh.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblngaysinh.setBounds(25, 99, 142, 26);
		frame.getContentPane().add(lblngaysinh);
		
		textField_hvt = new JTextField();
		textField_hvt.setBackground(UIManager.getColor("Button.background"));
		textField_hvt.setBounds(166, 25, 176, 26);
		frame.getContentPane().add(textField_hvt);
		textField_hvt.setColumns(10);
		
		JLabel lblnoisinh = new JLabel("Nơi sinh:");
		lblnoisinh.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblnoisinh.setBounds(25, 148, 109, 23);
		frame.getContentPane().add(lblnoisinh);
		
		JLabel lblemail = new JLabel("Email: ");
		lblemail.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblemail.setBounds(25, 229, 56, 43);
		frame.getContentPane().add(lblemail);
		
		JLabel lblgioitinh = new JLabel("Giới tính:");
		lblgioitinh.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblgioitinh.setBounds(25, 57, 77, 23);
		frame.getContentPane().add(lblgioitinh);
		
		JLabel lbldiachi = new JLabel("Địa chỉ liên hệ:");
		lbldiachi.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lbldiachi.setBounds(25, 196, 147, 23);
		frame.getContentPane().add(lbldiachi);
		
		textField_ngaysinh = new JTextField();
		textField_ngaysinh.setBackground(UIManager.getColor("Button.background"));
		textField_ngaysinh.setBounds(166, 99, 176, 25);
		frame.getContentPane().add(textField_ngaysinh);
		textField_ngaysinh.setColumns(10);
		
		textField_GioiTinh  = new JTextField();
		textField_GioiTinh.setBackground(UIManager.getColor("Button.background"));
		textField_GioiTinh.setBounds(166, 58, 59, 23);
		frame.getContentPane().add(textField_GioiTinh);
		textField_GioiTinh.setColumns(10);

		
		
		textField_noisinh = new JTextField();
		textField_noisinh.setBackground(UIManager.getColor("Button.background"));
		textField_noisinh.setBounds(166, 148, 348, 23);
		frame.getContentPane().add(textField_noisinh);
		textField_noisinh.setColumns(10);
		
		textField_diachi = new JTextField();
		textField_diachi.setBackground(UIManager.getColor("Button.background"));
		textField_diachi.setBounds(166, 198, 348, 23);
		frame.getContentPane().add(textField_diachi);
		textField_diachi.setColumns(10);
		
		textField_email = new JTextField();
		textField_email.setBackground(UIManager.getColor("Button.background"));
		textField_email.setBounds(166, 240, 348, 23);
		frame.getContentPane().add(textField_email);
		textField_email.setColumns(10);
		
		JLabel lblthcs = new JLabel("Trường THCS: ");
		lblthcs.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblthcs.setBounds(25, 281, 128, 34);
		frame.getContentPane().add(lblthcs);
		
		textField_thcs = new JTextField();
		textField_thcs.setBackground(UIManager.getColor("Button.background"));
		textField_thcs.setBounds(166, 284, 348, 26);
		frame.getContentPane().add(textField_thcs);
		textField_thcs.setColumns(10);
		
		
		
		JLabel lbldiemthi = new JLabel("Điểm TB lớp 9: ");
		lbldiemthi.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lbldiemthi.setBounds(25, 325, 128, 34);
		frame.getContentPane().add(lbldiemthi);
		
		textField_diemthi = new JTextField();
		textField_diemthi.setBackground(UIManager.getColor("Button.background"));
		textField_diemthi.setBounds(166, 330, 96, 23);
		frame.getContentPane().add(textField_diemthi);
		textField_diemthi.setColumns(10);
		
		JLabel lblhanhkiem = new JLabel("Hạnh kiểm :");
		lblhanhkiem.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblhanhkiem.setBounds(284, 327, 109, 26);
		frame.getContentPane().add(lblhanhkiem);
		
		textField_hanhkiem = new JTextField();
		textField_hanhkiem.setBackground(UIManager.getColor("Button.background"));
		textField_hanhkiem.setBounds(393, 330, 121, 23);
		frame.getContentPane().add(textField_hanhkiem);
		textField_hanhkiem.setColumns(10);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent i) {
				
				  hocsinh hocsinh=new hocsinh();
			         hocsinh.setSbd(textField_sbd.getText());
			         hocsinh.setHovaten(textField_hvt.getText());
			         hocsinh.setGioitinh(textField_GioiTinh.getText());
			         hocsinh.setNgaysinh(textField_ngaysinh.getText());
			         hocsinh.setDiachi(textField_diachi.getText());
			         hocsinh.setEmail(textField_email.getText());
			         hocsinh.setDiemtb(textField_diemthi.getText());
			         hocsinh.setHanhkiem(textField_hanhkiem.getText());
			         hocsinh.setNoisinh(textField_noisinh.getText());
			         hocsinh.setTruongcap2(textField_thcs.getText());
			         svDAO.insert(hocsinh);
			         showDataToJTable();
			         xoaForm();
			    
				// TODO Auto-generated method stub
				
				
			}
			
		});
		
		
		btnThem.addActionListener(action);
		btnThem.setBackground(new Color(102, 153, 204));
		btnThem.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnThem.setBounds(10, 417, 143, 34);
		frame.getContentPane().add(btnThem);
		
		
		
		JLabel lblNewLabel_10 = new JLabel("SBD: ");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_10.setBounds(352, 25, 63, 20);
		frame.getContentPane().add(lblNewLabel_10);
		
		textField_sbd = new JTextField();
		textField_sbd.setBackground(UIManager.getColor("Button.background"));
		textField_sbd.setBounds(405, 28, 109, 19);
		frame.getContentPane().add(textField_sbd);
		textField_sbd.setColumns(10);
		
		JButton btnXoa = new JButton("Xóa");
		

		btnXoa.addActionListener(new ActionListener() {
			

			
			public void actionPerformed(ActionEvent e) {
				 hocsinh de = new hocsinh();
			        de.setSbd(textField_sbd.getText());
			       
			        int i = table.getRowCount();
			        int a = 0;
			        for( int j = 0; j< i; j++){
			            if(table.getValueAt(j, 0).equals(textField_sbd.getText())){
			                svDAO.delete(de);
			                showDataToJTable();
			                JOptionPane.showMessageDialog(frame, "Xóa Thành Công");
			                a=1;
			                xoaForm();
			            }
			        }
			        if(a==0){
			            JOptionPane.showMessageDialog(frame, "không có hoc sinh");
			        }

			    }
				
		    }
		);
		btnXoa.addActionListener(action);
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnXoa.setBackground(new Color(102, 153, 204));
		btnXoa.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnXoa.setBounds(197, 417, 157, 34);
		frame.getContentPane().add(btnXoa);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(558, 10, 893, 374);
		frame.getContentPane().add(scrollPane);
		
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		table = new JTable();
		model= new DefaultTableModel();
		Object[] column = {"SBD","Họ và tên","Giới tính", "Ngày sinh","Địa chỉ",  "Email", "Điểm TB lớp 9","Hạnh kiểm","Nơi sinh",  "Trường THCS",};
		Object[] row = new Object[0];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		table.setBounds(71, 352, 1, 1);
		table.addMouseListener((MouseListener) new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		      
		        DefaultTableModel chonT = (DefaultTableModel) table.getModel();
		        int chonDong = table.rowAtPoint(e.getPoint());
		        textField_sbd.setText(chonT.getValueAt(chonDong, 0).toString());
		        textField_hvt.setText(chonT.getValueAt(chonDong, 1).toString());
		        textField_GioiTinh.setText(chonT.getValueAt(chonDong, 2).toString());
		        textField_ngaysinh.setText(chonT.getValueAt(chonDong, 3).toString());
		        textField_diachi.setText(chonT.getValueAt(chonDong, 4).toString());
		        textField_email.setText(chonT.getValueAt(chonDong, 5).toString());
		        textField_diemthi.setText(chonT.getValueAt(chonDong, 6).toString());
		        textField_hanhkiem.setText(chonT.getValueAt(chonDong, 7).toString());
		        textField_noisinh.setText(chonT.getValueAt(chonDong, 8).toString());
		        textField_thcs.setText(chonT.getValueAt(chonDong, 9).toString());
		    }
		});
		
		scrollPane.setViewportView(table);
		
		
		scrollPane.setViewportView(table);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setForeground(new Color(0, 0, 0));
		verticalBox.setBackground(Color.BLACK);
		verticalBox.setBorder(new LineBorder(new Color(0, 0, 0)));
		verticalBox.setBounds(10, 10, 524, 374);
		frame.getContentPane().add(verticalBox);
		
		JLabel lblNewLabel_10_1 = new JLabel("SBD: ");
		lblNewLabel_10_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_10_1.setBounds(558, 424, 63, 20);
		frame.getContentPane().add(lblNewLabel_10_1);
		
		textField_10 = new JTextField();
		textField_10.setBackground(UIManager.getColor("Button.background"));
		textField_10.setBounds(653, 417, 245, 29);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnTimKiem = new JButton("Tìm kiếm");
		btnTimKiem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				    showDataToJTable();
			        performSearch();
			}
		});
		btnTimKiem.addActionListener(action);
		btnTimKiem.setBackground(new Color(102, 153, 204));
		btnTimKiem.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnTimKiem.setBounds(998, 418, 176, 32);
		frame.getContentPane().add(btnTimKiem);
		
		
		JButton btnNewButton =   new JButton("Thoát");
		btnNewButton.setBackground(new Color(102, 153, 204));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(1283, 417, 168, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btncapnhat = new JButton("Cập nhật");
		btncapnhat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 hocsinh de = new hocsinh();
		            de.setSbd(textField_sbd.getText());
		            int i = table.getRowCount();
		            System.out.println(i);
		            int a = 0;
		            for( int j = 0; j< i; j++){
		                if(table.getValueAt(j, 0).equals(textField_sbd.getText()) ){
//		                    svDAO.delete(de);
		                   
		                    showDataToJTable();
		                    JOptionPane.showMessageDialog(frame, "Cập Nhật Thành Công");
		                    a=1;
		                    hocsinh hocsinh=new hocsinh();
		                    hocsinh.setSbd(textField_sbd.getText());
		                    hocsinh.setHovaten(textField_hvt.getText());
		                    hocsinh.setGioitinh(textField_GioiTinh.getText());
		                    hocsinh.setNgaysinh(textField_ngaysinh.getText());
		                    hocsinh.setDiachi(textField_diachi.getText());
		                    hocsinh.setEmail(textField_email.getText());
		                    hocsinh.setDiemtb(textField_diemthi.getText());
		                    hocsinh.setHanhkiem(textField_hanhkiem.getText());
		                    hocsinh.setNoisinh(textField_noisinh.getText());
		                    hocsinh.setTruongcap2(textField_thcs.getText());
		                    svDAO.update(hocsinh);
		                   
		                    break;
		                }
		            }
		            showDataToJTable();
		            if(a==0){
		                JOptionPane.showMessageDialog(frame, "không có học sinh");
		            }
			
 
			}
		});
		btncapnhat.setBackground(new Color(102, 153, 204));
		btncapnhat.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btncapnhat.setBounds(393, 417, 141, 34);
		frame.getContentPane().add(btncapnhat);
        this.frame.setVisible(true);

	}
	

	public void xoaForm() {
		textField_diachi.setText("");
		textField_diemthi.setText("");
		textField_email.setText("");
		textField_hanhkiem.setText("");
		textField_hvt.setText("");
		textField_sbd.setText("");
		textField_ngaysinh.setText("");
		textField_noisinh.setText("");
		textField_thcs.setText("");
		textField_GioiTinh.setText(" ");

	}
	
	private void showDataToJTable() {
	    table.setDefaultEditor(Object.class, null);
	        DefaultTableModel model = (DefaultTableModel) (table.getModel());
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
	    DefaultTableModel model = (DefaultTableModel) table.getModel();
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

	// TODO Auto-generated method stub
	private void performSearch() {
	
	    String sbdSinhVien = textField_10.getText();

	    // Gọi hàm tìm kiếm từ DAO
	    ArrayList<hocsinh> ketQuaTimKiem = svDAO.search(sbdSinhVien);

	    // Hiển thị kết quả trên bảng
	    displaySearchResults(ketQuaTimKiem);
	}
     
	
}








 

