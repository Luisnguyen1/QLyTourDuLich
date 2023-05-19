package DTo;

import KetnoiSQL_DAL.config;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class HoaDon {
    private String mahd;
    private String manv;
    private String makhachdatve;
    private long tongtien;
    private Date ngayxuathoadon;

    public HoaDon(String mahd, String manv, String makhachdatve, long tongtien, Date ngayxuathoadon) {
        this.mahd = mahd;
        this.manv = manv;
        this.makhachdatve = makhachdatve;
        this.tongtien = tongtien;
        this.ngayxuathoadon = ngayxuathoadon;
    }
    
    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }
    
    
    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getMakhachdatve() {
        return makhachdatve;
    }

    public void setMakhachdatve(String makhachdatve) {
        this.makhachdatve = makhachdatve;
    }

    public long getTongtien() {
        return tongtien;
    }

    public void setTongtien(long tongtien) {
        this.tongtien = tongtien;
    }

    public Date getNgayxuathoadon() {
        return ngayxuathoadon;
    }

    public void setNgayxuathoadon(Date ngayxuathoadon) {
        this.ngayxuathoadon = ngayxuathoadon;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hoa don: ");
        this.mahd = sc.nextLine();

        System.out.println("Nhap ma khach dat ve: ");
        this.makhachdatve = sc.nextLine();

        System.out.println("Nhap tong tien: ");
        this.tongtien = sc.nextLong();
        sc.nextLine();

        Date ngayxuat = null;
        while (ngayxuat == null) {
        System.out.println("Nhap ngay xuat hoa don(dd/MM/yyyy): ");
        String ngayxuatString = sc.nextLine();
        try {
            ngayxuat = new SimpleDateFormat("dd/MM/yyyy").parse(ngayxuatString);
        } catch (ParseException e) {
            System.out.println("Nhap ngay xuat hoa don sai dinh dang, hay nhap lai!");
        }
    }
        this.ngayxuathoadon = ngayxuat;
    }

    public void xuat() {
        System.out.println("Ma hoa don: " + this.mahd);
        System.out.println("Ma khach dat ve: " + this.makhachdatve);
        System.out.println("Tong tien: " + this.tongtien);
        System.out.println("Ngay xuat hoa don: " + this.ngayxuathoadon);
    }
    
    private ArrayList<HoaDon>danhSach = new ArrayList<>();
    config con = new config();
    
    public HoaDon()
    {
        this.danhSach = con.layDL_HoaDon(); //cach khai bao 1 arrayList
    }
    public HoaDon traHD(int i){
        return danhSach.get(i);
    }
    public HoaDon traHD(String maHD){
        for (HoaDon hoaDon : danhSach) {
            if (maHD.equalsIgnoreCase(hoaDon.getMahd())) {
                return hoaDon;
            }
        }
        return null;
    }
    
    /*public KhachHang(ArrayList<KhachHang> danhSach) {
    this.danhSach = danhSach;
    }*/
    
    public void themHoaDon(HoaDon kh)
    {
        this.danhSach.add(kh);    
    }
    
    
    
    public void themHoaDon(String mahd, String manv, String makhachdatve, long tongtien, Date ngayxuathoadon)
    {
        HoaDon kh = new HoaDon( mahd,  manv,  makhachdatve,  tongtien,  ngayxuathoadon);
        this.danhSach.add(kh);    
        con.UpdateSQL_HoaDon(kh, 1, "null");
    }
    
    
    
    
    //4. Lay ra so luong khach hang trong danh sach
    public int laySoLuongHoaDon()
    {
        return this.danhSach.size();
    }
    
    
    
    //7. Xoa mot khach hang ra khoi danh sach khach hang dua tren ma khach hang
    public boolean  xoaHoaDon(HoaDon kh)
    {
        return this.danhSach.remove(kh);
    }
    
    public boolean xoaHoaDon(String ma)
    {        
        int i = 0;
        for (HoaDon hoaDon : danhSach) {
            if (ma.equalsIgnoreCase(hoaDon.getMahd())) {
                this.danhSach.remove(i); 
                con.UpdateSQL_HoaDon(hoaDon, 2, "null");
                return true;
            }
            i++;
        }
        
        return false;
        
    }
    
    public boolean suaHoaDon(String maOld, String mahd, String manv, String makhachdatve, long tongtien, Date ngayxuathoadon)
    {        
        int i = 0;
        for (HoaDon hd : danhSach) {
            if (maOld.equalsIgnoreCase(hd.getMahd())) {
                this.danhSach.get(i).setMahd(mahd); 
                this.danhSach.get(i).setManv(manv);
                this.danhSach.get(i).setMakhachdatve(makhachdatve); 
                this.danhSach.get(i).setTongtien(tongtien);
                this.danhSach.get(i).setNgayxuathoadon(ngayxuathoadon);
                
                con.UpdateSQL_HoaDon(this.danhSach.get(i), 3, maOld);
                
                return true;
            }
            i++;
        }
        
        return false;
        
    }
    //8. Tim kiem tat ca khach hang dua tren Ma khach hang duoc nhap tu ban phim
    public void timHoaDon(String ma)
    {
        for (HoaDon hd : danhSach) 
        {
            if(hd.getMahd().contains(ma));
            System.out.println(hd);
        }
    }
    
    public ArrayList<HoaDon> timHoaDonUnlimit(String ma)
    {   
        int i =0;
        ArrayList<HoaDon> dskh = new ArrayList<>();
        for (HoaDon khachHang : danhSach) 
        {
            if(khachHang.getMahd().equalsIgnoreCase(ma))
            {   
                dskh.add(khachHang);
            }
            if(khachHang.getManv().equalsIgnoreCase(ma))
            {   
                dskh.add(khachHang);
            }
            if(khachHang.getMakhachdatve().equalsIgnoreCase(ma))
            {   
                dskh.add(khachHang);
            }
            String ttien = Long.toString(khachHang.getTongtien());
            if(ttien.equalsIgnoreCase(ma))
            {   
                dskh.add(khachHang);
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat();
            String ngayXuat = dateFormat.format(ngayxuathoadon);
            if(ngayXuat.equalsIgnoreCase(ma))
            {   
                dskh.add(khachHang);
            }
            i++;
        }
        if (dskh != null) {
            return dskh;
        }
        return null;
    }
}