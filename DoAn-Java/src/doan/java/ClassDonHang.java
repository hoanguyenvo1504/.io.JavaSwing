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
public class ClassDonHang {

    private int stt;
    private String madonhang;
    private String tenkhachhang;
    private String sdtkhachhang;
    private String loaikhachhang;
    private String tensanpham;
    private String masanpham;
    private int dongia;
    private int soluong;
    private String trangthai;

    public ClassDonHang(int stt, String madonhang, String tenkhachhang, String sdtkhachhang, String loaikhachhang, String tensanpham, String masanpham, int dongia, int soluong, String trangthai) {
        this.stt = stt;
        this.madonhang = madonhang;
        this.tenkhachhang = tenkhachhang;
        this.sdtkhachhang = sdtkhachhang;
        this.loaikhachhang = loaikhachhang;
        this.tensanpham = tensanpham;
        this.masanpham = masanpham;
        this.dongia = dongia;
        this.soluong = soluong;
        this.trangthai = trangthai;
    }

    public ClassDonHang() {
        this.stt = 0;
        this.madonhang = null;
        this.tenkhachhang = null;
        this.sdtkhachhang = null;
        this.loaikhachhang = null;
        this.tensanpham = null;
        this.masanpham = null;
        this.dongia = 0;
        this.soluong = 0;
        this.trangthai = null;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }
    
    public String getMadonhang() {
        return madonhang;
    }

    public void setMadonhang(String madonhang) {
        this.madonhang = madonhang;
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

    public String getLoaikhachhang() {
        return loaikhachhang;
    }

    public void setLoaikhachhang(String loaikhachhang) {
        this.loaikhachhang = loaikhachhang;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    
   public int Thanhtien(){
       return this.soluong * this.dongia; 
   }
}
