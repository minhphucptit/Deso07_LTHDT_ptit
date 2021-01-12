/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nminh.models;

import java.io.Serializable;

/**
 *
 * @author nminh
 */
public class SinhVien implements Serializable{
    public static int sid=10000;
    private int ma;
    private String ten,diaChi,ngaySinh,lop;

    public SinhVien() {
    }

    public SinhVien(String ten, String diaChi, String ngaySinh, String lop) {
        if(ten.equals("")||diaChi.equals("")||ngaySinh.equals("")||lop.equals(""))
            throw new ArithmeticException();
        this.ma=sid++;
        this.ten = ten;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
    }

    public int getMa() {
        return ma;
    }
public boolean equal(int id){
    return this.ma==id;
}
    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }
    public String getLop() {
        return lop;
    }
    public Object[] toObject(){
        return new Object[]{ma,ten,diaChi,ngaySinh,lop};
    }
}
