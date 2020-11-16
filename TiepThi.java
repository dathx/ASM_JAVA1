/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DMX
 */
public class TiepThi extends NhapXuatNV{
    double doanhSo;
    double hueHong;

    public TiepThi() {
    }

    public TiepThi(double doanhSo, double hoaHong) {
        this.doanhSo = doanhSo;
        this.hueHong = hoaHong;
    }

    public TiepThi(double doanhSo, double hoaHong, String hoTen, String msNv, double luong) {
        super(hoTen, msNv, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hoaHong;
    }
    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
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

  

    @Override
    public double ThuNhap() {
       return getLuong()+getDoanhSo()+getHueHong();
    }
   public void NhapTTTT(){
       Scanner sc = new Scanner(System.in);
       super.nhapTT();
       try {
       System.out.printf("Doanh số: ");
       setDoanhSo(sc.nextDouble());
       System.out.printf("Huê hồng: ");
       setHueHong(sc.nextDouble());
       System.out.println("\n");           
       } catch (Exception e) {
           System.out.println("Nhập sai thông tin, chọn chức năng 5 để sửa");
       }

            
   }
   public  void xuatTTTT(ArrayList<TiepThi> dstt){
       for(TiepThi i: dstt){
           System.out.println("Họ tên: "+i.getHoTen());           
           System.out.println("MSNV: "+i.getMsNv());
           System.out.println("Thu nhập: "+i.ThuNhap());
           System.out.println("Thuế thu nhập: "+i.thueThuNhap()+"\n");     
       }
   }
}
