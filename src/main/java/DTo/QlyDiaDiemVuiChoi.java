
package DTo;

/**
 *
 * @author Huu Quoc Bao
 */
public class QlyDiaDiemVuiChoi implements Comparable<QlyDiaDiemVuiChoi>{
    public String diaDiemTour;
    public String tenDiaDiem;
    public String maDiaDiem;

    @Override
    public int compareTo(QlyDiaDiemVuiChoi o) {
        return this.maDiaDiem.compareTo(o.maDiaDiem);
    }

    public QlyDiaDiemVuiChoi(String diaDiemTour, String tenDiaDiem, String maDiaDiem) {
        this.diaDiemTour = diaDiemTour;
        this.tenDiaDiem = tenDiaDiem;
        this.maDiaDiem = maDiaDiem;
    }
    
    public QlyDiaDiemVuiChoi(QlyDiaDiemVuiChoi x){
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
    
    
}
