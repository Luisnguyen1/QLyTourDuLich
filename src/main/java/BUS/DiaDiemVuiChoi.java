
package BUS;


import KetnoiSQL_DAL.config;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
/**
 *
 * @author Huu Quoc Bao
 */
public class DiaDiemVuiChoi implements Comparable<DiaDiemVuiChoi>{
    public String diaDiemTour;
    public String tenDiaDiem;
    public String maDiaDiem;

    @Override
    public int compareTo(DiaDiemVuiChoi o) {
        return this.maDiaDiem.compareTo(o.maDiaDiem);
    }

    
    public DiaDiemVuiChoi(String diaDiemTour, String tenDiaDiem, String maDiaDiem) {
        this.diaDiemTour = diaDiemTour;
        this.tenDiaDiem = tenDiaDiem;
        this.maDiaDiem = maDiaDiem;
    }
    
    public DiaDiemVuiChoi(DiaDiemVuiChoi x){
        diaDiemTour = x.diaDiemTour;
        tenDiaDiem = x.tenDiaDiem;
        maDiaDiem = x.maDiaDiem;
    }

    public String getDiaDiemTour() {
        return diaDiemTour;
    }

    public void setDiaDiemTour(String diaDiemTour) {
        this.diaDiemTour = diaDiemTour;
    }

    public String getTenDiaDiem() {
        return tenDiaDiem;
    }

    public void setTenDiaDiem(String tenDiaDiem) {
        this.tenDiaDiem = tenDiaDiem;
    }

    public String getMaDiaDiem() {
        return maDiaDiem;
    }

    public void setMaDiaDiem(String maDiaDiem) {
        this.maDiaDiem = maDiaDiem;
    }
    
    private ArrayList<DiaDiemVuiChoi> danhSach = new ArrayList<>();
    private config con = new config();

    public DiaDiemVuiChoi(){
        this.danhSach = con.LayDL_DiaDiemVuiChoi();
    }
    
    public DiaDiemVuiChoi traDiaDiem(int i) {
        return danhSach.get(i);
    }

    public DiaDiemVuiChoi traDiaDiem(String maDD) {
        for (DiaDiemVuiChoi diaDiem : danhSach) {
            if (maDD.equalsIgnoreCase(diaDiem.getMaDiaDiem())) {
                return diaDiem;
            }
        }
        return null;
    }

    public void themDiaDiem(DiaDiemVuiChoi diaDiem) {
        this.danhSach.add(diaDiem);
    }

    public void themDiaDiem(String diaDiemTour, String tenDiaDiem, String maDiaDiem) {
        DiaDiemVuiChoi diaDiem = new DiaDiemVuiChoi(diaDiemTour, tenDiaDiem, maDiaDiem);
        this.danhSach.add(diaDiem);
        con.UpdateSQL_DDVC(diaDiem, 1, "null");
    }

    public int laySoLuongDiaDiem() {
        return this.danhSach.size();
    }

    public boolean xoaDiaDiem(DiaDiemVuiChoi diaDiem) {
        return this.danhSach.remove(diaDiem);
    }

    public boolean xoaDiaDiem(String maDD) {
        int i = 0;
        for (DiaDiemVuiChoi diaDiem : danhSach) {
            if (maDD.equalsIgnoreCase(diaDiem.getMaDiaDiem())) {
                this.danhSach.remove(i);
                con.UpdateSQL_DDVC(diaDiem, 2, "null");
                return true;
            }
            i++;
        }
        return false;
    }

    public boolean suaDiaDiem(String maOld, String diaDiemTour, String tenDiaDiem, String maDiaDiem) {
        int i = 0;
        for (DiaDiemVuiChoi diaDiem : danhSach) {
            if (maOld.equalsIgnoreCase(diaDiem.getMaDiaDiem())) {
                this.danhSach.get(i).setDiaDiemTour(diaDiemTour);
                this.danhSach.get(i).setTenDiaDiem(tenDiaDiem);
                this.danhSach.get(i).setMaDiaDiem(maDiaDiem);
                con.UpdateSQL_DDVC(this.danhSach.get(i), 3, maOld);
                return true;
            }
            i++;
        }
        return false;
    }

    public void timDiaDiem(String maDD) {
        for (DiaDiemVuiChoi diaDiem : danhSach) {
            if (diaDiem.getMaDiaDiem().contains(maDD)) {
                System.out.println(diaDiem);
            }
        }
    }

    public ArrayList<DiaDiemVuiChoi> timDiaDiemUnlimit(String maDD) {
        ArrayList<DiaDiemVuiChoi> dsDiaDiem = new ArrayList<>();
        for (DiaDiemVuiChoi diaDiem : danhSach) {
            if (diaDiem.getMaDiaDiem().equalsIgnoreCase(maDD)) {
                dsDiaDiem.add(diaDiem);
            }
            if (diaDiem.getTenDiaDiem().equalsIgnoreCase(maDD)) {
                dsDiaDiem.add(diaDiem);
            }
            if (diaDiem.getDiaDiemTour().equalsIgnoreCase(maDD)) {
                dsDiaDiem.add(diaDiem);
            }
        }
        return dsDiaDiem;
    }
}
