package BUS;

import KetnoiSQL_DAL.config;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Thanh Tran
 */
public class VeTour implements Comparable<VeTour> {

    public String mavetour;
    public String matour;

    public long tiengiam;
    public Date ngaydatve;
    public Date hansudung;

    public VeTour(BUS.VeTour x) {
        mavetour = x.mavetour;
        matour = x.matour;

        tiengiam = x.tiengiam;
        ngaydatve = x.ngaydatve;
        hansudung = x.hansudung;
    }

    public VeTour(String mavetour, String matour, long tiengiam, Date ngaydatve, Date hansudung) {
        this.mavetour = mavetour;
        this.matour = matour;

        this.tiengiam = tiengiam;
        this.ngaydatve = ngaydatve;
        this.hansudung = hansudung;
    }

    public String getMavetour() {
        return mavetour;
    }

    public void setMavetour(String mavetour) {
        this.mavetour = mavetour;
    }

    public String getMatour() {
        return matour;
    }

    public void setMatour(String matour) {
        this.matour = matour;
    }

    public long getTiengiam() {
        return tiengiam;
    }

    public void setTiengiam(long tiengiam) {
        this.tiengiam = tiengiam;
    }

    public Date getNgaydatve() {
        return ngaydatve;
    }

    public void setNgaydatve(Date ngaydatve) {
        this.ngaydatve = ngaydatve;
    }

    public Date getHansudung() {
        return hansudung;
    }

    public void setHansudung(Date hansudung) {
        this.hansudung = hansudung;
    }

    @Override
    public int compareTo(VeTour o) {
        return this.mavetour.compareTo(o.mavetour);
    }
    private ArrayList<VeTour> danhSach = new ArrayList<VeTour>();
    config con = new config();

    public VeTour() {
        this.danhSach = con.layDL_VeTour(); //cach khai bao 1 arrayList
    }

    public VeTour traKH(int i) {
        return danhSach.get(i);
    }

    public VeTour traKH(String maKH) {
        for (VeTour vetour : danhSach) {
            if (maKH.equalsIgnoreCase(vetour.getMavetour())) {
                return vetour;
            }
        }
        return null;
    }

    public Long tinhTongTien(int Sl, String Ma) {
        Tour tour = new Tour();
        for (VeTour veTour : danhSach) {
            System.out.println(veTour.getMatour());

            return Sl * tour.traTour(veTour.getMatour()).getGiaTour();

        }
        return null;
    }

    /*public KhachHang(ArrayList<KhachHang> danhSach) {
    this.danhSach = danhSach;
    }*/
    public void themVeTour(VeTour kh) {
        this.danhSach.add(kh);
    }

    public void themVeTour(String mavetour, String matour, long tiengiam, Date ngaydatve, Date hansudung) {
        VeTour vt = new VeTour(mavetour, matour, tiengiam, ngaydatve, hansudung);
        this.danhSach.add(vt);
        con.UpdateSQL_VeTour(vt, 1, "null");
    }

    //4. Lay ra so luong khach hang trong danh sach
    public int laySoLuongVeTour() {
        return this.danhSach.size();
    }

    //7. Xoa mot khach hang ra khoi danh sach khach hang dua tren ma khach hang
    public boolean xoaVeTour(VeTour kh) {
        return this.danhSach.remove(kh);
    }

    public boolean xoaVeTour(String ma) {
        int i = 0;
        for (VeTour khachHang : danhSach) {
            if (ma.equalsIgnoreCase(khachHang.getMavetour())) {
                this.danhSach.remove(i);
                con.UpdateSQL_VeTour(khachHang, 2, "null");
                return true;
            }
            i++;
        }

        return false;

    }

    public boolean suaVeTour(String maOld, String mavetour, String matour, long tiengiam, Date ngaydatve, Date hansudung) {
        int i = 0;
        for (VeTour khachHang : danhSach) {
            if (maOld.equalsIgnoreCase(khachHang.getMavetour())) {
                this.danhSach.get(i).setMatour(matour);
                this.danhSach.get(i).setTiengiam(tiengiam);
                this.danhSach.get(i).setNgaydatve(ngaydatve);
                this.danhSach.get(i).setHansudung(hansudung);

                con.UpdateSQL_VeTour(this.danhSach.get(i), 3, maOld);

                return true;
            }
            i++;
        }

        return false;

    }

    //8. Tim kiem tat ca khach hang dua tren Ma khach hang duoc nhap tu ban phim
    public void timVeTour(String ma) {
        for (VeTour khachHang : danhSach) {
            if (khachHang.getMavetour().contains(ma));
            System.out.println(khachHang);
        }
    }

    public ArrayList<VeTour> timKhachHangUnlimit(String ma) {
        int i = 0;
        ArrayList<VeTour> dskh = new ArrayList<>();
        for (VeTour khachHang : danhSach) {
            if (khachHang.getMavetour().equalsIgnoreCase(ma)) {
                dskh.add(khachHang);
            }
            if (khachHang.getMatour().equalsIgnoreCase(ma)) {
                dskh.add(khachHang);
            }
            String TienGiam = Long.toString(khachHang.getTiengiam());
            if (TienGiam.equalsIgnoreCase(ma)) {
                dskh.add(khachHang);
            }
            Date ngayDatVe = khachHang.getNgaydatve();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String ngayDatVeString = sdf.format(ngayDatVe);
            if (ngayDatVeString.equalsIgnoreCase(ma)) {
                dskh.add(khachHang);
            }
            Date hansudung = khachHang.getHansudung();
            SimpleDateFormat ccc = new SimpleDateFormat("dd/MM/yyyy");
            String hanSuDung = ccc.format(hansudung);
            if (hanSuDung.equalsIgnoreCase(ma)) {
                dskh.add(khachHang);
            }
            i++;
        }
        if (dskh != null) {
            return dskh;
        }
        return null;
    }
}
