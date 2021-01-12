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
public class MonHoc implements Serializable{
    public static int sid= 100;
    private int ma;
    private String ten,loai;
    private int soDv;

    public MonHoc() {
    }

    public MonHoc(String ten, String loai, String soDv) {
        try{
            if(ten.equals("")||loai.equals("")||soDv.equals("")) throw new ArithmeticException();
        this.ma=sid++;
        this.ten = ten;
        this.loai = loai;
        this.soDv = Integer.parseInt(soDv);
        }catch(NumberFormatException e){
            throw new NumberFormatException();
        }
    }

    public int getMa() {
        return ma;
    }
 public boolean equal(int id){
     return ma==id;
 }
    public String getTen() {
        return ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void setSoDv(int soDv) {
        this.soDv = soDv;
    }

    public int getSoDv() {
        return soDv;
    }
    public Object[] toObject(){
        return new Object[]{ma,ten,soDv,loai};
    }
}
