/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTo;

/**
 *
 * @author Huu Quoc Bao
 */
public class QlyKhachHang implements Comparable<QlyKhachHang>{
    public String hoTen;
    public String maKhachHang;
    public String diaChi;
    public String sdt;
    public String email;

    public QlyKhachHang(String hoTen, String maKhachHang, String diaChi, String sdt, String email) {
        this.hoTen = hoTen;
        this.maKhachHang = maKhachHang;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
    }
    
    public QlyKhachHang(QlyKhachHang x){
        hoTen = x.hoTen;
        maKhachHang = x.maKhachHang;
        diaChi = x.diaChi;
        sdt = x.sdt;
        email = x.email;
    }

    @Override
    public int compareTo(QlyKhachHang o) {
        return this.maKhachHang.compareTo(o.maKhachHang);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
