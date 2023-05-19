
package DTo;

import KetnoiSQL_DAL.config;
import java.util.ArrayList;

/**
 *
 * @author Huu Quoc 
 */
public class QlyHoaDon implements Comparable<QlyHoaDon>{
    public String maHoaDon;
    public String maKhachHang;
    public String ngayXuat;
    public long tongTien;
    public int ngay;
    public int thang;
    public int nam;

    @Override
    public int compareTo(QlyHoaDon o) {
       return this.maHoaDon.compareTo(o.maHoaDon);
    }

    public QlyHoaDon(String maHoaDon, String maKhachHang, String ngayXuat, long tongTien, int ngay, int thang, int nam) {
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.ngayXuat = ngayXuat;
        this.tongTien = tongTien;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    
    public QlyHoaDon (QlyHoaDon x){
        maHoaDon = x.maHoaDon;
        maKhachHang = x.maKhachHang;
        ngayXuat = x.ngayXuat;
        tongTien = x.tongTien;
        ngay = x.ngay;
        thang = x.thang;
        nam = x.nam;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(String ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public long getTongTien() {
        return tongTien;
    }

    public void setTongTien(long tongTien) {
        this.tongTien = tongTien;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    
    private ArrayList<QlyHoaDon> danhSach = new ArrayList<QlyHoaDon>();
    private config con = new config();

    public QlyHoaDon(){
        this.danhSach = con.layDL_HoaDon();
    }

    public QlyHoaDon(String maHoaDon, String maKhachHang, long tongTien, int ngay, int thang, int nam) {
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.tongTien = tongTien;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public QlyHoaDon traHoaDon(int i) {
        return danhSach.get(i);
    }

    public QlyHoaDon traHoaDon(String maHoaDon) {
        for (QlyHoaDon hoaDon : danhSach) {
            if (maHoaDon.equalsIgnoreCase(hoaDon.getMaHoaDon())) {
                return hoaDon;
            }
        }
        return null;
    }

    public void themHoaDon(QlyHoaDon hoaDon) {
        this.danhSach.add(hoaDon);
    }

    public void themHoaDon(String maHoaDon, String maKhachHang, long tongTien, int ngay, int thang, int nam) {
        QlyHoaDon hoaDon = new QlyHoaDon(maHoaDon, maKhachHang, tongTien, ngay, thang, nam);
        this.danhSach.add(hoaDon);
        con.UpdateSQL_HoaDon(hoaDon, 1, "null");
    }

    public int laySoLuongHoaDon() {
        return this.danhSach.size();
    }

    public boolean xoaHoaDon(QlyHoaDon hoaDon) {
        return this.danhSach.remove(hoaDon);
    }

    public boolean xoaHoaDon(String maHoaDon) {
        int i = 0;
        for (QlyHoaDon hoaDon : danhSach) {
            if (maHoaDon.equalsIgnoreCase(hoaDon.getMaHoaDon())) {
                this.danhSach.remove(i);
                con.UpdateSQL_HoaDon(hoaDon, 2, "null");
                return true;
            }
            i++;
        }
        return false;
    }

    public boolean suaHoaDon(String maOld, String maHoaDon, String maKhachHang, long tongTien, int ngay, int thang, int nam) {
        int i = 0;
        for (QlyHoaDon hoaDon : danhSach) {
            if (maOld.equalsIgnoreCase(hoaDon.getMaHoaDon())) {
                this.danhSach.get(i).setMaHoaDon(maHoaDon);
                this.danhSach.get(i).setMaKhachHang(maKhachHang);
                this.danhSach.get(i).setTongTien(tongTien);
                this.danhSach.get(i).setNgay(ngay);
                this.danhSach.get(i).setThang(thang);
                this.danhSach.get(i).setNam(nam);
                con.UpdateSQL_HoaDon(this.danhSach.get(i), 3, maOld);
                return true;
            }
            i++;
        }
        return false;
    }

    public void timHoaDon(String maHoaDon) {
        for (QlyHoaDon hoaDon : danhSach) {
            if (hoaDon.getMaHoaDon().contains(maHoaDon)) {
                System.out.println(hoaDon);
            }
        }
    }

    public ArrayList<QlyHoaDon> timHoaDonUnlimit(String maHoaDon) {
        ArrayList<QlyHoaDon> dsHoaDon = new ArrayList<>();
        for (QlyHoaDon hoaDon : danhSach) {
            if (hoaDon.getMaHoaDon().equalsIgnoreCase(maHoaDon)) {
                dsHoaDon.add(hoaDon);
            }
            // Các điều kiện tìm kiếm khác (theo maKhachHang, tongTien, ngay, thang, nam) có thể được thêm ở đây
        }
        return dsHoaDon;
    }
}
