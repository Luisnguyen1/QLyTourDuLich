/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTo;

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
    public String diaDiemTour;
    public String tenKhachSan;
    public String sdt;
    public long tienKhachSan;
    public long tienPhong;
    public String maKhachSan;
   

    public KhachSan(String diaDiemTour, String tenKhachSan, String sdt, long tienKhachSan, long tienPhong, String maKhachSan) {
        this.diaDiemTour = diaDiemTour;
        this.tenKhachSan = tenKhachSan;
        this.sdt = sdt;
        this.tienKhachSan = tienKhachSan;
        this.tienPhong = tienPhong;
        this.maKhachSan = maKhachSan;
        
    }

    public KhachSan() {
    }
    
    
    public KhachSan(KhachSan x){
        diaDiemTour = x.diaDiemTour;
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

    public String getDiaDiemTour() {
        return diaDiemTour;
    }

    public void setDiaDiemTour(String diaDiemTour) {
        this.diaDiemTour = diaDiemTour;
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

    private ArrayList<KhachSan> danhSach = new ArrayList<KhachSan>();
    private config con = new config();
    
     public KhachSan()  
    {
        this.danhSach = con.LayDL_KhachSan(); //cach khai bao 1 arrayList
    }
    
    
    
    public KhachSan traKS(int i) {
        return danhSach.get(i);
    }
    
    public KhachSan traKS(String maKS) {
        for (KhachSan khachSan : danhSach) {
            if (maKS == khachSan.getMaKhachSan()) {
                return khachSan;
            }
        }
        return null;
    }
    
    public void themKhachSan(KhachSan ks) {
        this.danhSach.add(ks);
    }
    
    public void themKhachSan(String diaDiemTour, String tenKhachSan, String sdt, long tienKhachSan, long tienPhong, String maKhachSan) {
        KhachSan ks = new KhachSan(diaDiemTour, tenKhachSan, sdt, tienKhachSan, tienPhong, maKhachSan);
        this.danhSach.add(ks);
        con.UpdateSQL_KhachSan(ks, 1, "null");
    }
    
    public int laySoLuongKhachSan() {
        return this.danhSach.size();
    }
    
    public boolean xoaKhachSan(KhachSan ks) {
        return this.danhSach.remove(ks);
    }
    
    public boolean xoaKhachSan(String ma) {
        int i = 0;
        for (KhachSan khachSan : danhSach) {
            if (ma == khachSan.getMaKhachSan()) {
                this.danhSach.remove(i);
                con.UpdateSQL_KhachSan(khachSan, 2, "null");
                return true;
            }
            i++;
        }
        return false;
    }
    
    public boolean suaKhachSan(String maOld, String diaDiemTour, String tenKhachSan, String sdt, long tienKhachSan, long tienPhong, String maKhachSan) {
        int i = 0;
        for (KhachSan khachSan : danhSach) {
            if (maOld == khachSan.getMaKhachSan()) {
                this.danhSach.get(i).setDiaDiemTour(diaDiemTour);
                this.danhSach.get(i).setTenKhachSan(tenKhachSan);
                this.danhSach.get(i).setSdt(sdt);
                this.danhSach.get(i).setTienKhachSan(tienKhachSan);
                this.danhSach.get(i).setTienPhong(tienPhong);
                this.danhSach.get(i).setMaKhachSan(maKhachSan);
                
                con.UpdateSQL_KhachSan(this.danhSach.get(i), 3, String.valueOf(maOld));
                
                return true;
            }
            i++;
        }
        return false;
    }
    
    public void timKhachSan(String ma) {
        for (KhachSan khachSan : danhSach) {
            if (ma == khachSan.getMaKhachSan()) {
                System.out.println(khachSan);
            }
        }
    }
    
    public ArrayList<KhachSan> timKhachSanUnlimit(String ma) {
        ArrayList<KhachSan> dsks = new ArrayList<>();
        for (KhachSan khachSan : danhSach) {
            if (String.valueOf(khachSan.getMaKhachSan()).equalsIgnoreCase(ma)) {
                dsks.add(khachSan);
            }
            if (khachSan.getDiaDiemTour().equalsIgnoreCase(ma)) {
                dsks.add(khachSan);
            }
            if (khachSan.getTenKhachSan().equalsIgnoreCase(ma)) {
                dsks.add(khachSan);
            }
            if (khachSan.getSdt().equalsIgnoreCase(ma)) {
                dsks.add(khachSan);
            }
            if (khachSan.getTienKhachSan() == Long.parseLong(ma)) {
                dsks.add(khachSan);
            }
            if (khachSan.getTienPhong() == Long.parseLong(ma)) {
                dsks.add(khachSan);
            }
        }
        return dsks;
    }
    
    
}
