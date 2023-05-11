/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTo;

/**
 *
 * @author LENOVO
 */
public class QlyNhanVien implements Comparable<QlyNhanVien>{
    public String hoTen;
    public String maNhanVien;
    public String diaChi;
    public String loaiNhanVien;
    public String loaiLoaiNhanVien;
    public String chucVu;
    public String chuChucVu;

    @Override
    public int compareTo(QlyNhanVien o) {
        return this.maNhanVien.compareTo(o.maNhanVien);
    }

    public QlyNhanVien(String hoTen, String maNhanVien, String diaChi, String loaiNhanVien, String loaiLoaiNhanVien, String chucVu, String chuChucVu) {
        this.hoTen = hoTen;
        this.maNhanVien = maNhanVien;
        this.diaChi = diaChi;
        this.loaiNhanVien = loaiNhanVien;
        this.loaiLoaiNhanVien = loaiLoaiNhanVien;
        this.chucVu = chucVu;
        this.chuChucVu = chuChucVu;
    }
    
    public QlyNhanVien(QlyNhanVien x){
        hoTen = x.hoTen;
        maNhanVien = x.maNhanVien;
        diaChi = x.diaChi;
        loaiNhanVien = x.loaiNhanVien;
        loaiLoaiNhanVien = x.loaiLoaiNhanVien;
        chucVu = x.chucVu;
        chuChucVu = x.chuChucVu;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }

    public void setLoaiNhanVien(String loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }

    public String getLoaiLoaiNhanVien() {
        return loaiLoaiNhanVien;
    }

    public void setLoaiLoaiNhanVien(String loaiLoaiNhanVien) {
        this.loaiLoaiNhanVien = loaiLoaiNhanVien;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getChuChucVu() {
        return chuChucVu;
    }

    public void setChuChucVu(String chuChucVu) {
        this.chuChucVu = chuChucVu;
    }
    
    
}
