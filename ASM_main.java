/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DMX
 */
public class ASM_main {
    static int pb;
    public static void main(String[] args) { 
        Scanner sc =  new Scanner(System.in);
        ArrayList<NhapXuatNV> dsnv = new ArrayList<NhapXuatNV>();
        ArrayList<TiepThi> dstt = new ArrayList<TiepThi>();
        ArrayList<TruongPhong> dstp = new ArrayList<TruongPhong>();
        ArrayList<HanhChanh> dshc = new ArrayList<HanhChanh>();
        TiepThi nvtt = null;
        TruongPhong nvtp = null;
        HanhChanh nvhc = null;
        menu m1= new menu();
        
        
        
               while (true) {                  
                m1.menuAsm();     
                System.out.printf("Mời chọn chức năng: ");
                int chucnang = sc.nextInt();
        
              switch(chucnang){
            case 1:{
                 sc.nextLine();
                 System.out.println("___________________________________________________");
                  System.out.println("Bạn thuộc phòng ban nào?(chọn 1,2 hoặc 3)");
                  System.out.println("1- Hành Chính");
                  System.out.println("2- Tiếp Thị");
                  System.out.println("3- Trưởng Phòng");
                  pb= sc.nextInt();
              if(pb==1){
                  System.out.println("Bạn muốn nhập thông tin cho bao nhiêu nhân viên: ");
                  int n=sc.nextInt();
                  for(int i=0;i<n;i++){
                  nvhc = new HanhChanh();
                  nvhc.nhapTT();
                  dshc.add(nvhc);
                  }
              }else if(pb==2){
                  System.out.println("Bạn muốn nhập thông tin cho bao nhiêu sinh viên: ");
                  int n = sc.nextInt();
                  for(int i=0;i<n;i++){
                  nvtt= new TiepThi();
                  nvtt.NhapTTTT();
                  dstt.add(nvtt);
                  }
              }else if(pb==3){
                  System.out.println("Bạn muốn nhập thông tin có bao nhiêu nhân viên: ");
                  int n = sc.nextInt();
                  for(int i=0;i<n;i++){
                  nvtp=new TruongPhong();
                  nvtp.nhapTTTP();
                  dstp.add(nvtp);
                  }
              }else{
                  System.out.println("Nhập sai phòng ban 1-->3.Vui lòng nhập lại!");     
               }
               break;              
                 }
             case 2:{
                    System.out.println("Bạn muốn xuất phòng ban nào?(chọn 1,2 hoặc 3)");
                    System.out.println("1- Hành Chính");
                    System.out.println("2- Tiếp Thị");
                    System.out.println("3- Trưởng Phòng");
                     pb= sc.nextInt();              
                     if(pb==1){
                         System.out.println("____________Xuất danh sách nhân viên hành chánh_________");
                         nvhc.xuatTTHC(dshc);
                     }else if(pb==2){
                         System.out.println("___________Xuất danh sách nhân viên tiếp thị_____________");
                         nvtt.xuatTTTT(dstt);
                     }else if(pb==3){
                         System.out.println("___________Xuất danh sách trưởng phòng______________");
                         nvtp.xuatTTTP(dstp);
                     }else{
                         System.out.println("Nhập sai phòng ban 1-->3.Vui lòng nhập lại!");
                     }
                 break;
            }
            case 3:{
                    
                    System.out.println("Bạn tìm nhân viên phòng ban nào?(chọn 1,2 hoặc 3)");
                    System.out.println("1- Hành Chính");
                    System.out.println("2- Tiếp Thị");
                    System.out.println("3- Trưởng Phòng");
                     pb= sc.nextInt();
                     sc.nextLine(); //lấy khoảng trống
                     if(pb==1){      
                        boolean ktra=true;
                       System.out.printf("Nhập MSNV cần tìm: ");
                       String tim = sc.nextLine();
                       for(int i=0;i<dshc.size();i++){
                       if(tim.equals(dshc.get(i).msNv)){
                        ktra=false;
                       System.out.println("Đã tìm thấy MSNV bạn muốn tìm");
                       System.out.println("_______________________________");
                       System.out.println("Họ Tên: "+dshc.get(i).hoTen);
                       System.out.println("MSNV: "+dshc.get(i).msNv);
                       System.out.println("Thu nhập: "+dshc.get(i).ThuNhap());
                       System.out.println("Thuế thu nhập: "+dshc.get(i).thueThuNhap());
                       }
                       }   
                       if(ktra){
                           System.out.println("Không tìm thấy nhân viên này, Vui lòng kiểm tra lại thông tin!\n");
                       }
                      }else if(pb==2){
                           boolean ktra=true;
                       System.out.printf("Nhập MSNV cần tìm: ");
                       String tim = sc.nextLine();
                       for(int i=0;i<dstt.size();i++){
                       if(tim.equals(dstt.get(i).msNv)){
                           ktra=false;
                       System.out.println("Đã tìm thấy MSNV bạn muốn tìm");
                       System.out.println("_______________________________");
                       System.out.println("Họ Tên: "+dstt.get(i).hoTen);
                       System.out.println("MSNV: "+dstt.get(i).msNv);
                       System.out.println("Thu nhập: "+dstt.get(i).ThuNhap());
                       System.out.println("Thuế thu nhập: "+dstt.get(i).thueThuNhap());
                       }
                       }
                       if(ktra){
                           System.out.println("Không tìm thấy nhân viên này, Vui lòng kiểm tra lại thông tin!\n");
                       }
                     }
                      else if(pb==3){
                           boolean ktra=true;
                       System.out.printf("Nhập MSNV cần tìm: ");
                       String tim = sc.nextLine();
                       for(int i=0;i<dstp.size();i++){
                       if(tim.equals(dstp.get(i).msNv)){
                            ktra=false;
                       System.out.println("Đã tìm thấy MSNV bạn muốn tìm");
                       System.out.println("_______________________________");
                       System.out.println("Họ Tên: "+dstp.get(i).hoTen);
                       System.out.println("MSNV: "+dstp.get(i).msNv);
                       System.out.println("Thu nhập: "+dstp.get(i).ThuNhap());
                       System.out.println("Thuế thu nhập: "+dstp.get(i).thueThuNhap());
                       }
                       }
                       if(ktra){
                           System.out.println("Không tìm thấy nhân viên này, Vui lòng kiểm tra lại thông tin!\n");
                       }
                      } else{
                          System.out.println("Nhập sai phòng ban 1-->3.Vui lòng nhập lại!");
                      }           
              
                  break;
            }
            case 4:{
                    System.out.println("Bạn Xóa nhân viên phòng ban nào?(chọn 1,2 hoặc 3)");
                    System.out.println("1- Hành Chính");
                    System.out.println("2- Tiếp Thị");
                    System.out.println("3- Trưởng Phòng");
                     pb= sc.nextInt();
                     sc.nextLine(); //lấy khoảng trống
                    int i=0;
                if(pb==1){
                      boolean ktra=true;
                      System.out.printf("Nhập MSNV cần xóa: ");
                      String tim = sc.nextLine();
                      for( i=0;i<dshc.size();i++){
                        if(tim.equals(dshc.get(i).msNv)){
                          ktra=false;
                        System.out.println("Đã tìm thấy MSNV bạn muốn xóa");
                        System.out.println("__________________________________________");
                        System.out.println("Họ Tên: "+dshc.get(i).hoTen);
                        System.out.println("MSNV: "+dshc.get(i).msNv);
                        System.out.println("Thu nhập: "+dshc.get(i).ThuNhap());
                        System.out.println("Thuế thu nhập: "+dshc.get(i).thueThuNhap());
                        dshc.remove(i);
                        System.out.println("ĐÃ XÓA THÀNH CÔNG \n");
                        }                                                                    
                      }
                      if(ktra){
                           System.out.println("Không tìm thấy nhân viên này, Vui lòng kiểm tra lại thông tin!\n");
                       }
                }else if(pb==2){
                      boolean ktra=true;
                      System.out.printf("Nhập MSNV cần xóa: ");
                      String tim = sc.nextLine();
                      for( i=0;i<dstt.size();i++){
                        if(tim.equals(dstt.get(i).msNv)){
                        ktra=false;
                        System.out.println("Đã tìm thấy MSNV bạn muốn xóa");
                        System.out.println("___________________________________________");
                        System.out.println("Họ Tên: "+dstt.get(i).hoTen);
                        System.out.println("MSNV: "+dstt.get(i).msNv);
                        System.out.println("Thu nhập: "+dstt.get(i).ThuNhap());
                        System.out.println("Thuế thu nhập: "+dstt.get(i).thueThuNhap());
                        dstt.remove(i);
                        System.out.println("ĐÃ XÓA THÀNH CÔNG \n");
                        }                                                                    
                      }
                      if(ktra){
                           System.out.println("Không tìm thấy nhân viên này, Vui lòng kiểm tra lại thông tin!\n");
                       }
                }else if(pb==3){
                      boolean ktra=true;
                      System.out.printf("Nhập MSNV cần xóa: ");
                      String tim = sc.nextLine();
                      for( i=0;i<dstp.size();i++){
                        if(tim.equals(dstp.get(i).msNv)){
                             ktra=false;
                        System.out.println("Đã tìm thấy MSNV bạn muốn xóa");
                        System.out.println("_______________________________");
                        System.out.println("Họ Tên: "+dstp.get(i).hoTen);
                        System.out.println("MSNV: "+dstp.get(i).msNv);
                        System.out.println("Thu nhập: "+dstp.get(i).ThuNhap());
                        System.out.println("Thuế thu nhập: "+dstp.get(i).thueThuNhap());
                        dstp.remove(i);
                        System.out.println("ĐÃ XÓA THÀNH CÔNG \n");
                        }                                                                    
                      } 
                      if(ktra){
                           System.out.println("Không tìm thấy nhân viên này, Vui lòng kiểm tra lại thông tin!\n");
                       }
                }else{
                    System.out.println("Nhập sai phòng ban 1-->3.Vui lòng nhập lại!");
                }
                break; 
            }
            case 5:{
                   
                    System.out.println("Bạn cập nhật thông tin nhân viên phòng ban nào?(chọn 1,2 hoặc 3)");
                    System.out.println("1- Hành Chính");
                    System.out.println("2- Tiếp Thị");
                    System.out.println("3- Trưởng Phòng");
                     pb= sc.nextInt();
                     sc.nextLine(); //lấy khoảng trống
                    int i=0;
               if(pb==1) {    
                    System.out.printf("Nhập MSSV muốn cập nhật: ");
                    String tenTam=sc.nextLine();
                    System.out.println("Sửa: (ten/luong)?");
                    String suaTl=sc.nextLine();              
                  if(suaTl.equalsIgnoreCase("ten")){
                    System.out.printf("Sửa tên thành:");
                    String tenMoi= sc.nextLine();
                    for( i=0;i<dshc.size();i++){
                        if(tenTam.equals(dshc.get(i).msNv)){                         
                            dshc.get(i).setHoTen(tenMoi);
                            System.out.println("ĐÃ CẬP NHẬT TÊN THÀNH CÔNG \n");
                        }
                    } 
                  }else if(suaTl.equalsIgnoreCase("luong")){
                    System.out.printf("Sửa lương thành:");
                    double luongMoi= sc.nextDouble();
                    for(i=0;i<dshc.size();i++){
                        if(tenTam.equals(dshc.get(i).msNv)){
                            dshc.get(i).setLuong(luongMoi);
                            System.out.println("ĐÃ CẬP NHẬT LƯƠNG THÀNH CÔNG \n");
                        }
                    }                
                  }                    
               }else if (pb==2){// sửa thêm lương riêng
                    System.out.printf("Nhập MSSV muốn cập nhật: ");
                    String tenTam=sc.nextLine();
                    System.out.println("Sửa: (ten/luong)?");
                    String suaTl=sc.nextLine();              
                  if(suaTl.equalsIgnoreCase("ten")){
                    System.out.printf("Sửa tên thành:");
                    String tenMoi= sc.nextLine();
                    for( i=0;i<dstt.size();i++){
                        if(tenTam.equals(dstt.get(i).msNv)){
                            dstt.get(i).setHoTen(tenMoi);
                            System.out.println("ĐÃ CẬP NHẬT TÊN THÀNH CÔNG \n");
                        }
                    }
                  }else if(suaTl.equalsIgnoreCase("luong")){
                    System.out.printf("Sửa lương thành:");
                    double luongMoi= sc.nextDouble();
                    for(i=0;i<dstt.size();i++){
                        if(tenTam.equals(dstp.get(i).msNv)){
                            dstt.get(i).setLuong(luongMoi);
                            System.out.println("ĐÃ CẬP NHẬT LƯƠNG THÀNH CÔNG \n");
                        }
                    }
                 }                   
               }else if(pb==3){// sửa thêm lương riêng
                    System.out.printf("Nhập MSSV muốn cập nhật: ");
                    String tenTam=sc.nextLine();
                    System.out.println("Sửa: (ten/luong)?");
                    String suaTl=sc.nextLine();              
                  if(suaTl.equalsIgnoreCase("ten")){
                    System.out.printf("Sửa tên thành:");
                    String tenMoi= sc.nextLine();
                    for( i=0;i<dstp.size();i++){
                        if(tenTam.equals(dstp.get(i).msNv)){
                            dstp.get(i).setHoTen(tenMoi);
                            System.out.println("ĐÃ CẬP NHẬT TÊN THÀNH CÔNG \n");
                        }
                    }
                  }else if(suaTl.equalsIgnoreCase("luong")){
                    System.out.printf("Sửa lương thành:");
                    double luongMoi= sc.nextDouble();
                    for(i=0;i<dstp.size();i++){
                        if(tenTam.equals(dstp.get(i).msNv)){
                            dstp.get(i).setLuong(luongMoi);
                            System.out.println("ĐÃ CẬP NHẬT LƯƠNG THÀNH CÔNG \n");
                        }
                    }
                  }                   
               }else{
                    System.out.println("Nhập sai phòng ban 1-->3.Vui lòng nhập lại!");
               }               
              break;
            }
            case 6:{
                    System.out.println("Bạn muốn tìm nhân viên theo khoảng lương phòng ban nào?(chọn 1,2 hoặc 3)");
                    System.out.println("1- Hành Chính");
                    System.out.println("2- Tiếp Thị");
                    System.out.println("3- Trưởng Phòng");
                    pb= sc.nextInt();
                    sc.nextLine(); //lấy khoảng trống
              if(pb==1) {      
                  boolean ktra=true;
                    System.out.printf("Nhập khoảng lương Min:");
                    double min=sc.nextDouble();
                    System.out.printf("Nhập vào khoảng lương Max: ");
                    double max=sc.nextDouble();
                    for(int i=0;i<dshc.size();i++){
                       if(dshc.get(i).luong>=min && dshc.get(i).luong<= max){  
                        ktra=false;
                        System.out.println("________________________________________________");                                                  
                        System.out.println("Họ Tên: "+dshc.get(i).hoTen);
                        System.out.println("MSNV: "+dshc.get(i).msNv);
                        System.out.println("Lương: "+dshc.get(i).luong);
                        System.out.println("Thu nhập: "+dshc.get(i).ThuNhap());
                        System.out.println("Thuế thu nhập: "+dshc.get(i).thueThuNhap()+"\n");                
                       }
                    }
                    if(ktra==true){
                        System.out.println("Không tìm thấy nhân viên trong khoảng này");
                    }
              }else if(pb==2){
                     boolean ktra=true;
                    System.out.printf("Nhập khoảng lương Min:");
                    double min=sc.nextDouble();
                    System.out.printf("Nhập vào khoảng lương Max: ");
                    double max=sc.nextDouble();
                    for(int i=0;i<dstt.size();i++){
                       if(dstt.get(i).luong>=min && dstt.get(i).luong<= max){  
                        ktra=false;
                        System.out.println("_______________________________________________");                        
                        System.out.println("Họ Tên: "+dstt.get(i).hoTen);
                        System.out.println("MSNV: "+dstt.get(i).msNv);
                        System.out.println("Lương: "+dstt.get(i).luong);
                        System.out.println("Thu nhập: "+dstt.get(i).ThuNhap());
                        System.out.println("Thuế thu nhập: "+dstt.get(i).thueThuNhap()+"\n");                
                       }
                    }
                    if(ktra==true){
                        System.out.println("Không tìm thấy nhân viên trong khoảng này");
                    }
              }else if(pb==3){
                     boolean ktra=true;
                    System.out.printf("Nhập khoảng lương Min:");
                    double min=sc.nextDouble();
                    System.out.printf("Nhập vào khoảng lương Max: ");
                    double max=sc.nextDouble();
                    for(int i=0;i<dstp.size();i++){
                       if(dstp.get(i).luong>=min && dstp.get(i).luong<= max){  
                           ktra=false;
                        System.out.println("___________________________________________________");                          
                        System.out.println("Họ Tên: "+dstp.get(i).hoTen);
                        System.out.println("MSNV: "+dstp.get(i).msNv);
                        System.out.println("Lương: "+dstp.get(i).luong);
                        System.out.println("Thu nhập: "+dstp.get(i).ThuNhap());
                        System.out.println("Thuế thu nhập: "+dstp.get(i).thueThuNhap()+"\n");
                       }
                    }if(ktra==true){
                        System.out.println("Không tìm thấy nhân viên trong khoảng này");
                    }                   
              }else{
                  System.out.println("Nhập sai phòng ban 1-->3.Vui lòng nhập lại!");
              }            
               break;
            }
            case 7:{
                    System.out.println("Bạn muốn sắp xếp theo họ tên nhân viên phòng ban nào?(chọn 1,2 hoặc 3)");
                    System.out.println("1- Hành Chính");
                    System.out.println("2- Tiếp Thị");
                    System.out.println("3- Trưởng Phòng");
                    pb= sc.nextInt();
                    sc.nextLine();
                if(pb==1){
                     System.out.println("_______________Xắp xếp theo tên__________________");
                     Comparator<HanhChanh> comp = new Comparator<HanhChanh>() {
                     @Override
                     public int compare(HanhChanh nv1, HanhChanh nv2) {
                     return nv1.hoTen.compareTo(nv2.hoTen);
                     }
                     };
                     Collections.sort(dshc, comp);                   
                     nvhc.xuatTTHC(dshc);
                                      
                }else if(pb==2){
                     System.out.println("_______________Xắp xếp theo tên__________________");
                     Comparator<TiepThi> comp = new Comparator<TiepThi>() {
                     @Override
                     public int compare(TiepThi nv1, TiepThi nv2) {
                     return nv1.hoTen.compareTo(nv2.hoTen);
                     }
                     };
                     Collections.sort(dstt, comp);
                     nvtt.xuatTTTT(dstt);
                }else if(pb==3){
                     System.out.println("_______________Xắp xếp theo tên__________________");
                     Comparator<TruongPhong> comp = new Comparator<TruongPhong>() {
                     @Override
                     public int compare(TruongPhong nv1, TruongPhong nv2) {
                     return nv1.hoTen.compareTo(nv2.hoTen);
                     }
                     };
                     Collections.sort(dstp, comp);
                     nvtp.xuatTTTP(dstp);
                }else{
                     System.out.println("Nhập sai phòng ban 1-->3.Vui lòng nhập lại!");
                }
                   break;
            }
            case 8:{
                    System.out.println("Bạn muốn sắp xếp theo họ tên nhân viên phòng ban nào?(chọn 1,2 hoặc 3)");
                    System.out.println("1- Hành Chính");
                    System.out.println("2- Tiếp Thị");
                    System.out.println("3- Trưởng Phòng");
                    pb= sc.nextInt();
                    sc.nextLine();
                if(pb==1){
                    System.out.println("________________Xắp xếp theo thu nhập giảm dần_________________");
                    Comparator<HanhChanh> comp = new Comparator<HanhChanh>() {
                    @Override
                    public int compare(HanhChanh o1, HanhChanh o2) {                      
                       if(o1.ThuNhap()<o2.ThuNhap())
                           return 1;
                       else
                           return -1;                    
                    }
                    };
                     Collections.sort(dshc, comp);
                     nvhc.xuatTTHC(dshc);
                }else if(pb==2){
                    System.out.println("________________Xắp xếp theo thu nhập giảm dần_________________");
                    Comparator<TiepThi> comp = new Comparator<TiepThi>() {
                    @Override
                    public int compare(TiepThi o1,TiepThi o2) {                      
                       if(o1.ThuNhap()<o2.ThuNhap())
                           return 1;
                       else
                           return -1;                    
                    }
                    };
                     Collections.sort(dstt, comp);
                     nvtt.xuatTTTT(dstt);                    
                }else if(pb==3){
                    System.out.println("________________Xắp xếp theo thu nhập giảm dần_________________");
                    Comparator<TruongPhong> comp = new Comparator<TruongPhong>() {
                    @Override
                    public int compare(TruongPhong o1,TruongPhong o2) {                      
                       if(o1.ThuNhap() <o2.ThuNhap())
                           return 1;
                       else
                           return -1;                    
                    }
                    };
                     Collections.sort(dstp, comp);
                     nvtp.xuatTTTP(dstp);
                }else{
                     System.out.println("Nhập sai phòng ban 1-->3.Vui lòng nhập lại!");
                }

                break;
            }
            case 9:{
                    System.out.println("Bạn muốn sắp xếp theo họ tên nhân viên phòng ban nào?(chọn 1,2 hoặc 3)");
                    System.out.println("1- Hành Chính");
                    System.out.println("2- Tiếp Thị");
                    System.out.println("3- Trưởng Phòng");
                    pb= sc.nextInt();
                    sc.nextLine();
                if(pb==1){
                    System.out.println("__________________5 nhân viên lương cao nhất____________________");
                    Comparator<HanhChanh> comp = new Comparator<HanhChanh>() {
                    @Override
                    public int compare(HanhChanh o1, HanhChanh o2) {                      
                       if(o1.ThuNhap()<o2.ThuNhap())
                           return 1;
                       else
                           return -1;                    
                    }
                    };
                    Collections.sort(dshc, comp);
                  for(int i=0 ;i<5;i++){
                      System.out.println("Họ Tên: "+dshc.get(i).hoTen);
                      System.out.println("MSNV: "+dshc.get(i).msNv);
                      System.out.println("Lương: "+dshc.get(i).ThuNhap());
                      System.out.println("Thuế thu nhập: "+dshc.get(i).thueThuNhap()+"\n");
                  }                    
                }else if(pb==2){
                    System.out.println("__________________5 nhân viên lương cao nhất____________________");
                    Comparator<TiepThi> comp = new Comparator<TiepThi>() {
                    @Override
                    public int compare(TiepThi o1, TiepThi o2) {                      
                       if(o1.ThuNhap()<o2.ThuNhap())
                           return 1;
                       else
                           return -1;                    
                    }
                    };
                    Collections.sort(dstt, comp);
                  for(int i=0 ;i<5;i++){
                      System.out.println("Họ Tên: "+dstt.get(i).hoTen);
                      System.out.println("MSNV: "+dstt.get(i).msNv);
                      System.out.println("Lương: "+dstt.get(i).ThuNhap());
                      System.out.println("Thuế thu nhập: "+dstt.get(i).thueThuNhap()+"\n");
                  }                   
                }else if(pb==3){
                    System.out.println("__________________5 nhân viên lương cao nhất____________________");
                    Comparator<TruongPhong> comp = new Comparator<TruongPhong>() {
                    @Override
                    public int compare(TruongPhong o1, TruongPhong o2) {                      
                       if(o1.ThuNhap()<o2.ThuNhap())
                           return 1;
                       else
                           return -1;                    
                    }
                    };
                    Collections.sort(dstp, comp);
                  for(int i=0 ;i<5;i++){
                      System.out.println("Họ Tên: "+dstp.get(i).hoTen);
                      System.out.println("MSNV: "+dstp.get(i).msNv);
                      System.out.println("Lương: "+dstp.get(i).ThuNhap());
                      System.out.println("Thuế thu nhập: "+dstp.get(i).thueThuNhap()+"\n");
                  }                    
                }else{
                    System.out.println("Nhập sai phòng ban 1-->3.Vui lòng nhập lại!"); 
                }

                break;
            }
            case 0:{
                System.out.println("Hẹn gặp lại sau!");
                System.exit(0);
            }
        
            default:{
                System.out.println("Nhập sai chức năng 0-->9.Vui long nhap lai");
                break;
            }
        }
        }
    }
    

    
}
