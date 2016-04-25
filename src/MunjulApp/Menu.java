package MunjulApp;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "MENU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m"),
    @NamedQuery(name = "Menu.findByKodeMenu", query = "SELECT m FROM Menu m WHERE m.kodeMenu = :kodeMenu"),
    @NamedQuery(name = "Menu.findByNamaMenu", query = "SELECT m FROM Menu m WHERE m.namaMenu = :namaMenu"),
    @NamedQuery(name = "Menu.findByHarga", query = "SELECT m FROM Menu m WHERE m.harga = :harga"),
    @NamedQuery(name = "Menu.findByKuota", query = "SELECT m FROM Menu m WHERE m.kuota = :kuota")})
public class Menu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KODE_MENU")
    private String kodeMenu;
    @Column(name = "NAMA_MENU")
    private String namaMenu;
    @Column(name = "HARGA")
    private Integer harga;
    @Column(name = "KUOTA")
    private Short kuota;

    public Menu() {
    }

    public Menu(String kodeMenu) {
        this.kodeMenu = kodeMenu;
    }

    public String getKodeMenu() {
        return kodeMenu;
    }

    public void setKodeMenu(String kodeMenu) {
        this.kodeMenu = kodeMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Short getKuota() {
        return kuota;
    }

    public void setKuota(Short kuota) {
        this.kuota = kuota;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodeMenu != null ? kodeMenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.kodeMenu == null && other.kodeMenu != null) || (this.kodeMenu != null && !this.kodeMenu.equals(other.kodeMenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MunjulApp.Menu[ kodeMenu=" + kodeMenu + " ]";
    }
    
}
