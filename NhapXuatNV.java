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
public  abstract class NhapXuatNV {
    String hoTen;
    String msNv;
    double luong;
//    String chucVu;
//    double doanhSo;
//    double hoaHong;
//    double trachNhiem;
 public abstract double ThuNhap();
 
 
    public NhapXuatNV() {
    }

    public NhapXuatNV(String hoTen, String msNv, double luong) {
        this.hoTen = hoTen;
        this.msNv = msNv;
        this.luong = luong;
    }
   
    
    public  void nhapTT(){
        try {  
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nhập tên: ");
            setHoTen(sc.nextLine());
        System.out.print("Nhập MSNV: ");
            setMsNv(sc.nextLine());
        System.out.print("Lương cơ bản: ");
            setLuong(sc.nextDouble());
        } catch (Exception e) {
            System.out.println("Nhập sai thông tin, chọn chức năng 5 để sửa nếu cần!");
            
          
        }
//        System.out.println("Nhập chức vụ (hanh chinh/ tiep thi/ truong phong)");
//        chucVu= sc.nextLine();
//        if(chucVu.equalsIgnoreCase("Hanh chinh")){
//             System.out.println("Nhập Lương: ");
//             luong = sc.nextDouble(); 
//        }
//        else if(chucVu.equalsIgnoreCase("Tiep thi")){
//             System.out.println("Lương");
//             luong= sc.nextDouble();
//             System.out.println("Doanh số bán hàng: ");
//             doanhSo= sc.nextDouble();
//             System.out.println("Hoa hồng: ");
//             hoaHong=sc.nextDouble();           
//        }
//        else if (chucVu.equalsIgnoreCase("Truong phong")){
//            System.out.println("Nhập lương: ");
//            luong=sc.nextDouble();
//            System.out.println("Lương trách nhiệm: ");
//            trachNhiem=sc.nextDouble();
//        }
//            
    }
    
    
   
    public double thueThuNhap(){
         double thueTn=0;
        if(ThuNhap()>9000000&&ThuNhap()<15000000){
            thueTn=ThuNhap()*0.1;
        }
        else if(ThuNhap()>15000000){
            thueTn=ThuNhap()*0.12;
        }else{
            thueTn=0;
        }
        return thueTn;
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
    
  

}
        