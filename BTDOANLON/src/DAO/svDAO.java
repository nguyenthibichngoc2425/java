package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.hocsinh;


/**
 *
 * @author HP
 */
public class svDAO {


    public static ArrayList<hocsinh> getAll() {

        ArrayList<hocsinh> hocsinhs = new ArrayList<>();

        try {
            Connection conn = connet.connet.getConnection();
            String sql = "select * from hocsinh";
            PreparedStatement ps = conn.prepareCall(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String sbd = rs.getString("sbd");
                String hovaten = rs.getString("hovaten");
                String gioitinh = rs.getString("gioitinh");
                String ngaysinh = rs.getString("ngaysinh");
                String diachi = rs.getString("diachi");
                String email = rs.getString("email");
                String diemtb = rs.getString("diemtb");
                String hanhkiem = rs.getString("hanhkiem");
                String noisinh = rs.getString("noisinh");
                String truongcap2 = rs.getString("truongcap2");
    
                hocsinh sv = new hocsinh(hovaten, sbd, gioitinh, ngaysinh, noisinh, diachi, email, truongcap2, diemtb, hanhkiem);
                hocsinhs.add(sv);
               
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return hocsinhs;

    }
    
    
    public static boolean delete(hocsinh t) {
        Connection conn = connet.connet.getConnection();
        String sql = "delete from hocsinh where sbd = ? ";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, t.getSbd());
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
        }
        return false;
    }

 

    public static boolean insert(hocsinh hocsinh) {

        try {
            Connection conn = connet.connet.getConnection();
            String sql = "INSERT INTO hocsinh VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            // Set values for the PreparedStatement
            ps.setString(1, hocsinh.getSbd());
            ps.setString(2, hocsinh.getHovaten());
            ps.setString(3, hocsinh.getGioitinh());
            ps.setString(4, hocsinh.getNgaysinh());
            ps.setString(5, hocsinh.getDiachi());
            ps.setString(6, hocsinh.getEmail());
            ps.setString(7, hocsinh.getDiemtb());
            ps.setString(8, hocsinh.getHanhkiem());
            ps.setString(9, hocsinh.getNoisinh());
            ps.setString(10, hocsinh.getTruongcap2());

            // Execute the update
            int rowsAffected = ps.executeUpdate();

            // Check if the update was successful
            if (rowsAffected > 0) {
                System.out.println("Update successful");
                return true;
            } else {
                System.out.println("Update failed");
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean update(hocsinh hocsinh) {

        try {
            Connection conn = connet.connet.getConnection();
            String sqlupdate = "UPDATE hocsinh set hovaten = ?,gioitinh = ?, ngaysinh = ?, diachi = ? , email = ? ,diemTb = ? , hanhkiem = ? ,  noisinh = ?, truongcap2 = ?  where sbd = ? ";
            PreparedStatement pss = conn.prepareStatement(sqlupdate);

            // Set values for the PreparedStatement
           
            pss.setString(10, hocsinh.getSbd());
            pss.setString(1, hocsinh.getHovaten());
            pss.setString(2, hocsinh.getGioitinh());
            pss.setString(3, hocsinh.getNgaysinh());
            pss.setString(4, hocsinh.getDiachi());
            pss.setString(5, hocsinh.getEmail());
            pss.setString(6, hocsinh.getDiemtb());
            pss.setString(7, hocsinh.getHanhkiem());
            pss.setString(8, hocsinh.getNoisinh());
            pss.setString(9, hocsinh.getTruongcap2());
            pss.executeUpdate();
            pss.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }



    public static void main(String[] args) {
        ArrayList<hocsinh> hocsinhs = svDAO.getAll();
        for (hocsinh hocsinh : hocsinhs) {
            System.out.println(hocsinhs);
        }
    }
    public static ArrayList<hocsinh> search(String keyword) {
        ArrayList<hocsinh> ketQuaTimKiem = new ArrayList<>();

        try {
            Connection conn = connet.connet.getConnection();
            String sql = "SELECT * FROM hocsinh WHERE hovaten LIKE ? OR sbd LIKE ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + keyword + "%");
            ps.setString(2, "%" + keyword + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String sbd = rs.getString("sbd");
                String hovaten = rs.getString("hovaten");
                String gioitinh = rs.getString("gioitinh");
                String ngaysinh = rs.getString("ngaysinh");
                String diachi = rs.getString("diachi");
                String email = rs.getString("email");
                String diemtb = rs.getString("diemtb");
                String hanhkiem = rs.getString("hanhkiem");
                String noisinh = rs.getString("noisinh");
                String truongcap2 = rs.getString("truongcap2");

                hocsinh sv = new hocsinh(hovaten, sbd, gioitinh, ngaysinh, noisinh, diachi, email, truongcap2, diemtb, hanhkiem);
                ketQuaTimKiem.add(sv);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return ketQuaTimKiem;
   
    }
    
    }