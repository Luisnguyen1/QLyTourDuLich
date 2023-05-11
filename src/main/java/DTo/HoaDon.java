package DTo;

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

    public HoaDon(String mahd, String manv, String makhachdatve, long tongtien, Date ngayxuathoadon, ArrayList<HoaDon> danhSach) {
        this.mahd = mahd;
        this.manv = manv;
        this.makhachdatve = makhachdatve;
        this.tongtien = tongtien;
        this.ngayxuathoadon = ngayxuathoadon;
        this.danhSach = danhSach;
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
    private ArrayList<HoaDon>danhSach;

    public HoaDon()
    {
        this.danhSach = new ArrayList<HoaDon>(); //cach khai bao 1 arrayList
    }
    
    public HoaDon(ArrayList<HoaDon> danhSach) {
        this.danhSach = danhSach;
    }
    
    //1. Them hoa don vao danh sach 
    public void themKhachHang(HoaDon hd)
    {
        this.danhSach.add(hd);    
    }
    
    //2. Them In danh sach hoa don ra man hinh
    public void inDanhSachKhachHang()
    {
        for (HoaDon khachHang : danhSach) 
        {
            System.out.println(khachHang);
        }
    }
    
    //3. Kiem tra danh sach hoa don co rong hay khong
    public boolean kiemTraDanhSachRong()
    {
        return this.danhSach.isEmpty();
    }
    
    //4. Lay ra so luong hoa don trong danh sach
    public int laySoLuongKhachHang()
    {
        return this.danhSach.size();
    }
    //5. lam rong danh sach hoa don
    public void lamRongDanhSach()
    {
        this.danhSach.removeAll(danhSach);
    }
    
    //6. Kiem tra hoa don co ton tai trong danh sach hay khong, dua tren ma hoa don
    public boolean kiemTraTonTai(HoaDon hd)
    {
        return this.danhSach.contains(hd);
    }
    //7. Xoa mot hoa don ra khoi danh sach hoa don dua tren ma hoa don
    public boolean  xoaKhachHang(KhachHang hd)
    {
        return this.danhSach.remove(hd);
    }
    
    //8. Tim kiem tat ca hoa don dua tren Ma hoa don duoc nhap tu ban phim
    public void timKhachHang(String ma)
    {
        for (HoaDon hoadon : danhSach) 
        {
            /* if(hoadon.getMahd().contains(ma));*/
            System.out.println(hoadon);
        }
    }
    public void xoaHoaDon(HoaDon hd)
    {
        this.danhSach.remove(hd);
    }
}