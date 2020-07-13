/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hoang Nguyen
 */
public class dbconnection {
    
//    public String header[] = {"hoten", "sdt", "diachi", "email","congviec"};
//    private DefaultTableModel tblModel = new DefaultTableModel(header, 0);

    public Connection connectionDB() throws Exception {
        String dbURL = "jdbc:mysql://localhost:3306/doanjava";
        String username = "root";
        String password = "admin0123456";
        return (Connection) DriverManager.getConnection(dbURL, username, password);
    }

    public void insertDataIntoKhachHang(String sql) {
        try {
            Connection conn = connectionDB();
            if (conn == null) {
                JOptionPane.showMessageDialog(null, "Message", "Error connect to database!", JOptionPane.INFORMATION_MESSAGE);
            }
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bị trùng, vui lòng nhập lại", "Lỗi!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
