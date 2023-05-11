/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTo;

/**
 *
 * @author Huu Quoc Bao
 */
public class QlyPhuongTien implements Comparable<QlyPhuongTien>{
    public String loaiPhuongTien;
    public String tenPhuongTien;
    public int tongSoCho;
    public String maPhuongTien;
    public int soChoDu;
    public String loaiLoaiPhuongTien;

    public QlyPhuongTien(String loaiPhuongTien, String tenPhuongTien, int tongSoCho, String maPhuongTien, int soChoDu, String loaiLoaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.tenPhuongTien = tenPhuongTien;
        this.tongSoCho = tongSoCho;
        this.maPhuongTien = maPhuongTien;
        this.soChoDu = soChoDu;
        this.loaiLoaiPhuongTien = loaiLoaiPhuongTien;
    }
    
    public QlyPhuongTien(QlyPhuongTien x)
    {
        loaiPhuongTien = x.loaiPhuongTien;
        tenPhuongTien = x.tenPhuongTien;
        tongSoCho = x.tongSoCho;
        maPhuongTien = x.maPhuongTien;
        soChoDu = x.soChoDu;
        loaiLoaiPhuongTien = x.loaiLoaiPhuongTien;
    }

    @Override
    public int compareTo(QlyPhuongTien o) {
        return this.maPhuongTien.compareTo(o.maPhuongTien);
    }

    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }

    public void setLoaiPhuongTien(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }

    public String getTenPhuongTien() {
        return tenPhuongTien;
    }

    public void setTenPhuongTien(String tenPhuongTien) {
        this.tenPhuongTien = tenPhuongTien;
    }

    public int getTongSoCho() {
        return tongSoCho;
    }

    public void setTongSoCho(int tongSoCho) {
        this.tongSoCho = tongSoCho;
    }

    public String getMaPhuongTien() {
        return maPhuongTien;
    }

    public void setMaPhuongTien(String maPhuongTien) {
        this.maPhuongTien = maPhuongTien;
    }

    public int getSoChoDu() {
        return soChoDu;
    }

    public void setSoChoDu(int soChoDu) {
        this.soChoDu = soChoDu;
    }

    public String getLoaiLoaiPhuongTien() {
        return loaiLoaiPhuongTien;
    }

    public void setLoaiLoaiPhuongTien(String loaiLoaiPhuongTien) {
        this.loaiLoaiPhuongTien = loaiLoaiPhuongTien;
    }
    
    
    
}
