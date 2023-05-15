package DTo;

import java.util.Scanner;

public class ChiTietHoaDonVe {
    private String matour;
    private String mave;
    private String maHD;
    private int soluongve;
    private long tienve;

    public ChiTietHoaDonVe() {
    }

    public ChiTietHoaDonVe(String matour, String mave, String maHD, int soluongve, long tienve) {
        this.matour = matour;
        this.mave = mave;
        this.maHD = maHD;
        this.soluongve = soluongve;
        this.tienve = tienve;
    }

    public String getMatour() {
        return matour;
    }

    public void setMatour(String matour) {
        this.matour = matour;
    }

    public String getMave() {
        return mave;
    }

    public void setMave(String mave) {
        this.mave = mave;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public int getSoluongve() {
        return soluongve;
    }

    public void setSoluongve(int soluongve) {
        this.soluongve = soluongve;
    }

    public long getTienve() {
        return tienve;
    }

    public void setTienve(long tienve) {
        this.tienve = tienve;
    }

    

    
    @Override
    public String toString() {
        return "ChiTietHoaDonVe{" +
                "soluongve=" + soluongve +
                ", tienve=" + tienve +
                '}';
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong ve: ");
        soluongve = sc.nextInt();
        System.out.println("Nhap tien ve: ");
        tienve = sc.nextLong();
    }

    public void xuat() {
        System.out.println("So luong ve: " + soluongve);
        System.out.println("Tien ve: " + tienve);
    }
}