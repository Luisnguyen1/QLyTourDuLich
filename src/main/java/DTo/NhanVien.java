package DTo;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class NhanVien implements Comparable<NhanVien> {
    private String manv;
    private String loainv;
    private String tennv;
    private String diachi;
    private String chucvu;
    
    

    public NhanVien(String tennv,String manv,  String diachi,String loainv, String chucvu) {
        this.manv = manv;
        this.loainv = loainv;
        this.tennv = tennv;
        this.diachi = diachi;
        this.chucvu = chucvu;
      
    }

    
    
    public NhanVien(NhanVien x)
    {
        manv = x.manv;
        loainv = x.loainv;
        tennv = x.tennv;
        diachi = x.diachi;
        chucvu = x.chucvu;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getLoainv() {
        return loainv;
    }

    public void setLoainv(String loainv) {
        this.loainv = loainv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "manv=" + manv + ", loainv=" + loainv + ", tennv=" + tennv + ", diachi=" + diachi + ", chucvu=" + chucvu + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.manv);
        hash = 41 * hash + Objects.hashCode(this.loainv);
        hash = 41 * hash + Objects.hashCode(this.tennv);
        hash = 41 * hash + Objects.hashCode(this.diachi);
        hash = 41 * hash + Objects.hashCode(this.chucvu);
        return hash;
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
        final NhanVien other = (NhanVien) obj;
        if (!Objects.equals(this.manv, other.manv)) {
            return false;
        }
        if (!Objects.equals(this.loainv, other.loainv)) {
            return false;
        }
        if (!Objects.equals(this.tennv, other.tennv)) {
            return false;
        }
        if (!Objects.equals(this.diachi, other.diachi)) {
            return false;
        }
        return Objects.equals(this.chucvu, other.chucvu);
    }
    
    @Override
    public int compareTo(NhanVien o) {
        return this.manv.compareTo(o.manv);
    }
    
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien: ");
        manv = sc.nextLine();
        System.out.println("Nhap loai nhan vien: ");
        loainv= sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diachi = sc.nextLine();
        System.out.println("Nhap chuc vu: ");
        chucvu = sc.nextLine();
    }
    
    public void xuat()
    {
        System.out.println("Ma nhan vien la: "+this.manv);
        System.out.println("Loai nhan vien: "+this.loainv);
        System.out.println("Ten nhan vien la: "+this.tennv);
        System.out.println("Dia chi la: "+this.diachi);
        System.out.println("Chuc vu nhan vien: "+this.chucvu);
    }
    
   private ArrayList<NhanVien>danhSach;

    public NhanVien() {
    }

    
    
    public NhanVien(ArrayList<NhanVien> danhSach) {
        this.danhSach = danhSach;
    }
    
    //1. Them khach hang vao danh sach 
    public void themNhanVien(NhanVien nv)
    {
        this.danhSach.add(nv);    
    }
    
    //2. Them In danh sach khach hang ra man hinh
    public void inDanhSachNhanVien()
    {
        for (NhanVien nhanVien : danhSach) 
        {
            System.out.println(nhanVien);
        }
    }
    
    //3. Kiem tra danh sach khach hang co rong hay khong
    public boolean kiemTraDanhSachRong()
    {
        return this.danhSach.isEmpty();
    }
    
    //4. Lay ra so luong khach hang trong danh sach
    public int laySoLuong()
    {
        return this.danhSach.size();
    }
    //5. lam rong danh sach khach hang
    public void lamRongDanhSach()
    {
        this.danhSach.removeAll(danhSach);
    }
    
    //6. Kiem tra khach hang co ton tai trong danh sach hay khong, dua tren ma khach hang
    public boolean kiemTraTonTai(NhanVien nv)
    {
        return this.danhSach.contains(nv);
    }
    //7. Xoa mot khach hang ra khoi danh sach khach hang dua tren ma khach hang
    public boolean  xoaKhachHang(NhanVien nv)
    {
        return this.danhSach.remove(nv);
    }
    
    //8. Tim kiem tat ca khach hang dua tren Ma khach hang duoc nhap tu ban phim
    public void timKhachHang(String ma)
    {
        for (NhanVien nhanVien : danhSach) 
        {
            if(nhanVien.getManv().contains(ma));
            System.out.println(nhanVien);
        }
    }
}
