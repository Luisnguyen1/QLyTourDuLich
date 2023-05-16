
package DTo;

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
    
    
}
