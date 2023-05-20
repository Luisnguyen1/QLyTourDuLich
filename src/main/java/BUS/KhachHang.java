package BUS;


import KetnoiSQL_DAL.config;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KhachHang implements Comparable<KhachHang>{
    private String makh;
    private String tenkh;
    private String diachi;
    private String sdt;
    private String email;
    
 

    public KhachHang(KhachHang x)
    {
        makh = x.makh;
        tenkh = x.tenkh;
        diachi = x.diachi;
        sdt = x.sdt;
    }

    public KhachHang(String tenkh, String makh, String diachi, String sdt, String email) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
        
    }

    KhachHang(String maKhachHang) {
            this.makh= maKhachHang;
    }

    

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "makh=" + makh + ", tenkh=" + tenkh + ", diachi=" + diachi + ", sdt=" + sdt + ", email=" + email + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(makh,tenkh,diachi,sdt,email);
    }
    
    @Override
    public int compareTo(KhachHang o) {
        return this.makh.compareTo(o.makh);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        KhachHang other = (KhachHang) obj;
        return Objects.equals(makh, other.makh);
    }
    
    
    
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma khach hang: ");
        makh = sc.nextLine();
        System.out.println("Nhap ten khach hang: ");
        tenkh= sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diachi = sc.nextLine();
        System.out.println("Nhap SDT: ");
        sdt = sc.nextLine();
        System.out.println("Nhap email: ");
        email = sc.nextLine();       
    }
    
    public void xuat()
    {
        System.out.println("Ma khach hang la: "+this.makh);
        System.out.println("Ten khach hang la: "+this.tenkh);
        System.out.println("Dia chi la: "+this.diachi);
        System.out.println("So dien thoai la: "+this.sdt);
        System.out.println("Email la: "+this.email);
    }
    
    private ArrayList<KhachHang>danhSach = new ArrayList<KhachHang>();
    config con = new config();
    public KhachHang() 
    {
        this.danhSach = con.layDL_KhachHang(); //cach khai bao 1 arrayList
    }
    public KhachHang traKH(int i){
        return danhSach.get(i);
    }
    public KhachHang traKH(String maKH){
        for (KhachHang khachHang : danhSach) {
            if (maKH.equalsIgnoreCase(khachHang.getMakh())) {
                return khachHang;
            }
        }
        return null;
    }
    
    /*public KhachHang(ArrayList<KhachHang> danhSach) {
    this.danhSach = danhSach;
    }*/
    
    public void themKhachHang(KhachHang kh)
    {
        this.danhSach.add(kh);    
    }
    
    
    
    public void themKhachHang(String tenkh, String makh, String diachi, String sdt, String email)
    {
        KhachHang kh = new KhachHang(tenkh, makh, diachi, sdt, email);
        this.danhSach.add(kh);    
        con.UpdateSQL_KhachHang(kh, 1, "null");
    }
    
    
    
    
    //4. Lay ra so luong khach hang trong danh sach
    public int laySoLuongKhachHang()
    {
        return this.danhSach.size();
    }
    public String maKH()
    {
        String s = "KH00" + Integer.toString(laySoLuongKhachHang() + 1 );
        return s;
    }
    
    
    //7. Xoa mot khach hang ra khoi danh sach khach hang dua tren ma khach hang
    public boolean  xoaKhachHang(KhachHang kh)
    {
        return this.danhSach.remove(kh);
    }
    public boolean xoaKhachHang(String ma)
    {        
        int i = 0;
        for (KhachHang khachHang : danhSach) {
            if (ma.equalsIgnoreCase(khachHang.getMakh())) {
                this.danhSach.remove(i); 
                con.UpdateSQL_KhachHang(khachHang, 2, "null");
                return true;
            }
            i++;
        }
        
        return false;
        
    }
    
    public boolean suaKhachHang(String maOld, String tenkh, String makh, String diachi, String sdt, String email)
    {        
        int i = 0;
        for (KhachHang khachHang : danhSach) {
            if (maOld.equalsIgnoreCase(khachHang.getMakh())) {
                this.danhSach.get(i).setTenkh(tenkh); 
                this.danhSach.get(i).setMakh(makh);
                this.danhSach.get(i).setDiachi(diachi); 
                this.danhSach.get(i).setSdt(sdt);
                this.danhSach.get(i).setEmail(email);
                
                con.UpdateSQL_KhachHang(this.danhSach.get(i), 3, maOld);
                
                return true;
            }
            i++;
        }
        
        return false;
        
    }
    //8. Tim kiem tat ca khach hang dua tren Ma khach hang duoc nhap tu ban phim
    public void timKhachHang(String ma)
    {
        for (KhachHang khachHang : danhSach) 
        {
            if(khachHang.getMakh().contains(ma));
            System.out.println(khachHang);
        }
    }
    public ArrayList<KhachHang> timKhachHangUnlimit(String ma)
    {   
        int i =0;
        ArrayList<KhachHang> dskh = new ArrayList<>();
        for (KhachHang khachHang : danhSach) 
        {
            if(khachHang.getMakh().equalsIgnoreCase(ma))
            {   
                dskh.add(khachHang);
            }
            if(khachHang.getTenkh().equalsIgnoreCase(ma))
            {   
                dskh.add(khachHang);
            }
            if(khachHang.getSdt().equalsIgnoreCase(ma))
            {   
                dskh.add(khachHang);
            }
            if(khachHang.getDiachi().equalsIgnoreCase(ma))
            {   
                dskh.add(khachHang);
            }
            if(khachHang.getEmail().equalsIgnoreCase(ma))
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
