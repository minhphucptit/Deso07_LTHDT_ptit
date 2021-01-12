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
public class BangDiem implements Serializable{
    public static int sid=1000;
    private int ma;
    private SinhVien sv;
    private MonHoc mh;
    private float diem;

    public BangDiem() {
    }

    public BangDiem(SinhVien sv, MonHoc mh, String diem) {
        try{
        if(sv.equals(null)||mh.equals(null)||diem.equals("")) throw new NumberFormatException();
        if(Float.parseFloat(diem)>10&&Float.parseFloat(diem)<0) throw new ArithmeticException();
        this.ma=sid++;
        this.sv = sv;
        this.mh = mh;
        this.diem = Float.parseFloat(diem);
        }catch(NumberFormatException e){
            throw new NumberFormatException();
        }
    }

    public boolean equals(BangDiem obj) {
        if(obj.getMa()==this.ma) return true;
        return false;
    }

    public int getMa() {
        return ma;
    }

    public SinhVien getSv() {
        return sv;
    }

    public MonHoc getMh() {
        return mh;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public float getDiem() {
        return diem;
    }
    public Object[] toObject(){
        return new Object[]{ma,sv.getTen(),mh.getTen(),mh.getSoDv(),diem};
    }
}
