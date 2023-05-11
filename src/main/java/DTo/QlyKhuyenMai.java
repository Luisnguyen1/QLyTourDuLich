/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTo;

/**
 *
 * @author Huu Quoc Bao
 */
public class QlyKhuyenMai implements Comparable<QlyKhuyenMai>{
    public String tenKhuyenMai;
    public String maKhuyenMai;
    public String tienGiam;
    public int hanSuDung;
    public int ngayKhuyenMai;
    public int ngayngayKhuyenMai;
    public int thangNgayKhuyenMai;
    public int namNgayKhuyenMai;
    public int ngayHSD;
    public int thangHSD;
    public int namHSD;

    @Override
    public int compareTo(QlyKhuyenMai o) {
        return this.maKhuyenMai.compareTo(o.maKhuyenMai);    
    }

    public QlyKhuyenMai(String tenKhuyenMai, String maKhuyenMai, String tienGiam, int hanSuDung, int ngayKhuyenMai, int ngayngayKhuyenMai, int thangNgayKhuyenMai, int namNgayKhuyenMai, int ngayHSD, int thangHSD, int namHSD) {
        this.tenKhuyenMai = tenKhuyenMai;
        this.maKhuyenMai = maKhuyenMai;
        this.tienGiam = tienGiam;
        this.hanSuDung = hanSuDung;
        this.ngayKhuyenMai = ngayKhuyenMai;
        this.ngayngayKhuyenMai = ngayngayKhuyenMai;
        this.thangNgayKhuyenMai = thangNgayKhuyenMai;
        this.namNgayKhuyenMai = namNgayKhuyenMai;
        this.ngayHSD = ngayHSD;
        this.thangHSD = thangHSD;
        this.namHSD = namHSD;
    }
    
    public QlyKhuyenMai(QlyKhuyenMai x){
        tenKhuyenMai = x.tenKhuyenMai;
        maKhuyenMai = x.maKhuyenMai;
        tienGiam = x.tienGiam;
        hanSuDung = x.hanSuDung;
        ngayKhuyenMai = x.ngayKhuyenMai;
        ngayngayKhuyenMai = x.ngayngayKhuyenMai;
        thangNgayKhuyenMai = x.thangNgayKhuyenMai;
        namNgayKhuyenMai = x.namNgayKhuyenMai;
        ngayHSD = x.ngayHSD;
        thangHSD = x.thangHSD;
        namHSD = x.namHSD;  
    }

    public String getTenKhuyenMai() {
        return tenKhuyenMai;
    }

    public void setTenKhuyenMai(String tenKhuyenMai) {
        this.tenKhuyenMai = tenKhuyenMai;
    }

    public String getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaKhuyenMai(String maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public String getTienGiam() {
        return tienGiam;
    }

    public void setTienGiam(String tienGiam) {
        this.tienGiam = tienGiam;
    }

    public int getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(int hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public int getNgayKhuyenMai() {
        return ngayKhuyenMai;
    }

    public void setNgayKhuyenMai(int ngayKhuyenMai) {
        this.ngayKhuyenMai = ngayKhuyenMai;
    }

    public int getNgayngayKhuyenMai() {
        return ngayngayKhuyenMai;
    }

    public void setNgayngayKhuyenMai(int ngayngayKhuyenMai) {
        this.ngayngayKhuyenMai = ngayngayKhuyenMai;
    }

    public int getThangNgayKhuyenMai() {
        return thangNgayKhuyenMai;
    }

    public void setThangNgayKhuyenMai(int thangNgayKhuyenMai) {
        this.thangNgayKhuyenMai = thangNgayKhuyenMai;
    }

    public int getNamNgayKhuyenMai() {
        return namNgayKhuyenMai;
    }

    public void setNamNgayKhuyenMai(int namNgayKhuyenMai) {
        this.namNgayKhuyenMai = namNgayKhuyenMai;
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
