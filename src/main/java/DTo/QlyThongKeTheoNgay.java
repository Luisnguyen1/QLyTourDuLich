/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTo;

/**
 *
 * @author Huu Quoc Bao
 */
public class QlyThongKeTheoNgay implements Comparable<QlyThongKeTheoNgay>{
    public String timKiemTheoNgay;

    public QlyThongKeTheoNgay(String timKiemTheoNgay) {
        this.timKiemTheoNgay = timKiemTheoNgay;
    }
     public QlyThongKeTheoNgay(QlyThongKeTheoNgay x)
     {
         timKiemTheoNgay = x.timKiemTheoNgay;
     }

    @Override
    public int compareTo(QlyThongKeTheoNgay o) {
        return this.timKiemTheoNgay.compareTo(o.timKiemTheoNgay);
    }

    public String getTimKiemTheoNgay() {
        return timKiemTheoNgay;
    }

    public void setTimKiemTheoNgay(String timKiemTheoNgay) {
        this.timKiemTheoNgay = timKiemTheoNgay;
    }
    
}
