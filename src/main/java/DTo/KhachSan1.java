package DTo;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class KhachSan1 implements Comparable<KhachSan1>{
    private String maks;
    private String tenks;
    private int tienks;
    private String sdt;
    
    public KhachSan1(KhachSan1 x){
        maks = x.maks;
        tenks = x.tenks;
        tienks = x.tienks;
        sdt = x.sdt;
    }

    public KhachSan1(String maks, String tenks, int tienks, String sdt) {
        this.maks = maks;
        this.tenks = tenks;
        this.tienks = tienks;
        this.sdt = sdt;
    }

    public KhachSan1(String makhachsan) {
        this.maks = makhachsan;
    }

    public String getMaks() {
        return maks;
    }

    public void setMaks(String maks) {
        this.maks = maks;
    }

    public String getTenks() {
        return tenks;
    }

    public void setTenks(String tenks) {
        this.tenks = tenks;
    }

    public int getTienks() {
        return tienks;
    }

    public void setTienks(int tienks) {
        this.tienks = tienks;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "KhachSan{" + "maks=" + maks + ", tenks=" + tenks + ", tienks=" + tienks + ", sdt=" + sdt + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.maks);
        hash = 29 * hash + Objects.hashCode(this.tenks);
        hash = 29 * hash + this.tienks;
        hash = 29 * hash + Objects.hashCode(this.sdt);
        return hash;
    }
    
    @Override
    public int compareTo(KhachSan1 o) {
        return this.maks.compareTo(o.maks);
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
        final KhachSan1 other = (KhachSan1) obj;
        if (this.tienks != other.tienks) {
            return false;
        }
        if (!Objects.equals(this.maks, other.maks)) {
            return false;
        }
        if (!Objects.equals(this.tenks, other.tenks)) {
            return false;
        }
        return Objects.equals(this.sdt, other.sdt);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma khach san: ");
        maks = sc.nextLine();
        System.out.println("Nhap ten khach san: ");
        tenks = sc.nextLine();
        System.out.println("Nhap gia tien: ");
        tienks = sc.nextInt();
        sc.nextLine(); // bỏ qua kí tự '\n'
        System.out.println("Nhap so dien thoai: ");
        sdt = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ma khach san: " + maks);
        System.out.println("Ten khach san: " + tenks);
        System.out.println("Gia tien: " + tienks);
        System.out.println("So dien thoai: " + sdt);
    }
    
     private ArrayList<KhachSan1>danhSachKS;

    public KhachSan1()
    {
        this.danhSachKS = new ArrayList<KhachSan1>(); //cach khai bao 1 arrayList
    }
    
    public KhachSan1(ArrayList<KhachSan1> danhSachKS) {
        this.danhSachKS = danhSachKS;
    }
    
    //1. Them khach san vao danh sach 
    public void themKhachSan(KhachSan1 ks)
    {
        this.danhSachKS.add(ks);    
    }
    
    //2. Them In danh sach khach san ra man hinh
    public void inDanhSachKhachSan()
    {
        for (KhachSan1 khachSan : danhSachKS) 
        {
            System.out.println(khachSan);
        }
    }
    
    //3. Kiem tra danh sach khach san co rong hay khong
    public boolean kiemTraDanhSachRong()
    {
        return this.danhSachKS.isEmpty();
    }
    
    //4. Lay ra so luong khach san trong danh sach
    public int laySoLuongKhachSan()
    {
        return this.danhSachKS.size();
    }
    //5. lam rong danh sach khach san
    public void lamRongDanhSach()
    {
        this.danhSachKS.removeAll(danhSachKS);
    }
    
    //6. Kiem tra khach san co ton tai trong danh sach hay khong, dua tren ma khach san
    public boolean kiemTraTonTai(KhachSan1 ks)
    {
        return this.danhSachKS.contains(ks);
    }
    //7. Xoa mot khach san ra khoi danh sach khach san dua tren ma khach san
    public boolean xoaKhachSan(KhachSan1 ks)
    {
        return this.danhSachKS.remove(ks);
    }
    
    //8. Tim kiem tat ca khach san dua tren Ma khach san duoc nhap tu ban phim
    public void timKhachSan(String ma)
    {
        for (KhachSan1 khachSan : danhSachKS) 
        {
            if(khachSan.getMaks().contains(ma));
            System.out.println(khachSan);
        }
    }
}