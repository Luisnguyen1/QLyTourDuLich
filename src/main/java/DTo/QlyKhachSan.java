/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTo;

/**
 *
 * @author Huu Quoc Bao
 */
public class QlyKhachSan implements Comparable<QlyKhachSan>{
    public String diaDiemTour;
    public String tenKhachSan;
    public long sdt;
    public long tienKhachSan;
    public long tienPhong;
    public String maKhachSan;
    public String chonDiaDiemTour;
    public String chonTenKhachSan;
    public String chonMaKhachSan;

    public QlyKhachSan(String diaDiemTour, String tenKhachSan, long sdt, long tienKhachSan, long tienPhong, String maKhachSan, String choDiaDiemTour, String chonTenKhachSan, String chonMaKhachSan) {
        this.diaDiemTour = diaDiemTour;
        this.tenKhachSan = tenKhachSan;
        this.sdt = sdt;
        this.tienKhachSan = tienKhachSan;
        this.tienPhong = tienPhong;
        this.maKhachSan = maKhachSan;
        this.chonDiaDiemTour = choDiaDiemTour;
        this.chonTenKhachSan = chonTenKhachSan;
        this.chonMaKhachSan = chonMaKhachSan;
    }
    
    public QlyKhachSan(QlyKhachSan x){
        diaDiemTour = x.diaDiemTour;
        tenKhachSan = x.tenKhachSan;
        sdt = x.sdt;
        tienKhachSan = x.tienKhachSan;
        tienPhong = x.tienPhong;
        maKhachSan = x.maKhachSan;
        chonDiaDiemTour = x.chonDiaDiemTour;
        chonTenKhachSan = x.chonTenKhachSan;
        chonMaKhachSan = x.chonMaKhachSan;
  
    }

    @Override
    public int compareTo(QlyKhachSan o) {
        return this.maKhachSan.compareTo(o.maKhachSan);
    }

    public String getDiaDiemTour() {
        return diaDiemTour;
    }

    public void setDiaDiemTour(String diaDiemTour) {
        this.diaDiemTour = diaDiemTour;
    }

    public String getTenKhachSan() {
        return tenKhachSan;
    }

    public void setTenKhachSan(String tenKhachSan) {
        this.tenKhachSan = tenKhachSan;
    }

    public long getSdt() {
        return sdt;
    }

    public void setSdt(long sdt) {
        this.sdt = sdt;
    }

    public long getTienKhachSan() {
        return tienKhachSan;
    }

    public void setTienKhachSan(long tienKhachSan) {
        this.tienKhachSan = tienKhachSan;
    }

    public long getTienPhong() {
        return tienPhong;
    }

    public void setTienPhong(long tienPhong) {
        this.tienPhong = tienPhong;
    }

    public String getMaKhachSan() {
        return maKhachSan;
    }

    public void setMaKhachSan(String maKhachSan) {
        this.maKhachSan = maKhachSan;
    }

    public String getChonDiaDiemTour() {
        return chonDiaDiemTour;
    }

    public void setChonDiaDiemTour(String chonDiaDiemTour) {
        this.chonDiaDiemTour = chonDiaDiemTour;
    }

    public String getChonTenKhachSan() {
        return chonTenKhachSan;
    }

    public void setChonTenKhachSan(String chonTenKhachSan) {
        this.chonTenKhachSan = chonTenKhachSan;
    }

    public String getChonMaKhachSan() {
        return chonMaKhachSan;
    }

    public void setChonMaKhachSan(String chonMaKhachSan) {
        this.chonMaKhachSan = chonMaKhachSan;
    }
    
    
}
