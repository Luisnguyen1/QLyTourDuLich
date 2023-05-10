/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author Thanh Tran
 */
public class VeTour implements Comparable <VeTour>{
        public String mavetour;
        public String matour;
        public String makh;
        public long tiengiam;
        public int ngaydatve;
        public int hansudung;
        
         public VeTour (DTo.VeTour x){
            mavetour = x.mavetour;
            matour = x.matour;
            makh = x.makh;
            tiengiam = x.tiengiam;
            ngaydatve = x.ngaydatve;
            hansudung = x.hansudung;
        }
         
        public VeTour (String mavetour, String matour, String makh, long tiengiam, int ngaydatve, int hansudung){
            this.mavetour = mavetour;
            this.matour = matour;
            this.makh = makh;
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

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public long getTiengiam() {
        return tiengiam;
    }

    public void setTiengiam(long tiengiam) {
        this.tiengiam = tiengiam;
    }

    public int getNgaydatve() {
        return ngaydatve;
    }

    public void setNgaydatve(int ngaydatve) {
        this.ngaydatve = ngaydatve;
    }

    public int getHansudung() {
        return hansudung;
    }

    public void setHansudung(int hansudung) {
        this.hansudung = hansudung;
    }
    
    @Override
    public int compareTo(VeTour o) {
        return this.mavetour.compareTo(o.mavetour);
    }
}