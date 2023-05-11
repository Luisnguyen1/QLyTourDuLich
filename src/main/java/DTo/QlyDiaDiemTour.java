package DTo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
/**
 *
 * @author Huu Quoc Bao
 */
public class QlyDiaDiemTour implements Comparable<QlyDiaDiemTour> {
    public String maDiaDiem;
    public String khuVuc;
    public String tinhVaThanhPho;

    @Override
    public int compareTo(QlyDiaDiemTour o) {
        return this.maDiaDiem.compareTo(o.maDiaDiem);
    }

    public QlyDiaDiemTour(String maDiaDiem, String khuVuc, String tinhVaThanhPho) {
        this.maDiaDiem = maDiaDiem;
        this.khuVuc = khuVuc;
        this.tinhVaThanhPho = tinhVaThanhPho;
    }

    public QlyDiaDiemTour(QlyDiaDiemTour x){
        maDiaDiem = x.maDiaDiem;
        khuVuc = x.khuVuc;
        tinhVaThanhPho = x.tinhVaThanhPho;
    }

    public String getMaDiaDiem() {
        return maDiaDiem;
    }

    public void setMaDiaDiem(String maDiaDiem) {
        this.maDiaDiem = maDiaDiem;
    }

    public String getKhuVuc() {
        return khuVuc;
    }

    public void setKhuVuc(String khuVuc) {
        this.khuVuc = khuVuc;
    }

    public String getTinhVaThanhPho() {
        return tinhVaThanhPho;
    }

    public void setTinhVaThanhPho(String tinhVaThanhPho) {
        this.tinhVaThanhPho = tinhVaThanhPho;
    }
 
}
