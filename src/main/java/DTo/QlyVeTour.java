/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTo;

/**
 *
 * @author Huu Quoc Bao
 */
public class QlyVeTour implements Comparable<QlyVeTour>{
    public String maVeTour;
    public String maTour;
    public String maKhachHang;
    public long tienVeGiam;
    public String ngayDatVe;
    public String hanSuDung;
    public int ngayNgayDatVe;
    public int thangNgayDatVe;
    public int namNgayDatVe;
    public int ngayHSD;
    public int thangHSD;
    public int namHSD;

    @Override
    public int compareTo(QlyVeTour o) {
        return this.maVeTour.compareTo(o.maVeTour);
    }

    public QlyVeTour(String maVeTour, String maTour, String maKhachHang, long tienVeGiam, String ngayDatVe, String hanSuDung, int ngayNgayDatVe, int thangNgayDatVe, int namNgayDatVe, int ngayHSD, int thangHSD, int namHSD) {
        this.maVeTour = maVeTour;
        this.maTour = maTour;
        this.maKhachHang = maKhachHang;
        this.tienVeGiam = tienVeGiam;
        this.ngayDatVe = ngayDatVe;
        this.hanSuDung = hanSuDung;
        this.ngayNgayDatVe = ngayNgayDatVe;
        this.thangNgayDatVe = thangNgayDatVe;
        this.namNgayDatVe = namNgayDatVe;
        this.ngayHSD = ngayHSD;
        this.thangHSD = thangHSD;
        this.namHSD = namHSD;
    }
    
    public QlyVeTour(QlyVeTour x){
        maVeTour = x.maVeTour;
        maTour = x.maTour;
        maKhachHang = x.maKhachHang;
        tienVeGiam = x.tienVeGiam;
        ngayDatVe = x.ngayDatVe;
        hanSuDung = x.hanSuDung;
        ngayNgayDatVe = x.ngayNgayDatVe;
        thangNgayDatVe = x.thangNgayDatVe;
        namNgayDatVe = x.namNgayDatVe;
        ngayHSD = x.ngayHSD;
        thangHSD = x.thangHSD;
        namHSD = x.namHSD;
    }

    public String getMaVeTour() {
        return maVeTour;
    }

    public void setMaVeTour(String maVeTour) {
        this.maVeTour = maVeTour;
    }

    public String getMaTour() {
        return maTour;
    }

    public void setMaTour(String maTour) {
        this.maTour = maTour;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public long getTienVeGiam() {
        return tienVeGiam;
    }

    public void setTienVeGiam(long tienVeGiam) {
        this.tienVeGiam = tienVeGiam;
    }

    public String getNgayDatVe() {
        return ngayDatVe;
    }

    public void setNgayDatVe(String ngayDatVe) {
        this.ngayDatVe = ngayDatVe;
    }

    public String getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(String hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public int getNgayNgayDatVe() {
        return ngayNgayDatVe;
    }

    public void setNgayNgayDatVe(int ngayNgayDatVe) {
        this.ngayNgayDatVe = ngayNgayDatVe;
    }

    public int getThangNgayDatVe() {
        return thangNgayDatVe;
    }

    public void setThangNgayDatVe(int thangNgayDatVe) {
        this.thangNgayDatVe = thangNgayDatVe;
    }

    public int getNamNgayDatVe() {
        return namNgayDatVe;
    }

    public void setNamNgayDatVe(int namNgayDatVe) {
        this.namNgayDatVe = namNgayDatVe;
    }

    public int getNgayHSD() {
        return ngayHSD;
    }

    public void setNgayHSD(int ngayHSD) {
        this.ngayHSD = ngayHSD;
    }

    public int getThangHSD() {
        return thangHSD;
    }

    public void setThangHSD(int thangHSD) {
        this.thangHSD = thangHSD;
    }

    public int getNamHSD() {
        return namHSD;
    }

    public void setNamHSD(int namHSD) {
        this.namHSD = namHSD;
    }

    
}
