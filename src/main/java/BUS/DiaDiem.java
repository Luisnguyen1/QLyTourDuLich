package BUS;

import KetnoiSQL_DAL.config;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DiaDiem {
    private String madd;
    private String tendd;
    private String thuoctinh;
    private String khuvuc;

    public DiaDiem(String madd, String tendd, String thuoctinh, String khuvuc) {
        this.madd = madd;
        this.tendd = tendd;
        this.thuoctinh = thuoctinh;
        this.khuvuc = khuvuc;
    }

    public String getMadd() {
        return madd;
    }

    public void setMadd(String madd) {
        this.madd = madd;
    }

    public String getTendd() {
        return tendd;
    }

    public void setTendd(String tendd) {
        this.tendd = tendd;
    }

    public String getThuoctinh() {
        return thuoctinh;
    }

    public void setThuoctinh(String thuoctinh) {
        this.thuoctinh = thuoctinh;
    }

    public String getKhuvuc() {
        return khuvuc;
    }

    public void setKhuvuc(String khuvuc) {
        this.khuvuc = khuvuc;
    }
    
    

    @Override
    public String toString() {
        return "DiaDiem{" + "madd=" + madd + ", tendd=" + tendd + ", thuoctinh=" + thuoctinh + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.madd);
        hash = 89 * hash + Objects.hashCode(this.tendd);
        hash = 89 * hash + Objects.hashCode(this.thuoctinh);
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
        final DiaDiem other = (DiaDiem) obj;
        if (!Objects.equals(this.madd, other.madd)) {
            return false;
        }
        if (!Objects.equals(this.tendd, other.tendd)) {
            return false;
        }
        return Objects.equals(this.thuoctinh, other.thuoctinh);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma dia diem: ");
        madd = sc.nextLine();
        System.out.println("Nhap ten dia diem: ");
        tendd = sc.nextLine();
        System.out.println("Nhap thong tin dia diem: ");
        thuoctinh = sc.nextLine();
    }
    
    public void xuat() {
    System.out.println("Ma dia diem: " + madd);
    System.out.println("Ten dia diem: " + tendd);
    System.out.println("Thuoc tinh: " + thuoctinh);
    }
    
    private ArrayList<DiaDiem>danhSach = new ArrayList<DiaDiem>();
    config con = new config();
    public DiaDiem() 
    {
        this.danhSach = con.LayDL_DiaDiem(); //cach khai bao 1 arrayList
    }



    public DiaDiem traDiaDiem(int i) {
        return danhSach.get(i);
    }

    public DiaDiem traDiaDiem(String maDD) {
        for (DiaDiem diaDiem : danhSach) {
            if (maDD.equalsIgnoreCase(diaDiem.getMadd())) {
                return diaDiem;
            }
        }
        return null;
    }

    public void themDiaDiem(DiaDiem diaDiem) {
        this.danhSach.add(diaDiem);
    }

    public void themDiaDiem(String maDD, String tenDD, String tenTinh, String khuVuc) {
        DiaDiem diaDiem = new DiaDiem(maDD, tenDD, tenTinh, khuVuc);
        this.danhSach.add(diaDiem);
        con.UpdateSQL_DiaDiem(diaDiem, 1, "null");
    }

    public int laySoLuongDiaDiem() {
        return this.danhSach.size();
    }

    public boolean xoaDiaDiem(DiaDiem diaDiem) {
        return this.danhSach.remove(diaDiem);
    }

    public boolean xoaDiaDiem(String maDD) {
        int i = 0;
        for (DiaDiem diaDiem : danhSach) {
            if (maDD.equalsIgnoreCase(diaDiem.getMadd())) {
                this.danhSach.remove(i);
                con.UpdateSQL_DiaDiem(diaDiem, 2, "null");
                return true;
            }
            i++;
        }
        return false;
    }

    public boolean suaDiaDiem(String maOld, String madd, String tendd, String thuoctinh, String khuvuc) {
        int i = 0;
        for (DiaDiem diaDiem : danhSach) {
            if (maOld.equalsIgnoreCase(diaDiem.getMadd())) {
                this.danhSach.get(i).setMadd(madd);
                this.danhSach.get(i).setTendd(tendd);
                this.danhSach.get(i).setThuoctinh(thuoctinh);
                this.danhSach.get(i).setKhuvuc(khuvuc);
                con.UpdateSQL_DiaDiem(this.danhSach.get(i), 3, maOld);
                return true;
            }
            i++;
        }
        return false;
    }

    public void timDiaDiem(String maDD) {
        for (DiaDiem diaDiem : danhSach) {
            if (diaDiem.getMadd().contains(madd)) {
                System.out.println(diaDiem);
            }
        }
    }

    public ArrayList<DiaDiem> timDiaDiemUnlimit(String madd) {
        ArrayList<DiaDiem> dsDiaDiem = new ArrayList<>();
        for (DiaDiem diaDiem : danhSach) {
            if (diaDiem.getMadd().equalsIgnoreCase(madd)) {
                dsDiaDiem.add(diaDiem);
            }
            if (diaDiem.getTendd().equalsIgnoreCase(madd)) {
                dsDiaDiem.add(diaDiem);
            }
            if (diaDiem.getThuoctinh().equalsIgnoreCase(madd)) {
                dsDiaDiem.add(diaDiem);
            }
            if (diaDiem.getKhuvuc().equalsIgnoreCase(madd)) {
                dsDiaDiem.add(diaDiem);
            }
        }
        return dsDiaDiem;
    }
}

