/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan.java;

import java.util.Objects;

/**
 *
 * @author Hoang Nguyen
 */
public class ClassSanPham {
    private String masanpham;
    private String loai;
    private String tensanpham;
    private int dongia;



    @Override
    public boolean equals(Object obj) {
        return this.loai.equalsIgnoreCase(((ClassSanPham)obj).loai);
    }

    public ClassSanPham(String masanpham, String loai, String tensanpham, int dongia) {
        this.masanpham = masanpham;
        this.loai = loai;
        this.tensanpham = tensanpham;
        this.dongia = dongia;
    }
    
    public ClassSanPham() {
        this.masanpham = null;
        this.loai = null;
        this.tensanpham = null;
        this.dongia = 0;
    }

    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }
    
}
