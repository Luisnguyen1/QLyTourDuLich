/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTo;

/**
 *
 * @author Huu Quoc Bao
 */
public class KhachSan implements Comparable<KhachSan>{
    public String diaDiemTour;
    public String tenKhachSan;
    public String sdt;
    public long tienKhachSan;
    public long tienPhong;
    public String maKhachSan;
   

    public KhachSan(String diaDiemTour, String tenKhachSan, String sdt, long tienKhachSan, long tienPhong, String maKhachSan) {
        this.diaDiemTour = diaDiemTour;
        this.tenKhachSan = tenKhachSan;
        this.sdt = sdt;
        this.tienKhachSan = tienKhachSan;
        this.tienPhong = tienPhong;
        this.maKhachSan = maKhachSan;
        
    }
    
    public KhachSan(KhachSan x){
        diaDiemTour = x.diaDiemTour;
        tenKhachSan = x.tenKhachSan;
        sdt = x.sdt;
        tienKhachSan = x.tienKhachSan;
        tienPhong = x.tienPhong;
        maKhachSan = x.maKhachSan;
      
    }

    @Override
    public int compareTo(KhachSan o) {
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
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

 
    
    
}
