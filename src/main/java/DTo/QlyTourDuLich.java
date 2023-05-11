/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTo;

/**
 *
 * @author Huu Quoc Bao
 */
public class QlyTourDuLich implements Comparable<QlyTourDuLich>{
    public String tenTour;
    public String maTour;
    public String loaiTour;
    public String loaiLoaiTour;
    public int tongSoCho;
    public int soChoDu;
    public String diaDiemTour;
    public String diaDiemDi;
    public String diaDiemDen;
    public int soNgayDi;
    public int ngayDi;
    public int ngayVe;
    public long giaTour;
    public int ngayNgayDi;
    public int thangNgayDi;
    public int namNgayDi;
    public int ngayNgayVe;
    public int thangNgayVe;
    public int namNgayVe;

    
    
    public QlyTourDuLich(String tenTour, String maTour, String loaiTour, String loaiLoaiTour, int tongSoCho, int soChoDu, String diaDiemTour, String diaDiemDi, String diaDiemDen, int soNgayDi, int ngayDi, int ngayVe, long giaTour, int ngayNgayDi, int thangNgayDi, int namNgayDi, int ngayNgayVe, int thangNgayVe, int namNgayVe) {
        this.tenTour = tenTour;
        this.maTour = maTour;
        this.loaiTour = loaiTour;
        this.loaiLoaiTour = loaiLoaiTour;
        this.tongSoCho = tongSoCho;
        this.soChoDu = soChoDu;
        this.diaDiemTour = diaDiemTour;
        this.diaDiemDi = diaDiemDi;
        this.diaDiemDen = diaDiemDen;
        this.soNgayDi = soNgayDi;
        this.ngayDi = ngayDi;
        this.ngayVe = ngayVe;
        this.giaTour = giaTour;
        this.ngayNgayDi = ngayNgayDi;
        this.thangNgayDi = thangNgayDi;
        this.namNgayDi = namNgayDi;
        this.ngayNgayVe = ngayNgayVe;
        this.thangNgayVe = thangNgayVe;
        this.namNgayVe = namNgayVe;
    }

    public QlyTourDuLich(QlyTourDuLich x){
        tenTour = x.tenTour;
        maTour = x.maTour;
        loaiTour = x.loaiTour;
        loaiLoaiTour = x.loaiLoaiTour;
        tongSoCho = x.tongSoCho;
        soChoDu = x.soChoDu;
        diaDiemTour = x.diaDiemTour;
        diaDiemDi = x.diaDiemDi;
        diaDiemDen = x.diaDiemDen;
        soNgayDi = x.soNgayDi;
        ngayDi = x.ngayDi;
        ngayVe = x.ngayVe;
        giaTour = x.giaTour;
        ngayNgayDi = x.ngayNgayDi;
        thangNgayDi = x.thangNgayDi;
        namNgayDi = x.namNgayDi;
        ngayNgayVe = x.ngayNgayVe;
        thangNgayVe = x.thangNgayVe;
        namNgayVe = x.namNgayVe;
    }
    
    
    @Override
    public int compareTo(QlyTourDuLich o) {
        return this.maTour.compareTo(o.maTour);
    }

    public String getTenTour() {
        return tenTour;
    }

    public void setTenTour(String tenTour) {
        this.tenTour = tenTour;
    }

    public String getMaTour() {
        return maTour;
    }

    public void setMaTour(String maTour) {
        this.maTour = maTour;
    }

    public String getLoaiTour() {
        return loaiTour;
    }

    public void setLoaiTour(String loaiTour) {
        this.loaiTour = loaiTour;
    }

    public String getLoaiLoaiTour() {
        return loaiLoaiTour;
    }

    public void setLoaiLoaiTour(String loaiLoaiTour) {
        this.loaiLoaiTour = loaiLoaiTour;
    }

    public int getTongSoCho() {
        return tongSoCho;
    }

    public void setTongSoCho(int tongSoCho) {
        this.tongSoCho = tongSoCho;
    }

    public int getSoChoDu() {
        return soChoDu;
    }

    public void setSoChoDu(int soChoDu) {
        this.soChoDu = soChoDu;
    }

    public String getDiaDiemTour() {
        return diaDiemTour;
    }

    public void setDiaDiemTour(String diaDiemTour) {
        this.diaDiemTour = diaDiemTour;
    }

    public String getDiaDiemDi() {
        return diaDiemDi;
    }

    public void setDiaDiemDi(String diaDiemDi) {
        this.diaDiemDi = diaDiemDi;
    }

    public String getDiaDiemDen() {
        return diaDiemDen;
    }

    public void setDiaDiemDen(String diaDiemDen) {
        this.diaDiemDen = diaDiemDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

    public int getNgayDi() {
        return ngayDi;
    }

    public void setNgayDi(int ngayDi) {
        this.ngayDi = ngayDi;
    }

    public int getNgayVe() {
        return ngayVe;
    }

    public void setNgayVe(int ngayVe) {
        this.ngayVe = ngayVe;
    }

    public long getGiaTour() {
        return giaTour;
    }

    public void setGiaTour(long giaTour) {
        this.giaTour = giaTour;
    }

    public int getNgayNgayDi() {
        return ngayNgayDi;
    }

    public void setNgayNgayDi(int ngayNgayDi) {
        this.ngayNgayDi = ngayNgayDi;
    }

    public int getThangNgayDi() {
        return thangNgayDi;
    }

    public void setThangNgayDi(int thangNgayDi) {
        this.thangNgayDi = thangNgayDi;
    }

    public int getNamNgayDi() {
        return namNgayDi;
    }

    public void setNamNgayDi(int namNgayDi) {
        this.namNgayDi = namNgayDi;
    }

    public int getNgayNgayVe() {
        return ngayNgayVe;
    }

    public void setNgayNgayVe(int ngayNgayVe) {
        this.ngayNgayVe = ngayNgayVe;
    }

    public int getThangNgayVe() {
        return thangNgayVe;
    }

    public void setThangNgayVe(int thangNgayVe) {
        this.thangNgayVe = thangNgayVe;
    }

    public int getNamNgayVe() {
        return namNgayVe;
    }

    public void setNamNgayVe(int namNgayVe) {
        this.namNgayVe = namNgayVe;
    }
    
    
    
}
