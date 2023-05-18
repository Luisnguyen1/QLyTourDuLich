package DTo;


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
    
    private ArrayList<KhachHang>danhSach;
    config con = new config();
    public KhachHang() throws SQLException
    {
        this.danhSach = new ArrayList<KhachHang>();
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
    
    
    //2. Them In danh sach khach hang ra man hinh
    public void inDanhSachKhachHang()
    {
        for (KhachHang khachHang : danhSach) 
        {
            System.out.println(khachHang);
        }
    }
    
    //3. Kiem tra danh sach khach hang co rong hay khong
    public boolean kiemTraDanhSachRong()
    {
        return this.danhSach.isEmpty();
    }
    
    //4. Lay ra so luong khach hang trong danh sach
    public int laySoLuongKhachHang()
    {
        return this.danhSach.size();
    }
    //5. lam rong danh sach khach hang
    public void lamRongDanhSach()
    {
        this.danhSach.removeAll(danhSach);
    }
    
    //6. Kiem tra khach hang co ton tai trong danh sach hay khong, dua tren ma khach hang
    public boolean kiemTraTonTai(KhachHang kh)
    {
        return this.danhSach.contains(kh);
    }
    
    
    //7. Xoa mot khach hang ra khoi danh sach khach hang dua tren ma khach hang
    public boolean  xoaKhachHang(KhachHang kh)
    {
        return this.danhSach.remove(kh);
    }
    public boolean xoaKhachHang(String ma)
    {
        int flat = 0;
        int i = 0;
        for (KhachHang khachHang : danhSach) {
            if (ma.equalsIgnoreCase(khachHang.getMakh())) {
                this.danhSach.remove(i);
                flat = 1;
                return true;
            }
            i++;
        }
        if (flat == 1) {
            return false;
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
}
