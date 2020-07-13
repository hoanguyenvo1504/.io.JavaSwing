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
public class ThongKe {
    private String TenSP;
    private int ThanhTien;

    public ThongKe(String TenSP, int ThanhTien) {
        this.TenSP = TenSP;
        this.ThanhTien = ThanhTien;
    }
    public ThongKe() {
        this.TenSP = null;
        this.ThanhTien = 0;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(int ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    @Override
    public boolean equals(Object obj) {
        return this.TenSP.equalsIgnoreCase(((ThongKe)obj).TenSP); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
