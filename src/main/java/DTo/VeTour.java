
package DTo;
import java.util.Date;
/**
 *
 * @author Thanh Tran
 */
public class VeTour implements Comparable <VeTour>{
        public String mavetour;
        public String matour;
      
        public long tiengiam;
        public Date ngaydatve;
        public Date hansudung;
        
         public VeTour (DTo.VeTour x){
            mavetour = x.mavetour;
            matour = x.matour;
          
            tiengiam = x.tiengiam;
            ngaydatve = x.ngaydatve;
            hansudung = x.hansudung;
        }

    public VeTour() {
    }
         
        public VeTour (String mavetour, String matour, long tiengiam, Date ngaydatve, Date hansudung){
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
}
