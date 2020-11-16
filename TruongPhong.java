/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

import java.io.ObjectStreamConstants;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DMX
 */
public class TruongPhong  extends  NhapXuatNV{
    double luongTrachNhiem;

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
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

    public TruongPhong() {
    }

    public TruongPhong(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public TruongPhong(double luongTrachNhiem, String hoTen, String msNv, double luong) {
        super(hoTen, msNv, luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    
    @Override
    public double ThuNhap() {
    return  getLuong()+getLuongTrachNhiem();
    }
    public  void nhapTTTP(){
        Scanner sc = new  Scanner(System.in);
        super.nhapTT();
        try {
        System.out.printf("Lương trách nhiệm: ");
        setLuongTrachNhiem(sc.nextDouble());
        System.out.println("\n");            
        } catch (Exception e) {
            System.out.println("Sai thông tin, chọn chức năng 5 để sửa");
        }

    }
    
    public void xuatTTTP(ArrayList<TruongPhong> dstp){
        for(TruongPhong i : dstp ){
            System.out.println("Họ tên: "+i.getHoTen());
            System.out.println("MSNV: "+i.getMsNv());
            System.out.println("Thu nhập: "+i.ThuNhap());
            System.out.println("Thuế thu nhập: "+i.thueThuNhap()+"\n");
        }
    }
}
