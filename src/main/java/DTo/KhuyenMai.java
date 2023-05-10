package DTo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
public class KhuyenMai {
    private String makm;
    private String tenkm;
    private int ngaykm;
    private int hansudung;
    private long tiengiam;
    

    public KhuyenMai(String makm, String tenkm, int ngaykm, int hansudung, long tiengiam) {
        this.makm = makm;
        this.tenkm = tenkm;
        this.ngaykm = ngaykm;
        this.hansudung = hansudung;
        this.tiengiam = tiengiam;
    }
    
    public KhuyenMai(KhuyenMai x)
    {   
        makm = x.makm;
        tenkm = x.tenkm;
        ngaykm = x.ngaykm;
        hansudung = x.hansudung;
        tiengiam = x.tiengiam;
    }
    
    
    public String getMakm() {
        return makm;
    }

    public void setMakm(String makm) {
        this.makm = makm;
    }

    public String getTenkm() {
        return tenkm;
    }

    public void setTenkm(String tenkm) {
        this.tenkm = tenkm;
    }

    public Date getNgaykm() {
        return ngaykm;
    }

    public void setNgaykm(int ngaykm) {
        this.ngaykm = ngaykm;
    }

    public Date getHansudung() {
        return hansudung;
    }

    public void setHansudung(int hansudung) {
        this.hansudung = hansudung;
    }

    public long getTiengiam() {
        return tiengiam;
    }

    public void setTiengiam(long tiengiam) {
        this.tiengiam = tiengiam;
    }

    @Override
    public String toString() {
        return "KhuyenMai{" + "makm=" + makm + ", tenkm=" + tenkm + ", ngaykm=" + ngaykm + ", hansudung=" + hansudung + ", tiengiam=" + tiengiam + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.makm);
        hash = 59 * hash + Objects.hashCode(this.tenkm);
        hash = 59 * hash + Objects.hashCode(this.ngaykm);
        hash = 59 * hash + Objects.hashCode(this.hansudung);
        hash = 59 * hash + (int) (this.tiengiam ^ (this.tiengiam >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KhuyenMai other = (KhuyenMai) obj;
        if (this.tiengiam != other.tiengiam) {
            return false;
        }
        if (!Objects.equals(this.makm, other.makm)) {
            return false;
        }
        if (!Objects.equals(this.tenkm, other.tenkm)) {
            return false;
        }
        if (!Objects.equals(this.ngaykm, other.ngaykm)) {
            return false;
        }
        return Objects.equals(this.hansudung, other.hansudung);
    }

    
    
   
    
    public void nhap() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ma khuyen mai: ");
    makm = sc.nextLine();
    System.out.println("Nhap ten khuyen mai: ");
    tenkm = sc.nextLine();

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    try {
        System.out.println("Nhap ngay khuyen mai (dd/MM/yyyy): ");
        ngaykm = sdf.parse(sc.nextLine());
        System.out.println("Nhap han su dung (dd/MM/yyyy): ");
        hansudung = sdf.parse(sc.nextLine());
    } catch (ParseException ex) {
        System.out.println("Nhap sai dinh dang ngay thang");
    }

    System.out.println("Nhap tien giam: ");
    tiengiam = sc.nextLong();
}
    
    public void xuat()
    {
        System.out.println("Ma khuyen mai la: "+this.makm);
        System.out.println("Ten khuyen mai la: "+this.tenkm);
        System.out.println("Ngay khuyen mai la: "+this.ngaykm);
        System.out.println("Han su dung la: "+this.hansudung);
        System.out.println("Tien giam la: "+this.tiengiam);
    }
}
    
