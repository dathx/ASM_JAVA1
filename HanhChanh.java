/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

import java.util.ArrayList;

/**
 *
 * @author DMX
 */
public class HanhChanh  extends NhapXuatNV{

    public HanhChanh() {
    }

    public HanhChanh(String hoTen, String msNv, double luong) {
        super(hoTen, msNv, luong);
    }
     
    @Override
    public double ThuNhap() {
        return getLuong();
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMsNv() {
        return msNv;
    }

    public void setMsNv(String msNv) {
        this.msNv = msNv;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
        public void xuatTTHC(ArrayList<HanhChanh> dshc){
            for(HanhChanh i : dshc){
        System.out.println("Họ Tên: "+i.getHoTen());
        System.out.println("MSNV: "+i.getMsNv());
        System.out.println("Lương: "+i.ThuNhap());
        System.out.println("Thuế Thu Nhập: "+i.thueThuNhap()+"\n");
    }
}}
