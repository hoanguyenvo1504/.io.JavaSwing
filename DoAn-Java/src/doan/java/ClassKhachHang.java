/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.java;

/**
 *
 * @author Hoang Nguyen
 */
public class ClassKhachHang {
    private String tenkhachhang;
    private String sdtkhachhang;
    private String gioitinh;
    private String diachi;
    private String email;
    private String loaikhachhang;

    public ClassKhachHang(String tenkhachhang, String sdtkhachhang, String gioitinh, String diachi, String email, String loaikhachhang) {
        this.tenkhachhang = tenkhachhang;
        this.sdtkhachhang = sdtkhachhang;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.email = email;
        this.loaikhachhang = loaikhachhang;
    }
    
    public ClassKhachHang() {
        this.tenkhachhang = null;
        this.sdtkhachhang = null;
        this.gioitinh = null;
        this.diachi = null;
        this.email = null;
        this.loaikhachhang = null;
    }
    

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public String getSdtkhachhang() {
        return sdtkhachhang;
    }

    public void setSdtkhachhang(String sdtkhachhang) {
        this.sdtkhachhang = sdtkhachhang;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoaikhachhang() {
        return loaikhachhang;
    }

    public void setLoaikhachhang(String loaikhachhang) {
        this.loaikhachhang = loaikhachhang;
    }
    
    
}
