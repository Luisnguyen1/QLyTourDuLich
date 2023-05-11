/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTo;

/**
 *
 * @author Huu Quoc Bao
 */
public class QlyThongKeTheoThang implements Comparable<QlyThongKeTheoThang>{
    public String timKiemTheoThang;

    public QlyThongKeTheoThang(String timKiemTheoThang) {
        this.timKiemTheoThang = timKiemTheoThang;
    }
     public QlyThongKeTheoThang(QlyThongKeTheoThang x)
     {
         timKiemTheoThang = x.timKiemTheoThang;
     }

    @Override
    public int compareTo(QlyThongKeTheoThang o) {
        return this.timKiemTheoThang.compareTo(o.timKiemTheoThang);
    }

    public String getTimKiemTheoThang() {
        return timKiemTheoThang;
    }

    public void setTimKiemTheoThang(String timKiemTheoThang) {
        this.timKiemTheoThang = timKiemTheoThang;
    }
}
