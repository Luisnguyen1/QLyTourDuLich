/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import KetnoiSQL_DAL.config;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
/**
 *
 * @author Huu Quoc Bao
 */
public class KhachSan implements Comparable<KhachSan>{
    
    public String tenKhachSan;
    public String sdt;
    public long tienKhachSan;
    public long tienPhong;
    public String maKhachSan;
   

    public KhachSan( String tenKhachSan, String sdt, long tienKhachSan, long tienPhong, String maKhachSan) {
       
        this.tenKhachSan = tenKhachSan;
        this.sdt = sdt;
        this.tienKhachSan = tienKhachSan;
        this.tienPhong = tienPhong;
        this.maKhachSan = maKhachSan;
        
    }

    public KhachSan(KhachSan x){
       
        tenKhachSan = x.tenKhachSan;
        sdt = x.sdt;
        tienKhachSan = x.tienKhachSan;
        tienPhong = x.tienPhong;
        maKhachSan = x.maKhachSan;
      
    }

    @Override
    public int compareTo(KhachSan o) {
        return this.maKhachSan.compareTo(o.maKhachSan);
    }


    public String getTenKhachSan() {
        return tenKhachSan;
    }

    public void setTenKhachSan(String tenKhachSan) {
        this.tenKhachSan = tenKhachSan;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public long getTienKhachSan() {
        return tienKhachSan;
    }

    public void setTienKhachSan(long tienKhachSan) {
        this.tienKhachSan = tienKhachSan;
    }

    public long getTienPhong() {
        return tienPhong;
    }

    public void setTienPhong(long tienPhong) {
        this.tienPhong = tienPhong;
    }

    public String getMaKhachSan() {
        return maKhachSan;
    }

    public void setMaKhachSan(String maKhachSan) {
        this.maKhachSan = maKhachSan;
    }

     private ArrayList<KhachSan>danhSach = new ArrayList<KhachSan>();
    config con = new config();
    public KhachSan() 
    {
        this.danhSach = con.LayDL_KhachSan(); //cach khai bao 1 arrayList
    }
    
    public KhachSan traKH(int i){
        return danhSach.get(i);
    }
    public KhachSan traKH(String maKH){
        for (KhachSan khachHang : danhSach) {
            if (maKH.equalsIgnoreCase(khachHang.getMaKhachSan())) {
                return khachHang;
            }
        }
        return null;
    }
    
    /*public KhachHang(ArrayList<KhachHang> danhSach) {
    this.danhSach = danhSach;
    }*/
    
    public void themKhachSan(KhachSan kh)
    {
        this.danhSach.add(kh);    
    }
    
    
    
    public void themKhachSan( String tenKhachSan, String sdt, long tienKhachSan, long tienPhong, String maKhachSan)
    {
        KhachSan kh = new KhachSan(  tenKhachSan,  sdt,  tienKhachSan,  tienPhong,  maKhachSan);
        this.danhSach.add(kh);    
        con.UpdateSQL_KhachSan(kh, 1, "null");
    }
    
    
    
    
    //4. Lay ra so luong khach hang trong danh sach
    public int laySoLuongKhachSan()
    {
        return this.danhSach.size();
    }
    
    
    
    //7. Xoa mot khach hang ra khoi danh sach khach hang dua tren ma khach hang
    public boolean  xoaKhachSan(KhachSan kh)
    {
        return this.danhSach.remove(kh);
    }
    
    public boolean xoaKhachSan(String ma)
    {        
        int i = 0;
        for (KhachSan khachHang : danhSach) {
            if (ma.equalsIgnoreCase(khachHang.getMaKhachSan())) {
                this.danhSach.remove(i); 
                con.UpdateSQL_KhachSan(khachHang, 2, "null");
                return true;
            }
            i++;
        }
        
        return false;
        
    }
    
    public boolean suaKhachSan(String maOld, String tenKhachSan, String sdt, long tienKhachSan, long tienPhong, String maKhachSan)
    {        
        int i = 0;
        for (KhachSan khachHang : danhSach) {
            if (maOld.equalsIgnoreCase(khachHang.getMaKhachSan())) {
              
                this.danhSach.get(i).setMaKhachSan(maKhachSan);
                this.danhSach.get(i).setSdt(sdt); 
                this.danhSach.get(i).setTenKhachSan(tenKhachSan);
                this.danhSach.get(i).getTienKhachSan();
                this.danhSach.get(i).setTienPhong(tienPhong);
                
                con.UpdateSQL_KhachSan(this.danhSach.get(i), 3, maOld);
                
                return true;
            }
            i++;
        }
        
        return false;
        
    }
    //8. Tim kiem tat ca khach hang dua tren Ma khach hang duoc nhap tu ban phim
    public void timKhachSan(String ma)
    {
        for (KhachSan khachHang : danhSach) 
        {
            if(khachHang.getMaKhachSan().contains(ma));
            System.out.println(khachHang);
        }
    }
    
    public ArrayList<KhachSan> timKhachSanUnlimit(String ma)
    {   
        int i =0;
        ArrayList<KhachSan> dskh = new ArrayList<>();
        for (KhachSan khachHang : danhSach) 
        {
            if(khachHang.getMaKhachSan().equalsIgnoreCase(ma))
            {   
                dskh.add(khachHang);
            }
           
            if(khachHang.getSdt().equalsIgnoreCase(ma))
            {   
                dskh.add(khachHang);
            }
            if(khachHang.getTenKhachSan().equalsIgnoreCase(ma))
            {   
                dskh.add(khachHang);
            }
            String tienKS = Long.toString(khachHang.getTienKhachSan());
            if(tienKS.equalsIgnoreCase(ma))
            {   
                dskh.add(khachHang);
            }
            String tienPhong = Long.toString(khachHang.getTienPhong());
            if(tienPhong.equalsIgnoreCase(ma)){{
                dskh.add(khachHang);
            }
            i++;
        }
        if (dskh != null) {
            return dskh;
        }
    }
        return null;
}
}
